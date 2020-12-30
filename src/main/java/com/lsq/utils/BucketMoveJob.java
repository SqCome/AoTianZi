package com.lsq.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lsq.entity.Bucket;
import com.lsq.entity.JobData;
import com.lsq.entity.ParentJob;
import com.lsq.entity.Point;
import com.lsq.mapper.BucketMapper;
import org.apache.ibatis.session.SqlSession;

import java.lang.Math;
import java.util.*;

public class BucketMoveJob {

    /**
     *
     * @param jobNum
     */
    public static void sendBucketMoveJob(int jobNum){
        SqlSession sqlSession = MybatisUtils.getSqlSession2();
        BucketMapper mapper = sqlSession.getMapper(BucketMapper.class);
        List<Bucket> bucketList = mapper.getBucketInList();
        List<Point> points = GetPoint.getPoints();
        List<Point> station_working = GetPoint.getPointsByType(points, "STATION_WORKING");
        ParentJob parentJob = new ParentJob();
        JobData jobData = new JobData();
        for (int i = 0; i < jobNum; i++) {
            parentJob.setJobType("BUCKET_MOVE");
            parentJob.setNeedOperation(true);
            String jobId = "LSQ_"+UUID.randomUUID().toString();
            parentJob.setRobotJobId(jobId);
            jobData.setEndPoint(station_working.get((int)(Math.random()*station_working.size())).getPoint_code());
            jobData.setBucketCode(bucketList.get((int)(Math.random()*bucketList.size())).getBucket_code());
            jobData.setLetDownFlag(1);
            jobData.setWorkFace((int)(Math.random()*4+1));
            jobData.setNeedReset(true);
            parentJob.setJobData(jobData);
            List<ParentJob> bucketMoveJobs = new ArrayList<ParentJob>();
            bucketMoveJobs.add(parentJob);
            String bucketMoveJson = JSON.toJSONString(bucketMoveJobs);
            HttpUtils.doPost("http://172.31.238.230:30955/api/wcs/standardized/robot/job/submit", bucketMoveJson);
        }
    }
}

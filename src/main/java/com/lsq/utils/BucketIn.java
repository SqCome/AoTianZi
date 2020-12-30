package com.lsq.utils;

import com.alibaba.fastjson.JSON;
import com.lsq.entity.Bucket;
import com.lsq.entity.BucketInJob;
import com.lsq.entity.Point;
import com.lsq.mapper.BucketMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BucketIn {
    public static void buckerIn(){
        List<Point> points = GetPoint.getPoints();
        List<Point> storage = GetPoint.getPointsByType(points, "STORAGE");
        SqlSession sqlSession = MybatisUtils.getSqlSession2();
        BucketMapper mapper = sqlSession.getMapper(BucketMapper.class);
        List<Bucket> bucketList = mapper.getBucketOutList();
        for (int i = 0; i < storage.size() && i<bucketList.size(); i++) {
            BucketInJob bucketInJob = new BucketInJob();
            bucketInJob.setBucketCode(bucketList.get(i).getBucket_code());
            bucketInJob.setPointCode(storage.get(i).getPoint_code());
            String bukeetInJson = JSON.toJSONString(bucketInJob);
            HttpUtils.doPost("http://172.31.238.228:30955/api/wcs/standardized/bucket/in",bukeetInJson);
        }
        sqlSession.close();
    }
}

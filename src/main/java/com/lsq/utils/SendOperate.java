package com.lsq.utils;

import com.alibaba.fastjson.JSON;
import com.lsq.entity.BucketRobotJob;
import com.lsq.entity.OperateJob;
import com.lsq.mapper.OperateMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SendOperate {
    public static void sendOperate(){
        SqlSession sqlSession = MybatisUtils.getSqlSession3();
        OperateMapper operateMapper = sqlSession.getMapper(OperateMapper.class);
        List<BucketRobotJob> bucketRobotJobs = operateMapper.getOperateList();
        OperateJob operateJob = new OperateJob();
        for (BucketRobotJob bucketRobotJob : bucketRobotJobs) {
            operateJob.setRobotJobId(bucketRobotJob.getRobot_job_id());
            operateJob.setWarehouseId(bucketRobotJob.getWarehouse_id());
            String operateJson = JSON.toJSONString(operateJob);
            System.out.println(operateJson);
            HttpUtils.doPost("http://172.31.238.230:30955/api/wcs/standardized/operation/notice",operateJson);
        }
    }
}

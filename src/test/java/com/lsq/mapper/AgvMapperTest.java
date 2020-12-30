package com.lsq.mapper;

import com.lsq.entity.*;
import com.lsq.utils.*;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import java.util.List;

public class AgvMapperTest {
    @Test
    public void test(){
//        获得session对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

//      方法一：getMapper
        MapMapper mapper = sqlSession.getMapper(MapMapper.class);
        MapClass map = mapper.getMap();
        System.out.println(map);
//        关闭sqlSession
        sqlSession.close();
    }


    @Test
    public void testRegisterAgv(){
        String agvListJson = Agv2Json.getAgvJson();
        HttpUtils httpUtils = new HttpUtils();
        httpUtils.doPost("http://172.31.238.230:30416/DriveUnitSimulation/RegisteredAgv",agvListJson);
//        httpUtils.doPost("http://172.31.238.230:30161/DriveUnitSimulation/RegisteredAgv","[\"CARRIER_192168001019\"]");
    }

    @Test
    public void testUnregisterAgv(){
        String agvListJson = Agv2Json.getAgvJson();
        HttpUtils httpUtils = new HttpUtils();
        httpUtils.doPost("http://172.31.238.230:30416/DriveUnitSimulation/UnregisteredAgv",agvListJson);
//        httpUtils.doPost("http://172.31.238.230:30161/DriveUnitSimulation/UnregisteredAgv","[\"CARRIER_192168001019\"]");
    }

    @Test
    public void testQueryBucket(){
//        获得session对象
        SqlSession sqlSession = MybatisUtils.getSqlSession2();

//      方法一：getMapper
        BucketMapper mapper = sqlSession.getMapper(BucketMapper.class);
        List<Bucket> bucketList = mapper.getBucketOutList();
        for (Bucket bucket : bucketList) {
            System.out.println(bucket);
        }
//        关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void testBucketIn(){
        BucketIn.buckerIn();
    }

    @Test
    public void testBucketMove(){
        BucketMoveJob.sendBucketMoveJob(4);
    }

    @Test
    public void testOperaate(){
        SendOperate.sendOperate();
    }
}

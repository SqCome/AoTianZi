package com.lsq.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lsq.entity.*;
import com.lsq.mapper.AgvMapper;
import com.lsq.mapper.BucketMapper;
import com.lsq.mapper.MapMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class GetPoint {
    /**
     * 这个方法用于从地图json数据中获取点的信息，暂时只有一个库区时可以用
     * @return  List<Point>
     */
    public static List<Point> getPoints(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

//      方法一：getMapper
        MapMapper mapper = sqlSession.getMapper(MapMapper.class);
        MapClass map = mapper.getMap();
//        关闭sqlSession
        sqlSession.close();
        JSONObject jsonObject = JSON.parseObject(map.getJson_data());
        JSONArray zoneList = jsonObject.getJSONArray("zoneList");
        String pointJson =  zoneList.getString(0);
        JSONObject jsonObject1 = JSON.parseObject(pointJson);
        JSONArray pointArray = jsonObject1.getJSONArray("pointList");
        String pointJson1 = JSONObject.toJSONString(pointArray);
//        System.out.println(pointList.size());
//        System.out.println(pointList);
        List<Point> points = JSONArray.parseArray(pointJson1,Point.class);
//        for (Point point : points) {
//            System.out.println(point);
//        }
        return points;
    }


    /**
     * 这个方法用于通过点类型来获取点的信息
     * @param points
     * @param type
     * @return List<Point>
     */
    public static List<Point> getPointsByType(List<Point> points,String type){
        List<Point> needPoints = new ArrayList<Point>();
        for (Point point : points) {
            if (point.getPoint_type().equals(type)){
                System.out.println(point);
                needPoints.add(point);
            }
        }
        return needPoints;
    }
}

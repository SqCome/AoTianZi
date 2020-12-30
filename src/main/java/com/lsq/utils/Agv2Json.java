package com.lsq.utils;

import com.lsq.entity.Agv;
import com.lsq.mapper.AgvMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Agv2Json {
    public static String getAgvJson(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();  //得到sqlsession
        AgvMapper mapper = sqlSession.getMapper(AgvMapper.class);
        List<Agv> agvList = mapper.getAgvList();        //利用配置文件的方式来获取查询结果
        String agvListJsonOld = "[";
        for (Agv agv:agvList) {
            agvListJsonOld += "\"" + agv.getAgv_id() + "\",";
        }
//        System.out.println(agvListJson);
        String  agvListJson= agvListJsonOld.substring(0, agvListJsonOld.length() - 1);  //在使用String类型的数据时，需要注意方法返回的是新的String，原来的并没有改变
//        System.out.println(agvListJson);
        agvListJson += "]";
        System.out.println(agvListJson);
        sqlSession.close();
        return agvListJson;
    }

}

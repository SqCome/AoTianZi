package com.lsq.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory1;
    private static SqlSessionFactory sqlSessionFactory2;
    private static SqlSessionFactory sqlSessionFactory3;
    static {
        try {
            //先获取sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            InputStream inputStream1 = Resources.getResourceAsStream(resource);
            InputStream inputStream2 = Resources.getResourceAsStream(resource);
            sqlSessionFactory1 = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSessionFactory2 = new SqlSessionFactoryBuilder().build(inputStream1,"bucket");
            sqlSessionFactory3 = new SqlSessionFactoryBuilder().build(inputStream2,"wcs_g2p");
//           以上不同的sqlSessionFactory是为了链接不同的数据库，而用了不同的enviroment，用enviroment的id属性来标定sqlSessionFactory
//            用哪个环境
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //有了factory要获得实例来用于数据库操作
    public static SqlSession getSqlSession(){
        return sqlSessionFactory1.openSession();
    }
    public static SqlSession getSqlSession2(){
        return sqlSessionFactory2.openSession();
    }
    public static SqlSession getSqlSession3(){
        return sqlSessionFactory3.openSession();
    }
}

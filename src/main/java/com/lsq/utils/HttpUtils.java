package com.lsq.utils;



import com.alibaba.fastjson.JSON;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpUtils {


    /**
     *
     * @param url
     * @param parm
     */
    public static void doPost(String url,String parm){

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-Type", "application/json");
        String charSet = "UTF-8";
        if(parm!=null && !parm.equals("")){
            StringEntity entity = new StringEntity(parm, charSet);
            httpPost.setEntity(entity);
        }
        CloseableHttpResponse response = null;
        try {
            response = httpclient.execute(httpPost);
            HttpEntity responseEntity = response.getEntity();
            String jsonString = EntityUtils.toString(responseEntity);
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

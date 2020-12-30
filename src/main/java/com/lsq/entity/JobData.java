package com.lsq.entity;

public class JobData {
    String bucketCode;
    int workFace;
    String endArea;
    String endPoint;
    int letDownFlag;
    boolean needReset;
    boolean isAgvRelay;
    String startPoint;

    public String getBucketCode() {
        return bucketCode;
    }

    public void setBucketCode(String bucketCode) {
        this.bucketCode = bucketCode;
    }

    public int getWorkFace() {
        return workFace;
    }

    public void setWorkFace(int workFace) {
        this.workFace = workFace;
    }

    public String getEndArea() {
        return endArea;
    }

    public void setEndArea(String endArea) {
        this.endArea = endArea;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public int getLetDownFlag() {
        return letDownFlag;
    }

    public void setLetDownFlag(int letDownFlag) {
        this.letDownFlag = letDownFlag;
    }

    public boolean isNeedReset() {
        return needReset;
    }

    public void setNeedReset(boolean needReset) {
        this.needReset = needReset;
    }

    public boolean isAgvRelay() {
        return isAgvRelay;
    }

    public void setAgvRelay(boolean agvRelay) {
        isAgvRelay = agvRelay;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    @Override
    public String toString() {
        return "JobData{" +
                "bucketCode='" + bucketCode + '\'' +
                ", workFace=" + workFace +
                ", endArea='" + endArea + '\'' +
                ", endPoint='" + endPoint + '\'' +
                ", letDownFlag=" + letDownFlag +
                ", needReset=" + needReset +
                ", isAgvRelay=" + isAgvRelay +
                ", startPoint='" + startPoint + '\'' +
                '}';
    }
}

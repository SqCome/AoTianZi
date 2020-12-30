package com.lsq.entity;

public class BucketInJob {
    String bucketCode;
    String pointCode;
    int topFace = 1;
    int warehouseId = 1;

    public String getBucketCode() {
        return bucketCode;
    }

    public void setBucketCode(String bucketCode) {
        this.bucketCode = bucketCode;
    }

    public String getPointCode() {
        return pointCode;
    }

    public void setPointCode(String pointCode) {
        this.pointCode = pointCode;
    }

    public int getTopFace() {
        return topFace;
    }

    public void setTopFace(int topFace) {
        this.topFace = topFace;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    @Override
    public String toString() {
        return "BucketInJob{" +
                "bucketCode='" + bucketCode + '\'' +
                ", pointCode='" + pointCode + '\'' +
                ", topFace=" + topFace +
                ", warehouseId=" + warehouseId +
                '}';
    }
}

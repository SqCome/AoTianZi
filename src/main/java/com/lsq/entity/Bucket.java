package com.lsq.entity;

public class Bucket {
    private String bucket_code;
    private String zone_code;
    private String zone_id;

    public String getBucket_code() {
        return bucket_code;
    }

    public void setBucket_code(String bucket_code) {
        this.bucket_code = bucket_code;
    }

    public String getZone_code() {
        return zone_code;
    }

    public void setZone_code(String zone_code) {
        this.zone_code = zone_code;
    }

    public String getZone_id() {
        return zone_id;
    }

    public void setZone_id(String zone_id) {
        this.zone_id = zone_id;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "bucket_code='" + bucket_code + '\'' +
                ", zone_code='" + zone_code + '\'' +
                ", zone_id='" + zone_id + '\'' +
                '}';
    }
}

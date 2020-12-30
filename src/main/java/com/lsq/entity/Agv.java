package com.lsq.entity;

public class Agv {
    private String agv_code;
    private String agv_id;
    private int warehouse_id;
    private String zone_code;

    public Agv() {
    }

    public Agv(String agv_code,String agv_id, int warehouse_id, String zone_code) {
        this.agv_code = agv_code;
        this.agv_id = agv_id;
        this.warehouse_id = warehouse_id;
        this.zone_code = zone_code;
    }

    public String getAgv_code() {
        return agv_code;
    }

    public void setAgv_code(String agv_code) {
        this.agv_code = agv_code;
    }

    public String getAgv_id() {
        return agv_id;
    }

    public void setAgv_id(String agv_id) {
        this.agv_id = agv_id;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public String getZone_code() {
        return zone_code;
    }

    public void setZone_code(String zone_code) {
        this.zone_code = zone_code;
    }

    @Override
    public String toString() {
        return "Agv{" +
                "agv_code='" + agv_code + '\'' +
                ",agv_id=" + agv_id + '\'' +
                ", warehouse_id=" + warehouse_id +
                ", zone_code='" + zone_code + '\'' +
                '}';
    }
}

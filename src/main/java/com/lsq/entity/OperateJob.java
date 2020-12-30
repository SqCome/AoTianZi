package com.lsq.entity;

public class OperateJob {
    String robotJobId;
    int warehouseId;
    boolean nullflag= true;

    public String getRobotJobId() {
        return robotJobId;
    }

    public void setRobotJobId(String robotJobId) {
        this.robotJobId = robotJobId;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public boolean isNullflag() {
        return nullflag;
    }

    public void setNullflag(boolean nullflag) {
        this.nullflag = nullflag;
    }

    @Override
    public String toString() {
        return "OperateJob{" +
                "robotJobId='" + robotJobId + '\'' +
                ", warehouseId=" + warehouseId +
                ", nullflag=" + nullflag +
                '}';
    }
}

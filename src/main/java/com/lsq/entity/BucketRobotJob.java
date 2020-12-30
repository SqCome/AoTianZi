package com.lsq.entity;

public class BucketRobotJob {
      String robot_job_id;
      int warehouse_id;

    public String getRobot_job_id() {
        return robot_job_id;
    }

    public void setRobot_job_id(String robot_job_id) {
        this.robot_job_id = robot_job_id;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    @Override
    public String toString() {
        return "BucketRobotJob{" +
                "robot_job_id='" + robot_job_id + '\'' +
                ", warehouse_id='" + warehouse_id + '\'' +
                '}';
    }
}

package com.lsq.entity;

public class ParentJob {
    /**
     * 任务号，全局唯一
     * */
    String robotJobId;
    /**
     * 任务优先级，数字越大越优先
     */
    int jobPriority = 99;
    /**
     * 任务优先类型，1为强制优先，0为普通任务
     */
    int jobPriorityType = 0;
    /**
     * 下发任务类型不同，所需要的参数不同
     */
    JobData jobData;
    /**
     * 是否需要实操
     */
    boolean needOperation;
    /**
     * 任务类型，如BUCKET_MOVE,NO_VERIFY_BUCKET_MOVE等
     */
    String jobType;
    int warehouseId = 1;

    public String getRobotJobId() {
        return robotJobId;
    }

    public void setRobotJobId(String robotJobId) {
        this.robotJobId = robotJobId;
    }

    public int getJobPriority() {
        return jobPriority;
    }

    public void setJobPriority(int jobPriority) {
        this.jobPriority = jobPriority;
    }

    public int getJobPriorityType() {
        return jobPriorityType;
    }

    public void setJobPriorityType(int jobPriorityType) {
        this.jobPriorityType = jobPriorityType;
    }

    public JobData getJobData() {
        return jobData;
    }

    public void setJobData(JobData jobData) {
        this.jobData = jobData;
    }

    public boolean isNeedOperation() {
        return needOperation;
    }

    public void setNeedOperation(boolean needOperation) {
        this.needOperation = needOperation;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    @Override
    public String toString() {
        return "ParentJob{" +
                "robotJobId='" + robotJobId + '\'' +
                ", jobPriority=" + jobPriority +
                ", jobPriorityType=" + jobPriorityType +
                ", jobData='" + jobData + '\'' +
                ", needOperation='" + needOperation + '\'' +
                ", jobType='" + jobType + '\'' +
                ", warehouseId=" + warehouseId +
                '}';
    }
}

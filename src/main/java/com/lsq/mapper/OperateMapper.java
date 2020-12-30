package com.lsq.mapper;

import com.lsq.entity.BucketRobotJob;
import com.lsq.entity.OperateJob;

import java.util.List;

public interface OperateMapper {
    List<BucketRobotJob> getOperateList();
}

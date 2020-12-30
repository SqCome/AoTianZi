package com.lsq.mapper;

import com.lsq.entity.Bucket;

import java.util.List;

public interface BucketMapper {
    List<Bucket> getBucketOutList();
    List<Bucket> getBucketInList();
}

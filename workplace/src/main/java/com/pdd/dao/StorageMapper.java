package com.pdd.dao;

import com.pdd.entity.Storage;

public interface StorageMapper {
    int deleteByPrimaryKey(Integer storageId);

    int insert(Storage record);

    int insertSelective(Storage record);

    Storage selectByPrimaryKey(Integer storageId);

    int updateByPrimaryKeySelective(Storage record);

    int updateByPrimaryKey(Storage record);
}
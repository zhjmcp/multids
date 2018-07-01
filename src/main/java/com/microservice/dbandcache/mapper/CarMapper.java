package com.microservice.dbandcache.mapper;

import com.microservice.dbandcache.model.Car;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface CarMapper {
    List<Car> selectByOwner(@Param("ownerId")Long ownerId);
}
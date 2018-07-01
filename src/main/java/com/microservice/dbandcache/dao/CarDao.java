package com.microservice.dbandcache.dao;

import com.microservice.dbandcache.config.DatabaseContextHolder;
import com.microservice.dbandcache.config.DatabaseType;
import com.microservice.dbandcache.mapper.CarMapper;
import com.microservice.dbandcache.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.microservice.dbandcache.mapper.UserMapper;//引用项目dbandcache
import com.microservice.dbandcache.model.User;

import java.util.List;

@Repository
public class CarDao {
	@Autowired
	private CarMapper carMapper;
	
	public List<Car> selectByOwner(long ownerId){
		//DatabaseContextHolder.setDatabaseType(DatabaseType.microservicedb2);//由于添加config.DataSourceAspect.java
		return carMapper.selectByOwner(ownerId);
	}
}

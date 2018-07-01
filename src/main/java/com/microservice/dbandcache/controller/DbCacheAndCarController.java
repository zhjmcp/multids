package com.microservice.dbandcache.controller;

import com.microservice.dbandcache.model.User;
import com.microservice.dbandcache.service.UserService;
import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.http.converter.StringHttpMessageConverter;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
@Api("user���api")
@RestController
@RequestMapping("/user")
public class DbCacheAndCarController {
	@Autowired
	private UserService userService;
	
	@ApiOperation("�����û�ID��ȡ�û����䳵����Ϣ")
	@ApiImplicitParams({
		@ApiImplicitParam(paramType="query",name="id",dataType="long",required=true,value="�û���d",defaultValue="1")
	})
	@ApiResponses({
		@ApiResponse(code=401,message="Ȩ��У�鲻ͨ��")
	})
	@RequestMapping(value="/getUserAndCar",method=RequestMethod.GET)
	public User getUserAndCar(@RequestParam("id") long id){
		return userService.getUserAndCar(id);
	}
}

package com.cdpyy.miaosha.controller;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
//SLF4J代表Simple Logging Facade for Java，Java中所有日志框架的简单抽象
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cdpyy.miaosha.redis.RedisService;
import com.cdpyy.miaosha.result.Result;
import com.cdpyy.miaosha.service.MiaoshaUserService;
import com.cdpyy.miaosha.vo.LoginVo;

@Controller
@RequestMapping("/login")
public class LoginController {

    //Simple Logging Facade for Java
	private static Logger log = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	MiaoshaUserService userService;
	
	@Autowired
	RedisService redisService;
	
    @RequestMapping("/to_login")
    public String toLogin() {
        return "login";
    }
    
    @RequestMapping("/do_login")
    @ResponseBody
    //JSR303参数校验
    public Result<String> doLogin(HttpServletResponse response, @Valid LoginVo loginVo) {
    	log.info(loginVo.toString());
    	//登录
    	String token = userService.login(response, loginVo);
    	return Result.success(token);
    }
}

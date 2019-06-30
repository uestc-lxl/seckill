package com.cdpyy.miaosha.vo;
/*
接收login参数
 */

import javax.validation.constraints.NotNull;

import com.cdpyy.miaosha.validator.IsMobile;
import org.hibernate.validator.constraints.Length;

public class LoginVo {
	//用户手机号码
	@NotNull
	@IsMobile//自定义判断
	private String mobile;
	//用户密码
	@NotNull
	@Length(min=32)
	private String password;
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginVo [mobile=" + mobile + ", password=" + password + "]";
	}
}

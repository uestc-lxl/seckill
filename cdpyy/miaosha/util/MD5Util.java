package com.cdpyy.miaosha.util;

//MD5加密

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Util {
	
	public static String md5(String src) {
		//Spring框架自带MD5 加密工具类
		return DigestUtils.md5Hex(src);

	}

	//固定盐池
	private static final String salt = "1a2b3c4d";

	//第一次MD5 用户输入到form
	public static String inputPassToFormPass(String inputPass) {
		String str = ""+salt.charAt(0)+salt.charAt(2) + inputPass +salt.charAt(4) + salt.charAt(6);
		System.out.println(str);
		return md5(str);
	}

	//第二次MD5 form到DB
	public static String formPassToDBPass(String formPass, String salt) {
		String str = ""+salt.charAt(0)+salt.charAt(2) + formPass +salt.charAt(4) + salt.charAt(6);
		return md5(str);
	}
	//用户输入到数据库
	public static String inputPassToDbPass(String inputPass, String saltDB) {
		String formPass = inputPassToFormPass(inputPass);
		String dbPass = formPassToDBPass(formPass, saltDB);
		return dbPass;
	}
	
//	public static void main(String[] args) {
//		System.out.println(inputPassToFormPass("123456"));//d3b1294a61a07da9b49b6e22b2cbd7f9
////		System.out.println(formPassToDBPass(inputPassToFormPass("123456"), "1a2b3c4d"));
////		System.out.println(inputPassToDbPass("123456", "1a2b3c4d"));//b7797cce01b4b131b433b6acf4add449
//	}
	
}

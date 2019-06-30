package com.cdpyy.miaosha.vo;

import com.cdpyy.miaosha.domain.MiaoshaUser;

public class GoodsDetailVo {
	private int seckillStatus = 0;
	private int remainSeconds = 0;
	private GoodsVo goods ;
	private MiaoshaUser user;
	public int getSeckillStatus() {
		return seckillStatus;
	}
	public void setSeckillStatus(int seckillStatus) {
		this.seckillStatus = seckillStatus;
	}
	public int getRemainSeconds() {
		return remainSeconds;
	}
	public void setRemainSeconds(int remainSeconds) {
		this.remainSeconds = remainSeconds;
	}
	public GoodsVo getGoods() {
		return goods;
	}
	public void setGoods(GoodsVo goods) {
		this.goods = goods;
	}
	public MiaoshaUser getUser() {
		return user;
	}
	public void setUser(MiaoshaUser user) {
		this.user = user;
	}
}

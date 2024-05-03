package com.entity.model;

import com.entity.BumenpeixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 部门培训
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-22 17:13:54
 */
public class BumenpeixunModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 培训时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date peixunshijian;
		
	/**
	 * 培训内容
	 */
	
	private String peixunneirong;
		
	/**
	 * 培训地点
	 */
	
	private String peixundidian;
		
	/**
	 * 结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jieshushijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：培训时间
	 */
	 
	public void setPeixunshijian(Date peixunshijian) {
		this.peixunshijian = peixunshijian;
	}
	
	/**
	 * 获取：培训时间
	 */
	public Date getPeixunshijian() {
		return peixunshijian;
	}
				
	
	/**
	 * 设置：培训内容
	 */
	 
	public void setPeixunneirong(String peixunneirong) {
		this.peixunneirong = peixunneirong;
	}
	
	/**
	 * 获取：培训内容
	 */
	public String getPeixunneirong() {
		return peixunneirong;
	}
				
	
	/**
	 * 设置：培训地点
	 */
	 
	public void setPeixundidian(String peixundidian) {
		this.peixundidian = peixundidian;
	}
	
	/**
	 * 获取：培训地点
	 */
	public String getPeixundidian() {
		return peixundidian;
	}
				
	
	/**
	 * 设置：结束时间
	 */
	 
	public void setJieshushijian(Date jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	
	/**
	 * 获取：结束时间
	 */
	public Date getJieshushijian() {
		return jieshushijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}

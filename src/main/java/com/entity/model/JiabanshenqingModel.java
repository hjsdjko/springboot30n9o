package com.entity.model;

import com.entity.JiabanshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 加班申请
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-22 17:13:54
 */
public class JiabanshenqingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 职位
	 */
	
	private String zhiwei;
		
	/**
	 * 加班时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiabanshijian;
		
	/**
	 * 加班时长
	 */
	
	private String jiabanshizhang;
		
	/**
	 * 加班事由
	 */
	
	private String jiabanshiyou;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
				
	
	/**
	 * 设置：职位
	 */
	 
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	
	/**
	 * 获取：职位
	 */
	public String getZhiwei() {
		return zhiwei;
	}
				
	
	/**
	 * 设置：加班时间
	 */
	 
	public void setJiabanshijian(Date jiabanshijian) {
		this.jiabanshijian = jiabanshijian;
	}
	
	/**
	 * 获取：加班时间
	 */
	public Date getJiabanshijian() {
		return jiabanshijian;
	}
				
	
	/**
	 * 设置：加班时长
	 */
	 
	public void setJiabanshizhang(String jiabanshizhang) {
		this.jiabanshizhang = jiabanshizhang;
	}
	
	/**
	 * 获取：加班时长
	 */
	public String getJiabanshizhang() {
		return jiabanshizhang;
	}
				
	
	/**
	 * 设置：加班事由
	 */
	 
	public void setJiabanshiyou(String jiabanshiyou) {
		this.jiabanshiyou = jiabanshiyou;
	}
	
	/**
	 * 获取：加班事由
	 */
	public String getJiabanshiyou() {
		return jiabanshiyou;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}

package com.entity.vo;

import com.entity.ZhaopinjihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 招聘计划
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-22 17:13:54
 */
public class ZhaopinjihuaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 职位
	 */
	
	private String zhiwei;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 招聘岗位
	 */
	
	private String zhaopingangwei;
		
	/**
	 * 招聘要求
	 */
	
	private String zhaopinyaoqiu;
		
	/**
	 * 招聘人数
	 */
	
	private String zhaopinrenshu;
		
	/**
	 * 招聘流程
	 */
	
	private String zhaopinliucheng;
		
	/**
	 * 申请时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingshijian;
		
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
	 * 设置：招聘岗位
	 */
	 
	public void setZhaopingangwei(String zhaopingangwei) {
		this.zhaopingangwei = zhaopingangwei;
	}
	
	/**
	 * 获取：招聘岗位
	 */
	public String getZhaopingangwei() {
		return zhaopingangwei;
	}
				
	
	/**
	 * 设置：招聘要求
	 */
	 
	public void setZhaopinyaoqiu(String zhaopinyaoqiu) {
		this.zhaopinyaoqiu = zhaopinyaoqiu;
	}
	
	/**
	 * 获取：招聘要求
	 */
	public String getZhaopinyaoqiu() {
		return zhaopinyaoqiu;
	}
				
	
	/**
	 * 设置：招聘人数
	 */
	 
	public void setZhaopinrenshu(String zhaopinrenshu) {
		this.zhaopinrenshu = zhaopinrenshu;
	}
	
	/**
	 * 获取：招聘人数
	 */
	public String getZhaopinrenshu() {
		return zhaopinrenshu;
	}
				
	
	/**
	 * 设置：招聘流程
	 */
	 
	public void setZhaopinliucheng(String zhaopinliucheng) {
		this.zhaopinliucheng = zhaopinliucheng;
	}
	
	/**
	 * 获取：招聘流程
	 */
	public String getZhaopinliucheng() {
		return zhaopinliucheng;
	}
				
	
	/**
	 * 设置：申请时间
	 */
	 
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
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

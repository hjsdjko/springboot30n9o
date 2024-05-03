package com.entity.model;

import com.entity.YuangonggongziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 员工工资
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-22 17:13:54
 */
public class YuangonggongziModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
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
	 * 基本工资
	 */
	
	private Float jibengongzi;
		
	/**
	 * 绩效
	 */
	
	private Float jixiao;
		
	/**
	 * 车补
	 */
	
	private Float chebu;
		
	/**
	 * 餐补
	 */
	
	private Float canbu;
		
	/**
	 * 房补
	 */
	
	private Float fangbu;
		
	/**
	 * 全勤奖
	 */
	
	private Float quanqinjiang;
		
	/**
	 * 加班费
	 */
	
	private Float jiabanfei;
		
	/**
	 * 五险一金
	 */
	
	private Float wuxianyijin;
		
	/**
	 * 扣绩效
	 */
	
	private Float koujixiao;
		
	/**
	 * 旷工费
	 */
	
	private Float kuanggongfei;
		
	/**
	 * 其它扣款
	 */
	
	private Float qitakoukuan;
		
	/**
	 * 实发工资
	 */
	
	private Float shifagongzi;
		
	/**
	 * 工资备注
	 */
	
	private String gongzibeizhu;
				
	
	/**
	 * 设置：员工工号
	 */
	 
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
				
	
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
	 * 设置：基本工资
	 */
	 
	public void setJibengongzi(Float jibengongzi) {
		this.jibengongzi = jibengongzi;
	}
	
	/**
	 * 获取：基本工资
	 */
	public Float getJibengongzi() {
		return jibengongzi;
	}
				
	
	/**
	 * 设置：绩效
	 */
	 
	public void setJixiao(Float jixiao) {
		this.jixiao = jixiao;
	}
	
	/**
	 * 获取：绩效
	 */
	public Float getJixiao() {
		return jixiao;
	}
				
	
	/**
	 * 设置：车补
	 */
	 
	public void setChebu(Float chebu) {
		this.chebu = chebu;
	}
	
	/**
	 * 获取：车补
	 */
	public Float getChebu() {
		return chebu;
	}
				
	
	/**
	 * 设置：餐补
	 */
	 
	public void setCanbu(Float canbu) {
		this.canbu = canbu;
	}
	
	/**
	 * 获取：餐补
	 */
	public Float getCanbu() {
		return canbu;
	}
				
	
	/**
	 * 设置：房补
	 */
	 
	public void setFangbu(Float fangbu) {
		this.fangbu = fangbu;
	}
	
	/**
	 * 获取：房补
	 */
	public Float getFangbu() {
		return fangbu;
	}
				
	
	/**
	 * 设置：全勤奖
	 */
	 
	public void setQuanqinjiang(Float quanqinjiang) {
		this.quanqinjiang = quanqinjiang;
	}
	
	/**
	 * 获取：全勤奖
	 */
	public Float getQuanqinjiang() {
		return quanqinjiang;
	}
				
	
	/**
	 * 设置：加班费
	 */
	 
	public void setJiabanfei(Float jiabanfei) {
		this.jiabanfei = jiabanfei;
	}
	
	/**
	 * 获取：加班费
	 */
	public Float getJiabanfei() {
		return jiabanfei;
	}
				
	
	/**
	 * 设置：五险一金
	 */
	 
	public void setWuxianyijin(Float wuxianyijin) {
		this.wuxianyijin = wuxianyijin;
	}
	
	/**
	 * 获取：五险一金
	 */
	public Float getWuxianyijin() {
		return wuxianyijin;
	}
				
	
	/**
	 * 设置：扣绩效
	 */
	 
	public void setKoujixiao(Float koujixiao) {
		this.koujixiao = koujixiao;
	}
	
	/**
	 * 获取：扣绩效
	 */
	public Float getKoujixiao() {
		return koujixiao;
	}
				
	
	/**
	 * 设置：旷工费
	 */
	 
	public void setKuanggongfei(Float kuanggongfei) {
		this.kuanggongfei = kuanggongfei;
	}
	
	/**
	 * 获取：旷工费
	 */
	public Float getKuanggongfei() {
		return kuanggongfei;
	}
				
	
	/**
	 * 设置：其它扣款
	 */
	 
	public void setQitakoukuan(Float qitakoukuan) {
		this.qitakoukuan = qitakoukuan;
	}
	
	/**
	 * 获取：其它扣款
	 */
	public Float getQitakoukuan() {
		return qitakoukuan;
	}
				
	
	/**
	 * 设置：实发工资
	 */
	 
	public void setShifagongzi(Float shifagongzi) {
		this.shifagongzi = shifagongzi;
	}
	
	/**
	 * 获取：实发工资
	 */
	public Float getShifagongzi() {
		return shifagongzi;
	}
				
	
	/**
	 * 设置：工资备注
	 */
	 
	public void setGongzibeizhu(String gongzibeizhu) {
		this.gongzibeizhu = gongzibeizhu;
	}
	
	/**
	 * 获取：工资备注
	 */
	public String getGongzibeizhu() {
		return gongzibeizhu;
	}
			
}

package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 员工工资
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-22 17:13:54
 */
@TableName("yuangonggongzi")
public class YuangonggongziEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuangonggongziEntity() {
		
	}
	
	public YuangonggongziEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 发放时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fafangshijian;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：发放时间
	 */
	public void setFafangshijian(Date fafangshijian) {
		this.fafangshijian = fafangshijian;
	}
	/**
	 * 获取：发放时间
	 */
	public Date getFafangshijian() {
		return fafangshijian;
	}
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

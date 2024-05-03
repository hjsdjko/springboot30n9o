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
 * 员工详细
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-22 17:13:54
 */
@TableName("yuangongxiangxi")
public class YuangongxiangxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuangongxiangxiEntity() {
		
	}
	
	public YuangongxiangxiEntity(T t) {
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
	 * 员工工号
	 */
					
	private String yuangonggonghao;
	
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
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 年龄
	 */
					
	private String nianling;
	
	/**
	 * 员工手机
	 */
					
	private String yuangongshouji;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 员工地址
	 */
					
	private String yuangongdizhi;
	
	/**
	 * 民族
	 */
					
	private String minzu;
	
	/**
	 * 学历
	 */
					
	private String xueli;
	
	/**
	 * 婚否
	 */
					
	private String hunfou;
	
	/**
	 * 政治面貌
	 */
					
	private String zhengzhimianmao;
	
	/**
	 * 毕业院校
	 */
					
	private String biyeyuanxiao;
	
	/**
	 * 专业
	 */
					
	private String zhuanye;
	
	/**
	 * 身份证号
	 */
					
	private String shenfenzhenghao;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	
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
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
	/**
	 * 设置：员工手机
	 */
	public void setYuangongshouji(String yuangongshouji) {
		this.yuangongshouji = yuangongshouji;
	}
	/**
	 * 获取：员工手机
	 */
	public String getYuangongshouji() {
		return yuangongshouji;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
	/**
	 * 设置：员工地址
	 */
	public void setYuangongdizhi(String yuangongdizhi) {
		this.yuangongdizhi = yuangongdizhi;
	}
	/**
	 * 获取：员工地址
	 */
	public String getYuangongdizhi() {
		return yuangongdizhi;
	}
	/**
	 * 设置：民族
	 */
	public void setMinzu(String minzu) {
		this.minzu = minzu;
	}
	/**
	 * 获取：民族
	 */
	public String getMinzu() {
		return minzu;
	}
	/**
	 * 设置：学历
	 */
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	/**
	 * 获取：学历
	 */
	public String getXueli() {
		return xueli;
	}
	/**
	 * 设置：婚否
	 */
	public void setHunfou(String hunfou) {
		this.hunfou = hunfou;
	}
	/**
	 * 获取：婚否
	 */
	public String getHunfou() {
		return hunfou;
	}
	/**
	 * 设置：政治面貌
	 */
	public void setZhengzhimianmao(String zhengzhimianmao) {
		this.zhengzhimianmao = zhengzhimianmao;
	}
	/**
	 * 获取：政治面貌
	 */
	public String getZhengzhimianmao() {
		return zhengzhimianmao;
	}
	/**
	 * 设置：毕业院校
	 */
	public void setBiyeyuanxiao(String biyeyuanxiao) {
		this.biyeyuanxiao = biyeyuanxiao;
	}
	/**
	 * 获取：毕业院校
	 */
	public String getBiyeyuanxiao() {
		return biyeyuanxiao;
	}
	/**
	 * 设置：专业
	 */
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
	/**
	 * 设置：身份证号
	 */
	public void setShenfenzhenghao(String shenfenzhenghao) {
		this.shenfenzhenghao = shenfenzhenghao;
	}
	/**
	 * 获取：身份证号
	 */
	public String getShenfenzhenghao() {
		return shenfenzhenghao;
	}
	/**
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}

}

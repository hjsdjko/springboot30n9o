package com.entity.view;

import com.entity.JiabanshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 加班申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-22 17:13:54
 */
@TableName("jiabanshenqing")
public class JiabanshenqingView  extends JiabanshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiabanshenqingView(){
	}
 
 	public JiabanshenqingView(JiabanshenqingEntity jiabanshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, jiabanshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

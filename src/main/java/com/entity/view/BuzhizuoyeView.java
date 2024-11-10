package com.entity.view;

import com.entity.BuzhizuoyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 布置作业
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-03 19:31:03
 */
@TableName("buzhizuoye")
public class BuzhizuoyeView  extends BuzhizuoyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BuzhizuoyeView(){
	}
 
 	public BuzhizuoyeView(BuzhizuoyeEntity buzhizuoyeEntity){
 	try {
			BeanUtils.copyProperties(this, buzhizuoyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

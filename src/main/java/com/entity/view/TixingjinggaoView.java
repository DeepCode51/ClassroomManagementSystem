package com.entity.view;

import com.entity.TixingjinggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 提醒警告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-03 19:31:03
 */
@TableName("tixingjinggao")
public class TixingjinggaoView  extends TixingjinggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TixingjinggaoView(){
	}
 
 	public TixingjinggaoView(TixingjinggaoEntity tixingjinggaoEntity){
 	try {
			BeanUtils.copyProperties(this, tixingjinggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

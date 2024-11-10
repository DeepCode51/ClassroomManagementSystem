package com.entity.view;

import com.entity.XueshengqiandaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生签到
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-03 19:31:03
 */
@TableName("xueshengqiandao")
public class XueshengqiandaoView  extends XueshengqiandaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengqiandaoView(){
	}
 
 	public XueshengqiandaoView(XueshengqiandaoEntity xueshengqiandaoEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengqiandaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

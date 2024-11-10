package com.entity.vo;

import com.entity.KetangbiaoxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 课堂表现
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-03 19:31:03
 */
public class KetangbiaoxianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 课堂表现
	 */
	
	private String ketangbiaoxian;
		
	/**
	 * 学习态度
	 */
	
	private String xuexitaidu;
		
	/**
	 * 教师评语
	 */
	
	private String jiaoshipingyu;
		
	/**
	 * 教师账号
	 */
	
	private String jiaoshizhanghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：课堂表现
	 */
	 
	public void setKetangbiaoxian(String ketangbiaoxian) {
		this.ketangbiaoxian = ketangbiaoxian;
	}
	
	/**
	 * 获取：课堂表现
	 */
	public String getKetangbiaoxian() {
		return ketangbiaoxian;
	}
				
	
	/**
	 * 设置：学习态度
	 */
	 
	public void setXuexitaidu(String xuexitaidu) {
		this.xuexitaidu = xuexitaidu;
	}
	
	/**
	 * 获取：学习态度
	 */
	public String getXuexitaidu() {
		return xuexitaidu;
	}
				
	
	/**
	 * 设置：教师评语
	 */
	 
	public void setJiaoshipingyu(String jiaoshipingyu) {
		this.jiaoshipingyu = jiaoshipingyu;
	}
	
	/**
	 * 获取：教师评语
	 */
	public String getJiaoshipingyu() {
		return jiaoshipingyu;
	}
				
	
	/**
	 * 设置：教师账号
	 */
	 
	public void setJiaoshizhanghao(String jiaoshizhanghao) {
		this.jiaoshizhanghao = jiaoshizhanghao;
	}
	
	/**
	 * 获取：教师账号
	 */
	public String getJiaoshizhanghao() {
		return jiaoshizhanghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}

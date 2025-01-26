package com.entity.model;

import com.entity.DabianchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 答辩成绩
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-01-28 10:38:59
 */
public class DabianchengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 答辩成绩
	 */
	
	private Integer dabianchengji;
		
	/**
	 * 答辩结果
	 */
	
	private String dabianjieguo;
		
	/**
	 * 答辩评价
	 */
	
	private String dabianpingjia;
		
	/**
	 * 导师工号
	 */
	
	private String daoshigonghao;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 评分时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingfenshijian;
				
	
	/**
	 * 设置：答辩成绩
	 */
	 
	public void setDabianchengji(Integer dabianchengji) {
		this.dabianchengji = dabianchengji;
	}
	
	/**
	 * 获取：答辩成绩
	 */
	public Integer getDabianchengji() {
		return dabianchengji;
	}
				
	
	/**
	 * 设置：答辩结果
	 */
	 
	public void setDabianjieguo(String dabianjieguo) {
		this.dabianjieguo = dabianjieguo;
	}
	
	/**
	 * 获取：答辩结果
	 */
	public String getDabianjieguo() {
		return dabianjieguo;
	}
				
	
	/**
	 * 设置：答辩评价
	 */
	 
	public void setDabianpingjia(String dabianpingjia) {
		this.dabianpingjia = dabianpingjia;
	}
	
	/**
	 * 获取：答辩评价
	 */
	public String getDabianpingjia() {
		return dabianpingjia;
	}
				
	
	/**
	 * 设置：导师工号
	 */
	 
	public void setDaoshigonghao(String daoshigonghao) {
		this.daoshigonghao = daoshigonghao;
	}
	
	/**
	 * 获取：导师工号
	 */
	public String getDaoshigonghao() {
		return daoshigonghao;
	}
				
	
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
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：评分时间
	 */
	 
	public void setPingfenshijian(Date pingfenshijian) {
		this.pingfenshijian = pingfenshijian;
	}
	
	/**
	 * 获取：评分时间
	 */
	public Date getPingfenshijian() {
		return pingfenshijian;
	}
			
}

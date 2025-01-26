package com.entity.vo;

import com.entity.LunwendabianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 论文答辩
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-28 10:38:59
 */
public class LunwendabianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 答辩ppt
	 */
	
	private String dabianppt;
		
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
	 * 答辩时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dabianshijian;
				
	
	/**
	 * 设置：答辩ppt
	 */
	 
	public void setDabianppt(String dabianppt) {
		this.dabianppt = dabianppt;
	}
	
	/**
	 * 获取：答辩ppt
	 */
	public String getDabianppt() {
		return dabianppt;
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
	 * 设置：答辩时间
	 */
	 
	public void setDabianshijian(Date dabianshijian) {
		this.dabianshijian = dabianshijian;
	}
	
	/**
	 * 获取：答辩时间
	 */
	public Date getDabianshijian() {
		return dabianshijian;
	}
			
}

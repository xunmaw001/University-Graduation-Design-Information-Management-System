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
 * 答辩成绩
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-01-28 10:38:59
 */
@TableName("dabianchengji")
public class DabianchengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DabianchengjiEntity() {
		
	}
	
	public DabianchengjiEntity(T t) {
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
	 * 课题名称
	 */
					
	private String ketimingcheng;
	
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
	 * 设置：课题名称
	 */
	public void setKetimingcheng(String ketimingcheng) {
		this.ketimingcheng = ketimingcheng;
	}
	/**
	 * 获取：课题名称
	 */
	public String getKetimingcheng() {
		return ketimingcheng;
	}
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

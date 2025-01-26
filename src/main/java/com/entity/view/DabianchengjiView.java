package com.entity.view;

import com.entity.DabianchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 答辩成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-28 10:38:59
 */
@TableName("dabianchengji")
public class DabianchengjiView  extends DabianchengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DabianchengjiView(){
	}
 
 	public DabianchengjiView(DabianchengjiEntity dabianchengjiEntity){
 	try {
			BeanUtils.copyProperties(this, dabianchengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

package com.entity.view;

import com.entity.LunwendabianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 论文答辩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-28 10:38:59
 */
@TableName("lunwendabian")
public class LunwendabianView  extends LunwendabianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LunwendabianView(){
	}
 
 	public LunwendabianView(LunwendabianEntity lunwendabianEntity){
 	try {
			BeanUtils.copyProperties(this, lunwendabianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

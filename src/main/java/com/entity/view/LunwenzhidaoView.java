package com.entity.view;

import com.entity.LunwenzhidaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 论文指导
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-28 10:38:59
 */
@TableName("lunwenzhidao")
public class LunwenzhidaoView  extends LunwenzhidaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LunwenzhidaoView(){
	}
 
 	public LunwenzhidaoView(LunwenzhidaoEntity lunwenzhidaoEntity){
 	try {
			BeanUtils.copyProperties(this, lunwenzhidaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

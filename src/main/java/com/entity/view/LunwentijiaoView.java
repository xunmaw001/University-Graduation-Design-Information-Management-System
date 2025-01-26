package com.entity.view;

import com.entity.LunwentijiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 论文提交
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-28 10:38:59
 */
@TableName("lunwentijiao")
public class LunwentijiaoView  extends LunwentijiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LunwentijiaoView(){
	}
 
 	public LunwentijiaoView(LunwentijiaoEntity lunwentijiaoEntity){
 	try {
			BeanUtils.copyProperties(this, lunwentijiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

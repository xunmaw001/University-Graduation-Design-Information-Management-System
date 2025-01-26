package com.dao;

import com.entity.XueshengxuantiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengxuantiVO;
import com.entity.view.XueshengxuantiView;


/**
 * 学生选题
 * 
 * @author 
 * @email 
 * @date 2023-01-28 10:38:59
 */
public interface XueshengxuantiDao extends BaseMapper<XueshengxuantiEntity> {
	
	List<XueshengxuantiVO> selectListVO(@Param("ew") Wrapper<XueshengxuantiEntity> wrapper);
	
	XueshengxuantiVO selectVO(@Param("ew") Wrapper<XueshengxuantiEntity> wrapper);
	
	List<XueshengxuantiView> selectListView(@Param("ew") Wrapper<XueshengxuantiEntity> wrapper);

	List<XueshengxuantiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengxuantiEntity> wrapper);
	
	XueshengxuantiView selectView(@Param("ew") Wrapper<XueshengxuantiEntity> wrapper);
	

}

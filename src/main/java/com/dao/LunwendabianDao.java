package com.dao;

import com.entity.LunwendabianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LunwendabianVO;
import com.entity.view.LunwendabianView;


/**
 * 论文答辩
 * 
 * @author 
 * @email 
 * @date 2023-01-28 10:38:59
 */
public interface LunwendabianDao extends BaseMapper<LunwendabianEntity> {
	
	List<LunwendabianVO> selectListVO(@Param("ew") Wrapper<LunwendabianEntity> wrapper);
	
	LunwendabianVO selectVO(@Param("ew") Wrapper<LunwendabianEntity> wrapper);
	
	List<LunwendabianView> selectListView(@Param("ew") Wrapper<LunwendabianEntity> wrapper);

	List<LunwendabianView> selectListView(Pagination page,@Param("ew") Wrapper<LunwendabianEntity> wrapper);
	
	LunwendabianView selectView(@Param("ew") Wrapper<LunwendabianEntity> wrapper);
	

}

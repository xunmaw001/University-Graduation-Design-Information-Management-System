package com.dao;

import com.entity.LunwenzhidaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LunwenzhidaoVO;
import com.entity.view.LunwenzhidaoView;


/**
 * 论文指导
 * 
 * @author 
 * @email 
 * @date 2023-01-28 10:38:59
 */
public interface LunwenzhidaoDao extends BaseMapper<LunwenzhidaoEntity> {
	
	List<LunwenzhidaoVO> selectListVO(@Param("ew") Wrapper<LunwenzhidaoEntity> wrapper);
	
	LunwenzhidaoVO selectVO(@Param("ew") Wrapper<LunwenzhidaoEntity> wrapper);
	
	List<LunwenzhidaoView> selectListView(@Param("ew") Wrapper<LunwenzhidaoEntity> wrapper);

	List<LunwenzhidaoView> selectListView(Pagination page,@Param("ew") Wrapper<LunwenzhidaoEntity> wrapper);
	
	LunwenzhidaoView selectView(@Param("ew") Wrapper<LunwenzhidaoEntity> wrapper);
	

}

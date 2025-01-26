package com.dao;

import com.entity.DabianchengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DabianchengjiVO;
import com.entity.view.DabianchengjiView;


/**
 * 答辩成绩
 * 
 * @author 
 * @email 
 * @date 2023-01-28 10:38:59
 */
public interface DabianchengjiDao extends BaseMapper<DabianchengjiEntity> {
	
	List<DabianchengjiVO> selectListVO(@Param("ew") Wrapper<DabianchengjiEntity> wrapper);
	
	DabianchengjiVO selectVO(@Param("ew") Wrapper<DabianchengjiEntity> wrapper);
	
	List<DabianchengjiView> selectListView(@Param("ew") Wrapper<DabianchengjiEntity> wrapper);

	List<DabianchengjiView> selectListView(Pagination page,@Param("ew") Wrapper<DabianchengjiEntity> wrapper);
	
	DabianchengjiView selectView(@Param("ew") Wrapper<DabianchengjiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<DabianchengjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DabianchengjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DabianchengjiEntity> wrapper);



}

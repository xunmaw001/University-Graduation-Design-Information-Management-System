package com.dao;

import com.entity.LunwentijiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LunwentijiaoVO;
import com.entity.view.LunwentijiaoView;


/**
 * 论文提交
 * 
 * @author 
 * @email 
 * @date 2023-01-28 10:38:59
 */
public interface LunwentijiaoDao extends BaseMapper<LunwentijiaoEntity> {
	
	List<LunwentijiaoVO> selectListVO(@Param("ew") Wrapper<LunwentijiaoEntity> wrapper);
	
	LunwentijiaoVO selectVO(@Param("ew") Wrapper<LunwentijiaoEntity> wrapper);
	
	List<LunwentijiaoView> selectListView(@Param("ew") Wrapper<LunwentijiaoEntity> wrapper);

	List<LunwentijiaoView> selectListView(Pagination page,@Param("ew") Wrapper<LunwentijiaoEntity> wrapper);
	
	LunwentijiaoView selectView(@Param("ew") Wrapper<LunwentijiaoEntity> wrapper);
	

}

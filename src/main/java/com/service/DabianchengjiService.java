package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DabianchengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DabianchengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DabianchengjiView;


/**
 * 答辩成绩
 *
 * @author 
 * @email 
 * @date 2023-01-28 10:38:59
 */
public interface DabianchengjiService extends IService<DabianchengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DabianchengjiVO> selectListVO(Wrapper<DabianchengjiEntity> wrapper);
   	
   	DabianchengjiVO selectVO(@Param("ew") Wrapper<DabianchengjiEntity> wrapper);
   	
   	List<DabianchengjiView> selectListView(Wrapper<DabianchengjiEntity> wrapper);
   	
   	DabianchengjiView selectView(@Param("ew") Wrapper<DabianchengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DabianchengjiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<DabianchengjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<DabianchengjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<DabianchengjiEntity> wrapper);



}


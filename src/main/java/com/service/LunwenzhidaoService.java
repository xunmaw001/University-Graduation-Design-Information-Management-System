package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LunwenzhidaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LunwenzhidaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LunwenzhidaoView;


/**
 * 论文指导
 *
 * @author 
 * @email 
 * @date 2023-01-28 10:38:59
 */
public interface LunwenzhidaoService extends IService<LunwenzhidaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LunwenzhidaoVO> selectListVO(Wrapper<LunwenzhidaoEntity> wrapper);
   	
   	LunwenzhidaoVO selectVO(@Param("ew") Wrapper<LunwenzhidaoEntity> wrapper);
   	
   	List<LunwenzhidaoView> selectListView(Wrapper<LunwenzhidaoEntity> wrapper);
   	
   	LunwenzhidaoView selectView(@Param("ew") Wrapper<LunwenzhidaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LunwenzhidaoEntity> wrapper);
   	

}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LunwendabianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LunwendabianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LunwendabianView;


/**
 * 论文答辩
 *
 * @author 
 * @email 
 * @date 2023-01-28 10:38:59
 */
public interface LunwendabianService extends IService<LunwendabianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LunwendabianVO> selectListVO(Wrapper<LunwendabianEntity> wrapper);
   	
   	LunwendabianVO selectVO(@Param("ew") Wrapper<LunwendabianEntity> wrapper);
   	
   	List<LunwendabianView> selectListView(Wrapper<LunwendabianEntity> wrapper);
   	
   	LunwendabianView selectView(@Param("ew") Wrapper<LunwendabianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LunwendabianEntity> wrapper);
   	

}


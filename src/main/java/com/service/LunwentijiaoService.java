package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LunwentijiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LunwentijiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LunwentijiaoView;


/**
 * 论文提交
 *
 * @author 
 * @email 
 * @date 2023-01-28 10:38:59
 */
public interface LunwentijiaoService extends IService<LunwentijiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LunwentijiaoVO> selectListVO(Wrapper<LunwentijiaoEntity> wrapper);
   	
   	LunwentijiaoVO selectVO(@Param("ew") Wrapper<LunwentijiaoEntity> wrapper);
   	
   	List<LunwentijiaoView> selectListView(Wrapper<LunwentijiaoEntity> wrapper);
   	
   	LunwentijiaoView selectView(@Param("ew") Wrapper<LunwentijiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LunwentijiaoEntity> wrapper);
   	

}


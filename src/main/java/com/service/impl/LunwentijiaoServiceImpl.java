package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LunwentijiaoDao;
import com.entity.LunwentijiaoEntity;
import com.service.LunwentijiaoService;
import com.entity.vo.LunwentijiaoVO;
import com.entity.view.LunwentijiaoView;

@Service("lunwentijiaoService")
public class LunwentijiaoServiceImpl extends ServiceImpl<LunwentijiaoDao, LunwentijiaoEntity> implements LunwentijiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LunwentijiaoEntity> page = this.selectPage(
                new Query<LunwentijiaoEntity>(params).getPage(),
                new EntityWrapper<LunwentijiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LunwentijiaoEntity> wrapper) {
		  Page<LunwentijiaoView> page =new Query<LunwentijiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LunwentijiaoVO> selectListVO(Wrapper<LunwentijiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LunwentijiaoVO selectVO(Wrapper<LunwentijiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LunwentijiaoView> selectListView(Wrapper<LunwentijiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LunwentijiaoView selectView(Wrapper<LunwentijiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

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


import com.dao.LunwenzhidaoDao;
import com.entity.LunwenzhidaoEntity;
import com.service.LunwenzhidaoService;
import com.entity.vo.LunwenzhidaoVO;
import com.entity.view.LunwenzhidaoView;

@Service("lunwenzhidaoService")
public class LunwenzhidaoServiceImpl extends ServiceImpl<LunwenzhidaoDao, LunwenzhidaoEntity> implements LunwenzhidaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LunwenzhidaoEntity> page = this.selectPage(
                new Query<LunwenzhidaoEntity>(params).getPage(),
                new EntityWrapper<LunwenzhidaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LunwenzhidaoEntity> wrapper) {
		  Page<LunwenzhidaoView> page =new Query<LunwenzhidaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LunwenzhidaoVO> selectListVO(Wrapper<LunwenzhidaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LunwenzhidaoVO selectVO(Wrapper<LunwenzhidaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LunwenzhidaoView> selectListView(Wrapper<LunwenzhidaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LunwenzhidaoView selectView(Wrapper<LunwenzhidaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

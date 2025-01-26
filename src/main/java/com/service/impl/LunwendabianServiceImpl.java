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


import com.dao.LunwendabianDao;
import com.entity.LunwendabianEntity;
import com.service.LunwendabianService;
import com.entity.vo.LunwendabianVO;
import com.entity.view.LunwendabianView;

@Service("lunwendabianService")
public class LunwendabianServiceImpl extends ServiceImpl<LunwendabianDao, LunwendabianEntity> implements LunwendabianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LunwendabianEntity> page = this.selectPage(
                new Query<LunwendabianEntity>(params).getPage(),
                new EntityWrapper<LunwendabianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LunwendabianEntity> wrapper) {
		  Page<LunwendabianView> page =new Query<LunwendabianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LunwendabianVO> selectListVO(Wrapper<LunwendabianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LunwendabianVO selectVO(Wrapper<LunwendabianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LunwendabianView> selectListView(Wrapper<LunwendabianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LunwendabianView selectView(Wrapper<LunwendabianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

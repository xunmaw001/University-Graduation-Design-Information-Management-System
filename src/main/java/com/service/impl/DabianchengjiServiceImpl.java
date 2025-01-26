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


import com.dao.DabianchengjiDao;
import com.entity.DabianchengjiEntity;
import com.service.DabianchengjiService;
import com.entity.vo.DabianchengjiVO;
import com.entity.view.DabianchengjiView;

@Service("dabianchengjiService")
public class DabianchengjiServiceImpl extends ServiceImpl<DabianchengjiDao, DabianchengjiEntity> implements DabianchengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DabianchengjiEntity> page = this.selectPage(
                new Query<DabianchengjiEntity>(params).getPage(),
                new EntityWrapper<DabianchengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DabianchengjiEntity> wrapper) {
		  Page<DabianchengjiView> page =new Query<DabianchengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DabianchengjiVO> selectListVO(Wrapper<DabianchengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DabianchengjiVO selectVO(Wrapper<DabianchengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DabianchengjiView> selectListView(Wrapper<DabianchengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DabianchengjiView selectView(Wrapper<DabianchengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<DabianchengjiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<DabianchengjiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<DabianchengjiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }



}

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


import com.dao.BumenpeixunDao;
import com.entity.BumenpeixunEntity;
import com.service.BumenpeixunService;
import com.entity.vo.BumenpeixunVO;
import com.entity.view.BumenpeixunView;

@Service("bumenpeixunService")
public class BumenpeixunServiceImpl extends ServiceImpl<BumenpeixunDao, BumenpeixunEntity> implements BumenpeixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BumenpeixunEntity> page = this.selectPage(
                new Query<BumenpeixunEntity>(params).getPage(),
                new EntityWrapper<BumenpeixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BumenpeixunEntity> wrapper) {
		  Page<BumenpeixunView> page =new Query<BumenpeixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BumenpeixunVO> selectListVO(Wrapper<BumenpeixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BumenpeixunVO selectVO(Wrapper<BumenpeixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BumenpeixunView> selectListView(Wrapper<BumenpeixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BumenpeixunView selectView(Wrapper<BumenpeixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

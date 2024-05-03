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


import com.dao.JiabanshenqingDao;
import com.entity.JiabanshenqingEntity;
import com.service.JiabanshenqingService;
import com.entity.vo.JiabanshenqingVO;
import com.entity.view.JiabanshenqingView;

@Service("jiabanshenqingService")
public class JiabanshenqingServiceImpl extends ServiceImpl<JiabanshenqingDao, JiabanshenqingEntity> implements JiabanshenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiabanshenqingEntity> page = this.selectPage(
                new Query<JiabanshenqingEntity>(params).getPage(),
                new EntityWrapper<JiabanshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiabanshenqingEntity> wrapper) {
		  Page<JiabanshenqingView> page =new Query<JiabanshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiabanshenqingVO> selectListVO(Wrapper<JiabanshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiabanshenqingVO selectVO(Wrapper<JiabanshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiabanshenqingView> selectListView(Wrapper<JiabanshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiabanshenqingView selectView(Wrapper<JiabanshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

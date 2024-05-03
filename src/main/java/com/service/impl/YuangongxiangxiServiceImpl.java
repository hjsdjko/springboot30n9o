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


import com.dao.YuangongxiangxiDao;
import com.entity.YuangongxiangxiEntity;
import com.service.YuangongxiangxiService;
import com.entity.vo.YuangongxiangxiVO;
import com.entity.view.YuangongxiangxiView;

@Service("yuangongxiangxiService")
public class YuangongxiangxiServiceImpl extends ServiceImpl<YuangongxiangxiDao, YuangongxiangxiEntity> implements YuangongxiangxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongxiangxiEntity> page = this.selectPage(
                new Query<YuangongxiangxiEntity>(params).getPage(),
                new EntityWrapper<YuangongxiangxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongxiangxiEntity> wrapper) {
		  Page<YuangongxiangxiView> page =new Query<YuangongxiangxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongxiangxiVO> selectListVO(Wrapper<YuangongxiangxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongxiangxiVO selectVO(Wrapper<YuangongxiangxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongxiangxiView> selectListView(Wrapper<YuangongxiangxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongxiangxiView selectView(Wrapper<YuangongxiangxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

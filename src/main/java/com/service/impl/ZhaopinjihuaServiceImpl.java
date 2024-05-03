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


import com.dao.ZhaopinjihuaDao;
import com.entity.ZhaopinjihuaEntity;
import com.service.ZhaopinjihuaService;
import com.entity.vo.ZhaopinjihuaVO;
import com.entity.view.ZhaopinjihuaView;

@Service("zhaopinjihuaService")
public class ZhaopinjihuaServiceImpl extends ServiceImpl<ZhaopinjihuaDao, ZhaopinjihuaEntity> implements ZhaopinjihuaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhaopinjihuaEntity> page = this.selectPage(
                new Query<ZhaopinjihuaEntity>(params).getPage(),
                new EntityWrapper<ZhaopinjihuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhaopinjihuaEntity> wrapper) {
		  Page<ZhaopinjihuaView> page =new Query<ZhaopinjihuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhaopinjihuaVO> selectListVO(Wrapper<ZhaopinjihuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhaopinjihuaVO selectVO(Wrapper<ZhaopinjihuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhaopinjihuaView> selectListView(Wrapper<ZhaopinjihuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhaopinjihuaView selectView(Wrapper<ZhaopinjihuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

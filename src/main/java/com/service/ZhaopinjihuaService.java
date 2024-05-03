package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhaopinjihuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhaopinjihuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaopinjihuaView;


/**
 * 招聘计划
 *
 * @author 
 * @email 
 * @date 2022-03-22 17:13:54
 */
public interface ZhaopinjihuaService extends IService<ZhaopinjihuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaopinjihuaVO> selectListVO(Wrapper<ZhaopinjihuaEntity> wrapper);
   	
   	ZhaopinjihuaVO selectVO(@Param("ew") Wrapper<ZhaopinjihuaEntity> wrapper);
   	
   	List<ZhaopinjihuaView> selectListView(Wrapper<ZhaopinjihuaEntity> wrapper);
   	
   	ZhaopinjihuaView selectView(@Param("ew") Wrapper<ZhaopinjihuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaopinjihuaEntity> wrapper);
   	

}


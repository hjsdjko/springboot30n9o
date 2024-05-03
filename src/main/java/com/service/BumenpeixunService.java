package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BumenpeixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BumenpeixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BumenpeixunView;


/**
 * 部门培训
 *
 * @author 
 * @email 
 * @date 2022-03-22 17:13:54
 */
public interface BumenpeixunService extends IService<BumenpeixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BumenpeixunVO> selectListVO(Wrapper<BumenpeixunEntity> wrapper);
   	
   	BumenpeixunVO selectVO(@Param("ew") Wrapper<BumenpeixunEntity> wrapper);
   	
   	List<BumenpeixunView> selectListView(Wrapper<BumenpeixunEntity> wrapper);
   	
   	BumenpeixunView selectView(@Param("ew") Wrapper<BumenpeixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BumenpeixunEntity> wrapper);
   	

}


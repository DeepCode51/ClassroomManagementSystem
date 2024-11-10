package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BuzhizuoyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BuzhizuoyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BuzhizuoyeView;


/**
 * 布置作业
 *
 * @author 
 * @email 
 * @date 2021-05-03 19:31:03
 */
public interface BuzhizuoyeService extends IService<BuzhizuoyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BuzhizuoyeVO> selectListVO(Wrapper<BuzhizuoyeEntity> wrapper);
   	
   	BuzhizuoyeVO selectVO(@Param("ew") Wrapper<BuzhizuoyeEntity> wrapper);
   	
   	List<BuzhizuoyeView> selectListView(Wrapper<BuzhizuoyeEntity> wrapper);
   	
   	BuzhizuoyeView selectView(@Param("ew") Wrapper<BuzhizuoyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BuzhizuoyeEntity> wrapper);
   	
}


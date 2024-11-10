package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TixingjinggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TixingjinggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TixingjinggaoView;


/**
 * 提醒警告
 *
 * @author 
 * @email 
 * @date 2021-05-03 19:31:03
 */
public interface TixingjinggaoService extends IService<TixingjinggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TixingjinggaoVO> selectListVO(Wrapper<TixingjinggaoEntity> wrapper);
   	
   	TixingjinggaoVO selectVO(@Param("ew") Wrapper<TixingjinggaoEntity> wrapper);
   	
   	List<TixingjinggaoView> selectListView(Wrapper<TixingjinggaoEntity> wrapper);
   	
   	TixingjinggaoView selectView(@Param("ew") Wrapper<TixingjinggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TixingjinggaoEntity> wrapper);
   	
}


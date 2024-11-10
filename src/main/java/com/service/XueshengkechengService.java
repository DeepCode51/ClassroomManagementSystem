package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengkechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengkechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengkechengView;


/**
 * 学生课程
 *
 * @author 
 * @email 
 * @date 2021-05-03 19:31:03
 */
public interface XueshengkechengService extends IService<XueshengkechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengkechengVO> selectListVO(Wrapper<XueshengkechengEntity> wrapper);
   	
   	XueshengkechengVO selectVO(@Param("ew") Wrapper<XueshengkechengEntity> wrapper);
   	
   	List<XueshengkechengView> selectListView(Wrapper<XueshengkechengEntity> wrapper);
   	
   	XueshengkechengView selectView(@Param("ew") Wrapper<XueshengkechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengkechengEntity> wrapper);
   	
}


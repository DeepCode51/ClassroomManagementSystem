package com.dao;

import com.entity.XueshengkechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengkechengVO;
import com.entity.view.XueshengkechengView;


/**
 * 学生课程
 * 
 * @author 
 * @email 
 * @date 2021-05-03 19:31:03
 */
public interface XueshengkechengDao extends BaseMapper<XueshengkechengEntity> {
	
	List<XueshengkechengVO> selectListVO(@Param("ew") Wrapper<XueshengkechengEntity> wrapper);
	
	XueshengkechengVO selectVO(@Param("ew") Wrapper<XueshengkechengEntity> wrapper);
	
	List<XueshengkechengView> selectListView(@Param("ew") Wrapper<XueshengkechengEntity> wrapper);

	List<XueshengkechengView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengkechengEntity> wrapper);
	
	XueshengkechengView selectView(@Param("ew") Wrapper<XueshengkechengEntity> wrapper);
	
}

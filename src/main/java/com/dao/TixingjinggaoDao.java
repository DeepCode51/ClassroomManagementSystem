package com.dao;

import com.entity.TixingjinggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TixingjinggaoVO;
import com.entity.view.TixingjinggaoView;


/**
 * 提醒警告
 * 
 * @author 
 * @email 
 * @date 2021-05-03 19:31:03
 */
public interface TixingjinggaoDao extends BaseMapper<TixingjinggaoEntity> {
	
	List<TixingjinggaoVO> selectListVO(@Param("ew") Wrapper<TixingjinggaoEntity> wrapper);
	
	TixingjinggaoVO selectVO(@Param("ew") Wrapper<TixingjinggaoEntity> wrapper);
	
	List<TixingjinggaoView> selectListView(@Param("ew") Wrapper<TixingjinggaoEntity> wrapper);

	List<TixingjinggaoView> selectListView(Pagination page,@Param("ew") Wrapper<TixingjinggaoEntity> wrapper);
	
	TixingjinggaoView selectView(@Param("ew") Wrapper<TixingjinggaoEntity> wrapper);
	
}

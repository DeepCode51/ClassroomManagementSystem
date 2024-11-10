package com.dao;

import com.entity.BuzhizuoyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BuzhizuoyeVO;
import com.entity.view.BuzhizuoyeView;


/**
 * 布置作业
 * 
 * @author 
 * @email 
 * @date 2021-05-03 19:31:03
 */
public interface BuzhizuoyeDao extends BaseMapper<BuzhizuoyeEntity> {
	
	List<BuzhizuoyeVO> selectListVO(@Param("ew") Wrapper<BuzhizuoyeEntity> wrapper);
	
	BuzhizuoyeVO selectVO(@Param("ew") Wrapper<BuzhizuoyeEntity> wrapper);
	
	List<BuzhizuoyeView> selectListView(@Param("ew") Wrapper<BuzhizuoyeEntity> wrapper);

	List<BuzhizuoyeView> selectListView(Pagination page,@Param("ew") Wrapper<BuzhizuoyeEntity> wrapper);
	
	BuzhizuoyeView selectView(@Param("ew") Wrapper<BuzhizuoyeEntity> wrapper);
	
}

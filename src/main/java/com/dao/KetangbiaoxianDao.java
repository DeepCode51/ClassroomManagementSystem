package com.dao;

import com.entity.KetangbiaoxianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KetangbiaoxianVO;
import com.entity.view.KetangbiaoxianView;


/**
 * 课堂表现
 * 
 * @author 
 * @email 
 * @date 2021-05-03 19:31:03
 */
public interface KetangbiaoxianDao extends BaseMapper<KetangbiaoxianEntity> {
	
	List<KetangbiaoxianVO> selectListVO(@Param("ew") Wrapper<KetangbiaoxianEntity> wrapper);
	
	KetangbiaoxianVO selectVO(@Param("ew") Wrapper<KetangbiaoxianEntity> wrapper);
	
	List<KetangbiaoxianView> selectListView(@Param("ew") Wrapper<KetangbiaoxianEntity> wrapper);

	List<KetangbiaoxianView> selectListView(Pagination page,@Param("ew") Wrapper<KetangbiaoxianEntity> wrapper);
	
	KetangbiaoxianView selectView(@Param("ew") Wrapper<KetangbiaoxianEntity> wrapper);
	
}

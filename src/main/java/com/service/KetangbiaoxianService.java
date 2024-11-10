package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KetangbiaoxianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KetangbiaoxianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KetangbiaoxianView;


/**
 * 课堂表现
 *
 * @author 
 * @email 
 * @date 2021-05-03 19:31:03
 */
public interface KetangbiaoxianService extends IService<KetangbiaoxianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KetangbiaoxianVO> selectListVO(Wrapper<KetangbiaoxianEntity> wrapper);
   	
   	KetangbiaoxianVO selectVO(@Param("ew") Wrapper<KetangbiaoxianEntity> wrapper);
   	
   	List<KetangbiaoxianView> selectListView(Wrapper<KetangbiaoxianEntity> wrapper);
   	
   	KetangbiaoxianView selectView(@Param("ew") Wrapper<KetangbiaoxianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KetangbiaoxianEntity> wrapper);
   	
}


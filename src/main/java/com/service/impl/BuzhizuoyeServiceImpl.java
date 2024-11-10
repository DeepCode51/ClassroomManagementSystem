package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BuzhizuoyeDao;
import com.entity.BuzhizuoyeEntity;
import com.service.BuzhizuoyeService;
import com.entity.vo.BuzhizuoyeVO;
import com.entity.view.BuzhizuoyeView;

@Service("buzhizuoyeService")
public class BuzhizuoyeServiceImpl extends ServiceImpl<BuzhizuoyeDao, BuzhizuoyeEntity> implements BuzhizuoyeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BuzhizuoyeEntity> page = this.selectPage(
                new Query<BuzhizuoyeEntity>(params).getPage(),
                new EntityWrapper<BuzhizuoyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BuzhizuoyeEntity> wrapper) {
		  Page<BuzhizuoyeView> page =new Query<BuzhizuoyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BuzhizuoyeVO> selectListVO(Wrapper<BuzhizuoyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BuzhizuoyeVO selectVO(Wrapper<BuzhizuoyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BuzhizuoyeView> selectListView(Wrapper<BuzhizuoyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BuzhizuoyeView selectView(Wrapper<BuzhizuoyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

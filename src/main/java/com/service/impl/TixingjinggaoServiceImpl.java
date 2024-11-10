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


import com.dao.TixingjinggaoDao;
import com.entity.TixingjinggaoEntity;
import com.service.TixingjinggaoService;
import com.entity.vo.TixingjinggaoVO;
import com.entity.view.TixingjinggaoView;

@Service("tixingjinggaoService")
public class TixingjinggaoServiceImpl extends ServiceImpl<TixingjinggaoDao, TixingjinggaoEntity> implements TixingjinggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TixingjinggaoEntity> page = this.selectPage(
                new Query<TixingjinggaoEntity>(params).getPage(),
                new EntityWrapper<TixingjinggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TixingjinggaoEntity> wrapper) {
		  Page<TixingjinggaoView> page =new Query<TixingjinggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TixingjinggaoVO> selectListVO(Wrapper<TixingjinggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TixingjinggaoVO selectVO(Wrapper<TixingjinggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TixingjinggaoView> selectListView(Wrapper<TixingjinggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TixingjinggaoView selectView(Wrapper<TixingjinggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

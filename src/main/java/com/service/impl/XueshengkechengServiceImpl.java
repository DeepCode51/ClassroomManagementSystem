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


import com.dao.XueshengkechengDao;
import com.entity.XueshengkechengEntity;
import com.service.XueshengkechengService;
import com.entity.vo.XueshengkechengVO;
import com.entity.view.XueshengkechengView;

@Service("xueshengkechengService")
public class XueshengkechengServiceImpl extends ServiceImpl<XueshengkechengDao, XueshengkechengEntity> implements XueshengkechengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengkechengEntity> page = this.selectPage(
                new Query<XueshengkechengEntity>(params).getPage(),
                new EntityWrapper<XueshengkechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengkechengEntity> wrapper) {
		  Page<XueshengkechengView> page =new Query<XueshengkechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengkechengVO> selectListVO(Wrapper<XueshengkechengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengkechengVO selectVO(Wrapper<XueshengkechengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengkechengView> selectListView(Wrapper<XueshengkechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengkechengView selectView(Wrapper<XueshengkechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

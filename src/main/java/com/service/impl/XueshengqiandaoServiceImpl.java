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


import com.dao.XueshengqiandaoDao;
import com.entity.XueshengqiandaoEntity;
import com.service.XueshengqiandaoService;
import com.entity.vo.XueshengqiandaoVO;
import com.entity.view.XueshengqiandaoView;

@Service("xueshengqiandaoService")
public class XueshengqiandaoServiceImpl extends ServiceImpl<XueshengqiandaoDao, XueshengqiandaoEntity> implements XueshengqiandaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengqiandaoEntity> page = this.selectPage(
                new Query<XueshengqiandaoEntity>(params).getPage(),
                new EntityWrapper<XueshengqiandaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengqiandaoEntity> wrapper) {
		  Page<XueshengqiandaoView> page =new Query<XueshengqiandaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengqiandaoVO> selectListVO(Wrapper<XueshengqiandaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengqiandaoVO selectVO(Wrapper<XueshengqiandaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengqiandaoView> selectListView(Wrapper<XueshengqiandaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengqiandaoView selectView(Wrapper<XueshengqiandaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

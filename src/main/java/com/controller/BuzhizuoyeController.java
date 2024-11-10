package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.BuzhizuoyeEntity;
import com.entity.view.BuzhizuoyeView;

import com.service.BuzhizuoyeService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 布置作业
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-03 19:31:03
 */
@RestController
@RequestMapping("/buzhizuoye")
public class BuzhizuoyeController {
    @Autowired
    private BuzhizuoyeService buzhizuoyeService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BuzhizuoyeEntity buzhizuoye,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			buzhizuoye.setJiaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BuzhizuoyeEntity> ew = new EntityWrapper<BuzhizuoyeEntity>();
		PageUtils page = buzhizuoyeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, buzhizuoye), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BuzhizuoyeEntity buzhizuoye, 
		HttpServletRequest request){
        EntityWrapper<BuzhizuoyeEntity> ew = new EntityWrapper<BuzhizuoyeEntity>();
		PageUtils page = buzhizuoyeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, buzhizuoye), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BuzhizuoyeEntity buzhizuoye){
       	EntityWrapper<BuzhizuoyeEntity> ew = new EntityWrapper<BuzhizuoyeEntity>();
      	ew.allEq(MPUtil.allEQMapPre( buzhizuoye, "buzhizuoye")); 
        return R.ok().put("data", buzhizuoyeService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BuzhizuoyeEntity buzhizuoye){
        EntityWrapper< BuzhizuoyeEntity> ew = new EntityWrapper< BuzhizuoyeEntity>();
 		ew.allEq(MPUtil.allEQMapPre( buzhizuoye, "buzhizuoye")); 
		BuzhizuoyeView buzhizuoyeView =  buzhizuoyeService.selectView(ew);
		return R.ok("查询布置作业成功").put("data", buzhizuoyeView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BuzhizuoyeEntity buzhizuoye = buzhizuoyeService.selectById(id);
        return R.ok().put("data", buzhizuoye);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BuzhizuoyeEntity buzhizuoye = buzhizuoyeService.selectById(id);
        return R.ok().put("data", buzhizuoye);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BuzhizuoyeEntity buzhizuoye, HttpServletRequest request){
    	buzhizuoye.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(buzhizuoye);
        buzhizuoyeService.insert(buzhizuoye);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BuzhizuoyeEntity buzhizuoye, HttpServletRequest request){
    	buzhizuoye.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(buzhizuoye);
        buzhizuoyeService.insert(buzhizuoye);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BuzhizuoyeEntity buzhizuoye, HttpServletRequest request){
        //ValidatorUtils.validateEntity(buzhizuoye);
        buzhizuoyeService.updateById(buzhizuoye);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        buzhizuoyeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<BuzhizuoyeEntity> wrapper = new EntityWrapper<BuzhizuoyeEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = buzhizuoyeService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}

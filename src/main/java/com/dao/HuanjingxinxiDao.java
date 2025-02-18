package com.dao;

import com.entity.HuanjingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuanjingxinxiVO;
import com.entity.view.HuanjingxinxiView;


/**
 * 环境信息
 * 
 * @author 
 * @email 
 * @date 2023-06-08 12:49:59
 */
public interface HuanjingxinxiDao extends BaseMapper<HuanjingxinxiEntity> {
	
	List<HuanjingxinxiVO> selectListVO(@Param("ew") Wrapper<HuanjingxinxiEntity> wrapper);
	
	HuanjingxinxiVO selectVO(@Param("ew") Wrapper<HuanjingxinxiEntity> wrapper);
	
	List<HuanjingxinxiView> selectListView(@Param("ew") Wrapper<HuanjingxinxiEntity> wrapper);

	List<HuanjingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HuanjingxinxiEntity> wrapper);
	
	HuanjingxinxiView selectView(@Param("ew") Wrapper<HuanjingxinxiEntity> wrapper);
	

}

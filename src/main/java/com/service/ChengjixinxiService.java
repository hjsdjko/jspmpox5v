package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengjixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengjixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengjixinxiView;


/**
 * 成绩信息
 *
 * @author 
 * @email 
 * @date 2022-04-01 14:45:37
 */
public interface ChengjixinxiService extends IService<ChengjixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengjixinxiVO> selectListVO(Wrapper<ChengjixinxiEntity> wrapper);
   	
   	ChengjixinxiVO selectVO(@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);
   	
   	List<ChengjixinxiView> selectListView(Wrapper<ChengjixinxiEntity> wrapper);
   	
   	ChengjixinxiView selectView(@Param("ew") Wrapper<ChengjixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengjixinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ChengjixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ChengjixinxiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ChengjixinxiEntity> wrapper);
}


package com.yaojialiu.service;

import com.github.pagehelper.PageInfo;
import com.yaojialiu.entity.Goods;

public interface GoodsService {
	
	int create(Goods goods);
	
	int deleteById(Integer id);
	int deleteBatch(Integer[] ids);
	
	int update(Goods goods);
	
	Goods findById(Integer id);
	
	PageInfo<Goods> list(int pageNum,int pageSize);
}

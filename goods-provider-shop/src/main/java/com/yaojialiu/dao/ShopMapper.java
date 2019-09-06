package com.yaojialiu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.yaojialiu.entity.Shop;

@Mapper
public interface ShopMapper {
	
	@Select("select * from tb_shop")
	@ResultType(Shop.class)
	List<Shop> getAllShops();
}

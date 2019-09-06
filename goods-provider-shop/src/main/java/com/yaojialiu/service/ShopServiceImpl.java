package com.yaojialiu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.yaojialiu.dao.ShopMapper;
import com.yaojialiu.entity.Shop;

@Service(interfaceClass=ShopService.class)
public class ShopServiceImpl  implements ShopService{
	
	@Autowired
	ShopMapper shopMapper;
	
	public List<Shop> getShopList(){
		return shopMapper.getAllShops();
	}
}

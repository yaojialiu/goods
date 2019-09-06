package com.yaojialiu;

import java.io.IOException;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageInfo;
import com.yaojialiu.entity.AddressEnum;
import com.yaojialiu.entity.CategoryEnum;
import com.yaojialiu.entity.Goods;
import com.yaojialiu.service.GoodsService;


public class BootStart {
	public static void main(String[] args) throws IOException {
		System.out.println("kaishi");
		//org.apache.ibatis.type.JdbcType.INTEGER
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*GoodsService gs = context.getBean(GoodsService.class);
		PageInfo<Goods> pageInfo = gs.list(1, 3);
		System.out.println("pageinfo is " + pageInfo);
		
		Goods goods = new Goods();
		goods.setAddress(AddressEnum.����);
		goods.setCategory(CategoryEnum.����);
		goods.setName("skii");
		goods.setCreateDate(new Date(102,3,23));
		gs.create(goods);
		*/
		
		System.in.read();
		
		
		
	}

}

package com.yaojialiu.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class Goods implements Serializable {
	
	private Integer id;
	private String name;
	private String category;
	private String address;
	
	private Date createDate;
	private String shopIds;
	private String shopNames;
	
	private Integer shopIdArr[];

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getShopIds() {
		return shopIds;
	}

	public void setShopIds(String shopIds) {
		this.shopIds = shopIds;
	}

	public String getShopNames() {
		return shopNames;
	}

	public void setShopNames(String shopNames) {
		this.shopNames = shopNames;
	}

	public Integer[] getShopIdArr() {
		return shopIdArr;
	}

	public void setShopIdArr(Integer[] shopIdArr) {
		this.shopIdArr = shopIdArr;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", category=" + category + ", address=" + address
				+ ", createDate=" + createDate + ", shopIds=" + shopIds + ", shopNames=" + shopNames + ", shopIdArr="
				+ Arrays.toString(shopIdArr) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(shopIdArr);
		result = prime * result + ((shopIds == null) ? 0 : shopIds.hashCode());
		result = prime * result + ((shopNames == null) ? 0 : shopNames.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(shopIdArr, other.shopIdArr))
			return false;
		if (shopIds == null) {
			if (other.shopIds != null)
				return false;
		} else if (!shopIds.equals(other.shopIds))
			return false;
		if (shopNames == null) {
			if (other.shopNames != null)
				return false;
		} else if (!shopNames.equals(other.shopNames))
			return false;
		return true;
	}
	
	
}

package com.demo.backstage.dao;

import java.util.List;

import com.demo.backstage.doman.ProductInfo;

public interface productInfoDao {
	
	/**
	 * 查询产品列表
	 * liufei 2015-12-26
	 * 
	 * @param productId
	 * @return
	 */
	public List<ProductInfo> getProductInfo(Integer productId);

}

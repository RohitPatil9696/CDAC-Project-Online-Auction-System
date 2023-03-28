package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.ProductSold;
import com.example.demo.entities.User;
import com.example.demo.repositories.ProductSoldRepository;

@Service
public class ProductSoldService {

	@Autowired
	ProductSoldRepository psrepo;
	
	@Autowired
	UserService userv;
		
	public ProductSold save(ProductSold ps)
	{
		return psrepo.save(ps);
	}
	
	public List<ProductSold> productsPurchased(int bidderr_id)
	{
		User bidder_id=userv.getById(bidderr_id);
		return psrepo.productsPurchased(bidder_id);
	}
		
	public List<ProductSold> productsSoldSeller(int sellerr_id)
	{
		User seller_id = userv.getById(sellerr_id);
		return psrepo.productsSoldSeller(seller_id);
	}
	
	public List<ProductSold> productsSoldAdmin()
	{
		return psrepo.productsSoldAdmin();
	}
}

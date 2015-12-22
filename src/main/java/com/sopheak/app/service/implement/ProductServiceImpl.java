package com.sopheak.app.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sopheak.app.dao.IProductDao;
import com.sopheak.app.entities.Product;
import com.sopheak.app.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	IProductDao prodao;
	
	@Override
	@Transactional
	public List<Product> listAllProduct() {
		return prodao.list();
	}

	@Override
	@Transactional
	public boolean deleteProductById(int id) {
		return prodao.Delete(id);
	}

}

package com.cineverse.erpc.product.service;

import com.cineverse.erpc.product.aggregate.entity.Product;
import com.cineverse.erpc.product.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<Product> findProductList();

    ProductDTO findProductById(Long productId);
}

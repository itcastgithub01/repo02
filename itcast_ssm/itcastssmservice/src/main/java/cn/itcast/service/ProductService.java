package cn.itcast.service;

import cn.itcast.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll() throws Exception;
    void findProduct();

}

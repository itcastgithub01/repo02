package cn.itcast.controller;

import cn.itcast.domain.Product;
import cn.itcast.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/findAll")
    public String testFindAll(Model model) throws Exception {
        List<Product> products = productService.findAll();
        model.addAttribute("products",products);
        return "product-list";
    }
}

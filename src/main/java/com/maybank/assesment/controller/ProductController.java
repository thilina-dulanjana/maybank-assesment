package com.maybank.assesment.controller;

import java.util.Optional;

import com.maybank.assesment.entity.Product;
import com.maybank.assesment.service.ProductService;
import com.maybank.assesment.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// import io.swagger.annotations.Api;
// import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/product")
// @Api(value="onlineproducts", description="Operations pertaining to products in Online Store")
public class ProductController {
    @Autowired
    private ProductService productService;

    
    // public void setProductService(ProductService productService) {
    //     this.productService = productService;
    // }

    // @ApiOperation(value = "Search a product with an ID",response = Product.class)
    @RequestMapping(value = "/get/{id}", method= RequestMethod.GET)
    public Product getProductById(@PathVariable Integer id, Model model){
        Optional<Product> op =  productService.getProduct(id);        
        Product product = op.isPresent() ? op.get() : null;
        System.out.println(product);
        return product;

    }

    // @ApiOperation(value = "List all products",response = Product.class)
    @RequestMapping(value = "/get", method= RequestMethod.GET, produces = "application/json")
    public Iterable<Product> list(Model model){
        try {
            Iterable<Product> productList = productService.listAllProducts();
            System.out.println(productList);
            return productList;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
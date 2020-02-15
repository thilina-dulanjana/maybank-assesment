package com.maybank.assesment.controller;

import java.util.ArrayList;
import java.util.List;

import com.maybank.assesment.entity.Merchant;
import com.maybank.assesment.service.MerchantService;
import com.maybank.assesment.service.MerchantServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Validated
@RequestMapping("/merchant")
@Api(value="onlinemerchants", description="Operations pertaining to merchants in Online Store")
public class MerchantController {

    private MerchantService merchantService;

    @Autowired
    public void setMerchantService(MerchantServiceImpl merchantService) {
        this.merchantService = merchantService;
    }

    @ApiOperation(value = "List all merchants",response = Merchant.class)
    @RequestMapping(value = "/get", method= RequestMethod.GET, produces = "application/json")
    public Merchant getAllMerchant(Model model){
    //    Product product = merchantService.getProductById(id);
        Merchant merchant =  new Merchant();
        merchant.setMerchantId(1);
        merchant.setMerchantDesc("merchantDesc");
        return merchant;

        // Iterable productList = merchantService.listAllProducts();
        // return productList;

    }

    // @ApiOperation(value = "Search a merchant with an ID",response = Merchant.class)
    // @GetMapping(value = "/get", produces = "application/json")
    // public Iterable list(Model model){
    //     List<Merchant> list = new ArrayList<>(5);
    //     Iterable productList =;
    //     return productList;

    // }
}
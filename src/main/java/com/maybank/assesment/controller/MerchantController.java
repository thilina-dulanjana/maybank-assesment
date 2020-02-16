package com.maybank.assesment.controller;

import java.util.Optional;

import com.maybank.assesment.entity.Merchant;
import com.maybank.assesment.service.MerchantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/merchant")
@Api(value="onlinemerchants", description="Operations pertaining to merchants in Online Store")
public class MerchantController {

    private MerchantService merchantService;

    @Autowired
    public void setMerchantService(MerchantService merchantService) {
        this.merchantService = merchantService;
    }

    @ApiOperation(value = "Search a merchant with an ID",response = Merchant.class)
    @RequestMapping(value = "/get/{id}", method= RequestMethod.GET, produces = "application/json")
    public Merchant getMerchantById(@PathVariable Integer id, Model model){
        Optional<Merchant> op =  merchantService.getMerchant(id);
        Merchant merchant = op.isPresent() ? op.get() : null;
        return merchant;

    }

    @ApiOperation(value = "List all merchants",response = Merchant.class)
    @RequestMapping(value = "/get", method= RequestMethod.GET, produces = "application/json")
    public Iterable<Merchant> list(Model model){
        Iterable<Merchant> merchantList = merchantService.listAllMerchants();
        return merchantList;
    }
}
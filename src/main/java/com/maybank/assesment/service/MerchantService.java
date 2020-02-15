package com.maybank.assesment.service;

import java.util.List;

import com.maybank.assesment.entity.Merchant;
import org.springframework.stereotype.Service;


public interface MerchantService {
    Merchant gMerchant(Integer id);

    List<Merchant> getAll();
}
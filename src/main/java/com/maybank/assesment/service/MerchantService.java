package com.maybank.assesment.service;

import java.util.List;
import java.util.Optional;

import com.maybank.assesment.entity.Merchant;


public interface MerchantService {
    Optional<Merchant> getMerchant(Integer id);

    List<Merchant> listAllMerchants();
}
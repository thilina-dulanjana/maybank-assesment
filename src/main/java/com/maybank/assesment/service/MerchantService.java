package com.maybank.assesment.service;

import java.util.Optional;

import com.maybank.assesment.entity.Merchant;


public interface MerchantService {
    Optional<Merchant> getMerchant(Integer id);

    Iterable<Merchant> listAllMerchants();
}
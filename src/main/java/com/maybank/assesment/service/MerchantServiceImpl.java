package com.maybank.assesment.service;

import java.util.List;
import java.util.Optional;

import com.maybank.assesment.entity.Merchant;
import com.maybank.assesment.repository.MerchantRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantServiceImpl implements MerchantService {
    @Autowired
    private MerchantRepository merchantRepository;

    @Override
    public Optional<Merchant> getMerchant(Integer id) {        
        return merchantRepository.findById(id);
    }

    @Override
    public List<Merchant> listAllMerchants() {
        return merchantRepository.findAll();
    }

}
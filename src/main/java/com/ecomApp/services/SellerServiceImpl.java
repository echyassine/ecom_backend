package com.ecomApp.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomApp.entities.Seller;
import com.ecomApp.repositories.SellerRepository;
@Service
@Transactional
public class SellerServiceImpl implements ISellerService {
    @Autowired
    SellerRepository sellerRepository;

    @Override
    public Seller addSeller(Seller s) {
        return sellerRepository.save(s);
    }

    @Override
    public List<Seller> getSellers() {
        return sellerRepository.findAll();
    }

    @Override
    public Optional<Seller> getSeller(Long id) {
        return sellerRepository.findById(id);
    }

    @Override
    public Boolean deleteSeller(Long id) {
        sellerRepository.deleteById(id);
        return !sellerRepository.existsById(id);
    }
}




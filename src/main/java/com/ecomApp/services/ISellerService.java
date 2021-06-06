package com.ecomApp.services;

import java.util.List;
import java.util.Optional;

import com.ecomApp.entities.Seller;

public interface ISellerService {

    Seller addSeller(Seller s);
    List<Seller> getSellers();
    Optional<Seller> getSeller(Long id);
    Boolean deleteSeller(Long id);

}



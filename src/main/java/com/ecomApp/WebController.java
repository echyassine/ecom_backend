package com.ecomApp.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecomApp.entities.Seller;
import com.ecomApp.services.ISellerService;

@RestController
class SellerController {
    @Autowired
    ISellerService sellerService;

    @PostMapping("/sellers")
    public Seller addSeller(@RequestBody Seller seller) {
        return sellerService.addSeller(seller);
    }

    @GetMapping("/sellers")
    public List<Seller> getSellers(){
        return sellerService.getSellers();
    }

    @GetMapping("/sellers/{id}")
    public Optional<Seller> getSeller(@PathVariable Long id) {
        return sellerService.getSeller(id);
    }

    @DeleteMapping("/Sellers/{id}")
    public Boolean deleteSeller(@PathVariable Long id) {
        return sellerService.deleteSeller(id);
    }



}

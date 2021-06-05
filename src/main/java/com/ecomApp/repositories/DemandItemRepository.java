package com.ecomApp.repositories;


import com.ecomApp.entities.DemandItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandItemRepository extends JpaRepository<DemandItem,Long> {
}

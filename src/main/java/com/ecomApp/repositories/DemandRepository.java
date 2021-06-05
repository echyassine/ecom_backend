package com.ecomApp.repositories;

import com.ecomApp.entities.Demand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandRepository extends JpaRepository<Demand,Long> {
}

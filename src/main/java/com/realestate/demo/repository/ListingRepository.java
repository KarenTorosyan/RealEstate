package com.realestate.demo.repository;

import com.realestate.demo.model.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepository extends JpaRepository<Listing,Integer> {
}

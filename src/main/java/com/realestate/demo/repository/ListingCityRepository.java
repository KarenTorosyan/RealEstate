package com.realestate.demo.repository;

import com.realestate.demo.model.ListingCity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingCityRepository extends JpaRepository<ListingCity, Integer> {
}

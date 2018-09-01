package com.realestate.demo.repository;

import com.realestate.demo.model.ListingState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingStateRepository extends JpaRepository<ListingState,Integer> {
}

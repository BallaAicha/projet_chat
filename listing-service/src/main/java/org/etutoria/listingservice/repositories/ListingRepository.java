package org.etutoria.listingservice.repositories;

import org.etutoria.listingservice.entities.Listing;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ListingRepository extends JpaRepository<Listing, String> {
}
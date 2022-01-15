package com.example.HotelAdvertisement.welcome;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WelcomeRepository
        extends JpaRepository<Welcome,Integer> {
  @Query("SELECT s FROM Welcome s WHERE s.email=?1")
    Optional<Welcome> findWelcomeByEmail(String email);
}

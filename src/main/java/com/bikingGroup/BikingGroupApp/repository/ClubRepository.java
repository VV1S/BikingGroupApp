package com.bikingGroup.BikingGroupApp.repository;

import com.bikingGroup.BikingGroupApp.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club, Long> {
    Optional<Club> findByTitle(String url);
}

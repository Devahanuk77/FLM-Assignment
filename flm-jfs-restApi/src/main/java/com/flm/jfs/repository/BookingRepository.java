package com.flm.jfs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flm.jfs.model.UserBookings;

@Repository
public interface BookingRepository extends JpaRepository<UserBookings, String> {

}

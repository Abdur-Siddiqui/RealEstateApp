package com.example.realestateapp.Repository;

import com.example.realestateapp.Entity.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookingRepository extends CrudRepository<Booking, Long> {


}

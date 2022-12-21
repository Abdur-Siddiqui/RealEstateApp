package com.example.realestateapp.Service;

import com.example.realestateapp.Entity.Property;
import com.example.realestateapp.Repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    @Autowired
    static
    PropertyRepository propertyRepository;

    public static List<Property> getAllProperties(){
        return (List<Property>) propertyRepository.findAll();
    }

}

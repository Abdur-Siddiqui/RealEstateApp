package com.example.realestateapp.Controller;

import com.example.realestateapp.Entity.Property;
import com.example.realestateapp.Response.PropertyResponse;
import com.example.realestateapp.Service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/properties")
public class PropertyController {
    @Autowired
    PropertyService propertyService;

    @GetMapping()
    public List<PropertyResponse> getAllProperties(){
        List<Property> properties= PropertyService.getAllProperties();
        List<PropertyResponse> propertyResponse = new ArrayList<>();
        properties.forEach(property -> {
            propertyResponse.add(new PropertyResponse(property));
        });
return propertyResponse;
    }
}

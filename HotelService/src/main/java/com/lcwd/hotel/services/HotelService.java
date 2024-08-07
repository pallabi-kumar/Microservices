package com.lcwd.hotel.services;

import com.lcwd.hotel.entities.Hotel;
import java.util.List;

public interface HotelService {
    //create
    Hotel create(Hotel hotel);
    //get all hotels
    List<Hotel> getAll();
    //get single hotel
    Hotel get(String id);


}

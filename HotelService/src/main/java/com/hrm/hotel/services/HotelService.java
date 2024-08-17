package com.hrm.hotel.services;

import com.hrm.hotel.entity.Hotel;

import java.util.List;

public interface HotelService {

//    Create
    Hotel createHotel(Hotel hotel);

//    Get All
    List<Hotel> getAll();

//    Get Single
    Hotel getHotel(String hotelId);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hotelhw;

import java.util.Date;

/**
 *
 * @author itzgo
 */
public class hotelReservation {
   
   private int confirmationNo;
   private Date checkInDate, checkOutDate;
   private int adultGuests;
   private int minorGuest;
   private Address hotelInformation;
   private int rooms;
   private int floor;
   private String bedType;
   private String cancellationPolicy;
   

    public hotelReservation(int confirmationNo, Date checkInDate, Date checkOutDate, int adultGuests, int minorGuest, Address hotelInformation, int rooms, int floor, String bedType, String cancellationPolicy) {
        this.confirmationNo = confirmationNo;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.adultGuests = adultGuests;
        this.minorGuest = minorGuest;
        this.hotelInformation = hotelInformation;
        this.rooms = rooms;
        this.floor = floor;
        this.bedType = bedType;
        this.cancellationPolicy = cancellationPolicy;
    }

    public int getConfirmationNo() {
        return confirmationNo;
    }

    public void setConfirmationNo(int confirmationNo) {
        this.confirmationNo = confirmationNo;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getAdultGuests() {
        return adultGuests;
    }

    public void setAdultGuests(int adultGuests) {
        this.adultGuests = adultGuests;
    }

    public int getMinorGuest() {
        return minorGuest;
    }

    public void setMinorGuest(int minorGuest) {
        this.minorGuest = minorGuest;
    }

    public Address getHotelInformation() {
        return hotelInformation;
    }

    public void setHotelInformation(Address hotelInformation) {
        this.hotelInformation = hotelInformation;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    private static class Address {

        public Address() {
        }
    }

    
}

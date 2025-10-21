package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfKINGrooms;
    private int numberOfBasicRooms;
    private int numberOfDoubleBedRooms;
    private int bookedKINGrooms;
    private int bookedBasicRooms;
    private int bookedDoubleBedRooms;
public  int totalNumberOfRooms;

    public Hotel(String name, int numberOfKINGrooms, int numberOfBasicRooms, int numberOfDoubleBedRooms) {
        this.name = name;
        this.numberOfKINGrooms = numberOfKINGrooms;
        this.numberOfBasicRooms = numberOfBasicRooms;
        this.numberOfDoubleBedRooms = numberOfDoubleBedRooms;
        this.bookedKINGrooms = 0;
        this.bookedBasicRooms = 0;
        this.bookedDoubleBedRooms = 0;
        this.totalNumberOfRooms = numberOfKINGrooms + numberOfBasicRooms + numberOfDoubleBedRooms;
    } //2nd constructor

    public int Hotel(String name, int numberOfKINGrooms, int numberOfBasicRooms, int numberOfDoubleBedRooms, int bookedBasicRooms) {
        this.name = name;
        this.numberOfKINGrooms = numberOfKINGrooms;
        this.numberOfBasicRooms = numberOfBasicRooms;
        this.numberOfDoubleBedRooms = numberOfDoubleBedRooms;
        this.bookedKINGrooms = 0;
        this.bookedBasicRooms = 0;
        this.bookedDoubleBedRooms = 0;

        // getter for kingrooms
        public int getAvailableKINGrooms() {
            return numberOfKINGrooms - bookedKINGrooms;
        }
        //getter for available basic rooms
        public int getAvailableBasicRooms() {
            return numberOfBasicRooms - bookedBasicRooms;
        }
        // getter for available double rooms
        public int getAvailableDoubleBedrooms() {
            return numberOfDoubleBedRooms - bookedDoubleBedRooms;
        }
        // attempt to book one or more rooms
        public boolean bookRoom(int totalnumberOfRooms, boolean isKINGroom) {
            if (isKINGroom) {
                if (numberOfBasicRooms <= getAvailableKINGrooms) {
                    bookedKINGrooms += totalnumberOfRooms;
                    return true;
                } else {
                    return false; // not enough suites available
                }
            } else {
                if (numberOfBasicRooms <= getAvailableBasicRooms) {
                    bookedBasicRooms += numberOfBasicRooms;
                    return true;
                } else {
                    return false; // not enough basic rooms available
                }
            }
        }
    }
}
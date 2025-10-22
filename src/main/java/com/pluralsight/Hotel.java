package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfKINGrooms;
    private int numberOfBasicRooms;
    private int numberOfDoubleBedRooms;
    private int bookedKINGrooms;
    private int bookedBasicRooms;
    public int bookedDoubleBedRooms;

    // Constructor that always creates 90 total rooms
    public Hotel(String name) {
        this.name = name;
        this.numberOfKINGrooms = 30;
        this.numberOfBasicRooms = 40;
        this.numberOfDoubleBedRooms = 20;
        this.bookedKINGrooms = 0;
        this.bookedBasicRooms = 0;
        this.bookedDoubleBedRooms = 0;
    }

    // Optional: detailed constructor if you want custom room counts
    public Hotel(String name, int numberOfKINGrooms, int numberOfBasicRooms, int numberOfDoubleBedRooms) {
        this.name = name;
        this.numberOfKINGrooms = numberOfKINGrooms;
        this.numberOfBasicRooms = numberOfBasicRooms;
        this.numberOfDoubleBedRooms = numberOfDoubleBedRooms;
        this.bookedKINGrooms = 0;
        this.bookedBasicRooms = 0;
        this.bookedDoubleBedRooms = 0;
    }

    // Getter for available King rooms
    public int getAvailableKINGrooms() {
        return numberOfKINGrooms - bookedKINGrooms;
    }

    // Getter for available Basic rooms
    public int getAvailableBasicRooms() {
        return numberOfBasicRooms - bookedBasicRooms;
    }

    // Getter for available Double Bed rooms
    public int getAvailableDoubleBedrooms() {
        return numberOfDoubleBedRooms - bookedDoubleBedRooms;
    }

    // Method to attempt booking a room
    public boolean bookRoom(String roomType, int numberToBook) {
        switch (roomType.toLowerCase()) {
            case "king":
                if (numberToBook <= getAvailableKINGrooms()) {
                    bookedKINGrooms += numberToBook;
                    return true;
                }
                break;
            case "basic":
                if (numberToBook <= getAvailableBasicRooms()) {
                    bookedBasicRooms += numberToBook;
                    return true;
                }
                break;
            case "double":
                if (numberToBook <= getAvailableDoubleBedrooms()) {
                    bookedDoubleBedRooms += numberToBook;
                    return true;
                }
                break;
        }
        return false; // not enough rooms available
    }


}
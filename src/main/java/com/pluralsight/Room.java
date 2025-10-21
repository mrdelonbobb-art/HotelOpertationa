package com.pluralsight;

public class Room {
    String roomType;
    private int numberofbeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean hasBalcony;

    public Room(String roomType, int numberofbeds, double price, boolean isOccupied, boolean isDirty,boolean hasBalcony) {
        this.numberofbeds = numberofbeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.hasBalcony = hasBalcony;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberofbeds() {
        return numberofbeds;
    }

    public void setNumberofBeds(int numberofBeds) {
        this.numberofbeds = numberofBeds;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean hasBalcony() {
        return hasBalcony;
    }
    public void setHasBalcony(boolean Balcony) {
        if (Balcony) hasBalcony = true;
        else hasBalcony = false;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isAvailable() {
        if (!this.isDirty() && !this.isOccupied()) {
            return true;
        }

        return false;
    }
}





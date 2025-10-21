package com.pluralsight;

public class Reservations {
    private String roomType;
    private double roomPrice;
    private int  NumberOfNights;
    private boolean isWeekend;
    private double reservationTotal;

    public Reservations(String roomType, double roomPrice, int NumberOfNights, boolean isWeekend, double reservationTotal) {
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.NumberOfNights = NumberOfNights;
        this.reservationTotal = reservationTotal;
    }


    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double price) {
        this.roomPrice = price;
    }

    public int getNumberOfNights() {
        return NumberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        NumberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public void setReservationTotal(double reservationTotal) {
        this.reservationTotal = reservationTotal;
    }

    public double getReservationTotal() {
        double total = this.getNumberOfNights() * this.getRoomPrice();
        if(this.isWeekend()){
            total = total =(total *.1);
        }
        return reservationTotal;

    }

}


package com.pluralsight;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTestTest {
    @Test
    public void getAvailableDoubleBedrooms_ReturnsCorrectValue() {
        // Arrange
        Hotel hotel = new Hotel("Test Hotel", 5, 5, 10);
        hotel.bookRoom("double",3);

        // Act
        int result = hotel.getAvailableDoubleBedrooms();

        // Assert
        assertEquals(7, result);
    }
}


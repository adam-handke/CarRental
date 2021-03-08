package com.car.rental;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    public Client client;
    public Category preferredCategory;
    public Date rentDate;
    public Date returnDate;
    public int childSeat;
    public int bikeRack;
    public Car rentedCar;
    public double rentTotalPrice = -1.0; //kontrolna wartość nieustalona
    public double rentDaysPrice;
    public double equipmentPrice;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Client client, Category preferredCategory, String rentDate, String returnDate, int childSeat, int bikeRack) throws ParseException{
        this.client = client;
        this.preferredCategory = preferredCategory;
        this.rentDate = sdf.parse(rentDate);
        this.returnDate = sdf.parse(returnDate);
        this.childSeat = childSeat;
        this.bikeRack = bikeRack;
        //Wynajęty samochód znajdowany w regułach
        //Kwoty obliczane w regułach
    }

    public String getRentDateAsString(){
        return sdf.format(rentDate);
    }

    public String getReturnDateAsString(){
        return sdf.format(returnDate);
    }

    public long getRentDays() throws ParseException {
        return 1 + TimeUnit.DAYS.convert(returnDate.getTime() - rentDate.getTime(), TimeUnit.MILLISECONDS);
    }

    public long getActualRentDays(Date actualReturnDate) throws ParseException {
        return 1 + TimeUnit.DAYS.convert(actualReturnDate.getTime() - rentDate.getTime(), TimeUnit.MILLISECONDS);
    }
}

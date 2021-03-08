package com.car.rental;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Return {
    public Reservation reservation;
    public Date actualReturnDate;
    public int travelledDistance;
    public int missingHubcaps;
    public int missingRegistrationBook;
    public int missingAssurance;
    //Kwoty obliczane w regułach
    public double returnTotalPrice = -1.0; //kontrolna wartość nieustalona
    public double distancePrice;
    public double missingHubcapPenalty;
    public double missingDocumentPenalty;
    public double delayPenalty;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Return(Reservation reservation, String actualReturnDate, int travelledDistance, int missingHubcaps, int missingRegistrationBook, int missingAssurance) throws ParseException {
        this.reservation = reservation;
        this.actualReturnDate = sdf.parse(actualReturnDate);
        this.travelledDistance = travelledDistance;
        this.missingHubcaps = missingHubcaps;
        this.missingRegistrationBook = missingRegistrationBook;
        this.missingAssurance = missingAssurance;
        //Kwoty obliczane w regułach
    }

    public String getActualReturnDateAsString(){
        return sdf.format(actualReturnDate);
    }
}

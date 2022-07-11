package models;

import java.sql.Time;
import java.util.Date;

public class Reservation {
    private static int RESERVATION_ID;
    private Person person;
    private FoodPlace foodPlace;
    private Date reservationDate;
    private Date reservationTime;
    private boolean isReservationPerformed;

    public Reservation(Person person, FoodPlace foodPlace, Date reservationDate, Date reservationTime, boolean isReservationPerformed) {
        this.person = person;
        this.foodPlace = foodPlace;
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
        this.isReservationPerformed = isReservationPerformed;
    }
}

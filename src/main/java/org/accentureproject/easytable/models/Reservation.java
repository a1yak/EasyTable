package org.accentureproject.easytable.models;

import java.sql.Time;
import java.util.Date;

public class Reservation {
    private static int RESERVATION_ID;
    private Person person;
    private FoodPlace foodPlace;
    private Date reservationDate;
    private Time reservationTime;
    private boolean isReservationPerformed;

}

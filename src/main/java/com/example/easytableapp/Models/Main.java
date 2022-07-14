package com.example.easytableapp.Models;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


// тут пока тестируется примитивная логика в консоли.
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        List<FoodPlace> nameOfPlaces = new ArrayList<>(); // исходя из выбора пользователя по типу общепита
        // сюда будет засунут список из заведений.
        FoodPlace placeForReservation;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d.MM.yyyy");
        SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("k:m");

        Person person;
        Date reservationDate;
        Date reservationTime;
        Reservation reservation = new Reservation();
        boolean exists = false;

        System.out.println("Please choose which food place type you are interested in");
        System.out.println(AllFoodPlaces.getSetOfFoodPlaceTypes()); // выводит все типы общепита для выбора
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        do {
            line = reader.readLine();
            if (FoodPlaceType.checkEnum(line)) { // Для себя: надо сделать так, что он правильно проверял тип общепита, независимо от регистра букв
                //копируем в коллецию все заведения. Решил через метод.
                nameOfPlaces.addAll(AllFoodPlaces.getListOfFoodPlaces().get(FoodPlaceType.getKey(line)));
                // выводит список всех заведений
                System.out.println("List of places:");
                exists = true;
                for (FoodPlace foodPlace : nameOfPlaces) System.out.println(foodPlace.getFoodPlaceName());
            } else System.out.println("No such type");
        } while (!exists);

        exists = false;
        do {
            System.out.println("Please choose place from the list");
            line = reader.readLine();

            for (FoodPlace foodPlace : nameOfPlaces) {
                if (line.equalsIgnoreCase(foodPlace.getFoodPlaceName())) {
                    foodPlace.addReservationToTheList(reservation);// Добавляем резервацию в список всех резереваций этого заведения
                    System.out.println("Please choose reservation date(dd.mm.yyyy) and time(hh:mm):");//формат часов 24
                    exists = true;
                    break;
                }
            }
            if (!exists) System.out.println("There is no such please in the list");
        }while (!exists);


        exists=true;
        do {
            try {
                // добавляем в объект Reservation поля
                System.out.print("Date: ");
                reservationDate = simpleDateFormat.parse(reader.readLine());
                reservation.setReservationDate(reservationDate);
                System.out.println(reservationDate.toString());
                System.out.print("Time: ");
                reservationTime = simpleTimeFormat.parse(reader.readLine());
                reservation.setReservationTime(reservationTime);
                if(reservationDate!=null&&reservationTime!=null) {
                    exists = true;
                }
         }catch (ParseException ex){
                System.out.println("Wrong input, try again...");
                exists = false;
            }
        } while (!exists);
        // добавляем в объект Person поля

        System.out.print("Please enter your Name: ");
        String name = reader.readLine();
        System.out.print("Please enter your Surname: ");
        String surname = reader.readLine();
        System.out.print("Please enter your Email: ");
        String email = reader.readLine();

        person = new Person(name,surname,email);
        reservation.setPerson(person);
        System.out.println("Done");



        System.out.println("Successful reservation, Have a great time!!");
        //короче потом переменные даты и времени засовываются в конструктор объекта Reservation со всеми остальными полями
        // и данными о человеке, который сделал резервацию

    }
}

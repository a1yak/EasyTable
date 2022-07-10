package org.accentureproject.easytable.models;


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


        System.out.println("Please choose which food place type you are interested in");
        System.out.println(AllFoodPlaces.getSetOfFoodPlaceTypes()); // выводит все типы общепита для выбора
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        if (FoodPlaceType.checkEnum(line)) { // Для себя: надо сделать так, что он правильно проверял тип общепита, независимо от регистра букв
            //копируем в коллецию все заведения. Решил через метод.
            nameOfPlaces.addAll(AllFoodPlaces.getListOfFoodPlaces().get(FoodPlaceType.getKey(line)));
            // выводит список всех заведений
            System.out.println("List of places:");
            for (FoodPlace foodPlace : nameOfPlaces) System.out.println(foodPlace.getFoodPlaceName());
        } else System.out.println("No such type");

        System.out.println("Please choose  place from the list");

        line = reader.readLine();

        for (FoodPlace foodPlace : nameOfPlaces) {
            if (line.equalsIgnoreCase(foodPlace.getFoodPlaceName())) {
                placeForReservation = foodPlace;// присваиваем выбранное заведение новой переменной, чтоб потом заполнить ей поля
                System.out.println("Please choose reservation date(dd.mm.yyyy) and time(hh:mm):");//формат часов 24
                break;
            } else System.out.println("There is no such please in the list");
        }
        System.out.print("Date: ");
        line= reader.readLine();
        Date date = simpleDateFormat.parse(line);
        System.out.println(date.toString());
        System.out.print("Time: ");
        line = reader.readLine();
        Date time = simpleTimeFormat.parse(line);
        //короче потом переменные даты и времени засовываются в конструктор объекта Reservation со всеми остальными полями
        // и данными о человеке, который сделал резервацию




    }
}

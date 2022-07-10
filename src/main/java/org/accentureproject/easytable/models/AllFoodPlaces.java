package org.accentureproject.easytable.models;

import java.util.*;
// тут коллекции со всеми типами общепита, у каждого типа общепита своя коллекция со списком из заведений,
// мапа, чтоб по типу общепита найти список заведений этого типа
public class AllFoodPlaces {
    private static Set<FoodPlaceType> setOfFoodPlaceTypes;
    private static Set<FoodPlace> setOfCafe;
    private static Map<FoodPlaceType,Set<FoodPlace>> listOfFoodPlaces;
    static {
        //Множество с видами общепита
        setOfFoodPlaceTypes = new TreeSet<>();
        setOfFoodPlaceTypes.addAll(Arrays.asList(FoodPlaceType.BAR, FoodPlaceType.CAFE,
                FoodPlaceType.RESTAURANT, FoodPlaceType.HOOKAH_BAR));

        //Множество общепита вида - Cafe
        setOfCafe = new TreeSet<>();
        setOfCafe.addAll(Arrays.asList(new FoodPlace("Cafe1",FoodPlaceType.CAFE),
                new FoodPlace("Cafe2",FoodPlaceType.CAFE),
                new FoodPlace("Cafe3", FoodPlaceType.CAFE)));

        //Мапа, где ключ - вид общепита, а значение - множества конкретного типа общепита.
        // То есть еслю ключ - Cafe, то значение - список всех кафешек,если ключ - ресторан, то значение список всех ресторанов

        listOfFoodPlaces = new TreeMap<>();
        listOfFoodPlaces.put(FoodPlaceType.CAFE,setOfCafe);
    }

    public static Set<FoodPlaceType> getSetOfFoodPlaceTypes() {
        return setOfFoodPlaceTypes;
    }

    public static Set<FoodPlace> getSetOfCafe() {
        return setOfCafe;
    }

    public static Map<FoodPlaceType, Set<FoodPlace>> getListOfFoodPlaces() {
        return listOfFoodPlaces;
    }
}

package models;

import java.util.*;
// тут коллекции со всеми типами общепита, у каждого типа общепита своя коллекция со списком из заведений,
// мапа, чтоб по типу общепита найти список заведений этого типа
public class AllFoodPlaces {
    private static Set<FoodPlaceType> setOfFoodPlaceTypes;

    private static Set<FoodPlace> setOfCafe;
    private static Set<FoodPlace> setOfBars;
    private static Set<FoodPlace> setOfRestaurants;
    private static Set<FoodPlace> setOfHookah;

    private static Map<FoodPlaceType,Set<FoodPlace>> listOfFoodPlaces;


    static {
        //Множество с видами общепита
        setOfFoodPlaceTypes = new TreeSet<>();
        setOfFoodPlaceTypes.addAll(Arrays.asList(FoodPlaceType.getFoodPlaceType()));

        //Множество общепита вида - Cafe
        setOfCafe = new TreeSet<>();
        setOfCafe.addAll(Arrays.asList(new FoodPlace("Cafe1",FoodPlaceType.CAFE),
                new FoodPlace("Cafe2",FoodPlaceType.CAFE),
                new FoodPlace("Cafe3", FoodPlaceType.CAFE)));

        //бары
        setOfBars = new TreeSet<>();
        setOfBars.addAll(Arrays.asList(new FoodPlace("Bar1",FoodPlaceType.BAR),
                new FoodPlace("Bar2",FoodPlaceType.BAR),new FoodPlace("Bar3",FoodPlaceType.BAR)));

        //рестораны
        setOfRestaurants = new TreeSet<>();
        setOfRestaurants.addAll(Arrays.asList(new FoodPlace("Restaurant1", FoodPlaceType.RESTAURANT),
                new FoodPlace("Restaurant2", FoodPlaceType.RESTAURANT),
                new FoodPlace("Restaurant3", FoodPlaceType.RESTAURANT)));

        //кальяны
        setOfHookah = new TreeSet<>();
        setOfHookah.addAll(Arrays.asList(new FoodPlace("Hookah1",FoodPlaceType.HOOKAH_BAR),
                new FoodPlace("Hookah2",FoodPlaceType.HOOKAH_BAR),
                new FoodPlace("Hookah3",FoodPlaceType.HOOKAH_BAR)));


        //Мапа, где ключ - вид общепита, а значение - множества конкретного типа общепита.
        // То есть еслю ключ - Cafe, то значение - список всех кафешек,если ключ - ресторан, то значение список всех ресторанов

        listOfFoodPlaces = new TreeMap<>();
        listOfFoodPlaces.put(FoodPlaceType.CAFE,setOfCafe);
        listOfFoodPlaces.put(FoodPlaceType.BAR, setOfBars);
        listOfFoodPlaces.put(FoodPlaceType.RESTAURANT,setOfRestaurants);
        listOfFoodPlaces.put(FoodPlaceType.HOOKAH_BAR, setOfHookah);
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

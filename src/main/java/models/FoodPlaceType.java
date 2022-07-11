package models;

public enum FoodPlaceType {
    RESTAURANT,
    BAR,
    CAFE,
    HOOKAH_BAR;

    public static FoodPlaceType[] getFoodPlaceType(){
        return new FoodPlaceType[]{RESTAURANT,BAR,CAFE,HOOKAH_BAR};
    }

    //получаем Enum по строке
    public static FoodPlaceType getKey(String s){
        for (FoodPlaceType fpt : getFoodPlaceType()) {
            if (fpt.toString().equalsIgnoreCase(s)) {
                return fpt;
            }
        }
        return null;
    }
    //сравниваем Enum со строкой, независиво от регистра букв
    public static boolean checkEnum(String s) {
        for(FoodPlaceType fpt : getFoodPlaceType()) {
            if (fpt.toString().equalsIgnoreCase(s)) return true;
        }
        return false;
    }
}

package Task3;

public class HotelCharacteristics {
    int stars;
    FoodType foodType;
    int bedCount;
    boolean isTVPresent;



    public HotelCharacteristics(){

    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public boolean isTVPresent() {
        return isTVPresent;
    }

    public void setTVPresent(boolean TVPresent) {
        isTVPresent = TVPresent;
    }

    public boolean isConditionerPresent() {
        return isConditionerPresent;
    }

    public void setConditionerPresent(boolean conditionerPresent) {
        isConditionerPresent = conditionerPresent;
    }

    boolean isConditionerPresent;
    HotelCharacteristics(int stars, FoodType foodType, int bedCount, boolean isConditionerPresent, boolean isTVPresent){
        this.stars=stars;
        this.foodType=foodType;
        this.bedCount = bedCount;
        this.isConditionerPresent = isConditionerPresent;
        this.isTVPresent =isTVPresent;
    }
    @Override
    public String toString() {
        return "HotelCharacteristics{" +
                "stars=" + stars +
                ", foodType=" + foodType +
                ", bedCount=" + bedCount +
                ", isTVPresent=" + isTVPresent +
                ", isConditionerPresent=" + isConditionerPresent +
                '}';
    }
}

package Task9;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



public class HotelCharacteristics {
    int stars;
    FoodType foodType;
    int bedCount;
    boolean isTVPresent;

    public int getStars() {
        return stars;
    }
    @XmlElement
    public void setStars(int stars) {
        this.stars = stars;
    }

    public FoodType getFoodType() {
        return foodType;
    }
    @XmlElement
    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public int getBedCount() {
        return bedCount;
    }
    @XmlElement
    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public boolean isTVPresent() {
        return isTVPresent;
    }
    @XmlElement
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
}

package passProperties;

import lombok.Getter;

@Getter
public enum DaysNum {
    ONE_DAY(1), TWO_DAYS(2), FIVE_DAYS(5);
    private int numberOfDays;
    DaysNum(int numberOfDays){
        this.numberOfDays = numberOfDays;
    }

}

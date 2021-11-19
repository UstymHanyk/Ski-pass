package passProperties;

import lombok.Getter;
@Getter

public enum LiftsNum {
    TEN_LIFTS(10), TWENTY_LIFTS(20), FIFTY_LIFTS(50), HUNDRED_LIFTS(100);
    @Getter
    private int numberOfLifts;
    LiftsNum(int numberOfLifts){
        this.numberOfLifts = numberOfLifts;
    }
}

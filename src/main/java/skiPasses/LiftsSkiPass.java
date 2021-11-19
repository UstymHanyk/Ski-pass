package skiPasses;

import passProperties.DayTypes;
import passProperties.LiftsNum;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class LiftsSkiPass extends SkiPass{

    LiftsSkiPass(DayTypes dayType, LiftsNum durationInLifts) {
        this.dayType = dayType;
        this.duration = durationInLifts.getNumberOfLifts();
        this.blocked = false;
    }

    @Override
    public void use(){
        if (isCorrectWeekType(LocalDate.now())){
            duration--;
        }
    }
}

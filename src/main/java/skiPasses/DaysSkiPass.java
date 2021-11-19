package skiPasses;

import passProperties.DayTypes;
import passProperties.DaysNum;

import java.time.LocalDate;

public class DaysSkiPass extends SkiPass{
    private LocalDate lastUsageDate;

    DaysSkiPass(DayTypes dayType, DaysNum durationInDays) {
        this.dayType = dayType;
        lastUsageDate = LocalDate.now();

        this.duration = durationInDays.getNumberOfDays();
        this.blocked = false;
    }
    
    @Override
    // decrement if the day changed
    public void use(){
        LocalDate currentDate = LocalDate.now();
        if (isCorrectWeekType(currentDate)) {
            if (!currentDate.equals(lastUsageDate)) {
                lastUsageDate = currentDate;
                duration--;
            }
        }
    }
}

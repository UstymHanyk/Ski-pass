package skiPasses;

import idGenerator.idGenerator;
import lombok.Getter;
import lombok.Setter;
import passProperties.DayTypes;

import java.time.LocalDate;

@Getter @Setter
public abstract class SkiPass {
    private int id;
    protected DayTypes dayType;
    protected boolean blocked;
    protected int duration;
    // Constructor is package only and private only
    SkiPass() {
        this.id = idGenerator.nextId();
    }


    // Check if the specified weekday corresponds to the current one
    protected boolean isCorrectWeekType(LocalDate date){
        int weekDay = date.getDayOfWeek().getValue();
        if (dayType == DayTypes.WEEKDAY){  // check if the day is a weekday(Mon-Fri)
            return weekDay != 6 && weekDay != 7;
        }
        else if (dayType == DayTypes.WEEKEND) {
            return weekDay == 6 || weekDay == 7;
        }
        return false;
    }
    public abstract void use();
    public boolean isUsable() {
        return duration > 0;
    }
}

package skiPasses;

import passProperties.DayTypes;
import passProperties.Seasons;


import java.time.LocalDate;


public class SeasonSkiPass extends SkiPass{
    private LocalDate yearOfActivation;
    private Seasons season;

    SeasonSkiPass(Seasons season) {
        this.dayType = DayTypes.WEEKEND;  // only on weekends
        this.blocked = false;
        this.season = season;
        yearOfActivation = LocalDate.of(1000,1,1);
        this.duration = 1;
    }
    @Override
    public void use(){
        if (isCorrectWeekType(LocalDate.now())){
            int currentMonth = LocalDate.now().getDayOfWeek().getValue();
            // disable the pass if 365 days after the activation have passed
            if (LocalDate.now().isAfter(yearOfActivation.plusYears(1))){
                duration=0;
            }
            if (((currentMonth == 12 || (currentMonth >= 1 && currentMonth <= 2)) && season == Seasons.WINTER)||
                    ((currentMonth > 2 && currentMonth < 6) && season == Seasons.SPRING) ||
                ((currentMonth > 5 && currentMonth < 9) && season == Seasons.SUMMER) ||
                ((currentMonth > 8 && currentMonth < 12) && season == Seasons.AUTUMN)) {
                yearOfActivation = LocalDate.now();
            }
        }
    }
}

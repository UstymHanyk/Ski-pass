package skiPasses;

import passProperties.DayTypes;
import passProperties.DaysNum;
import passProperties.LiftsNum;
import passProperties.Seasons;

public class PassSystem {

    private static PassSystem passSystem;

    private PassSystem() {
    }

    public static PassSystem getPassSystem(){
        if (passSystem == null) {  // ensure that the system exists and in only one instance
            passSystem = new PassSystem();
        }
        return passSystem;
    }

    public void blockSkiPass(SkiPass skiPass){
        skiPass.setBlocked(true);
    }

    public DaysSkiPass generateSkiPass(DayTypes dayType, DaysNum numberOfDays){
        if ((numberOfDays.getNumberOfDays() == 5)&&(dayType==DayTypes.WEEKEND)){
            System.out.println("Pass could not be generated, generating ");
        }
        return new DaysSkiPass(dayType, numberOfDays);
    }

    public LiftsSkiPass generateSkiPass(DayTypes weekType, LiftsNum numberofLifts){
        return new LiftsSkiPass(weekType, numberofLifts);

    }

    public SeasonSkiPass generateSeasonSkiPass(Seasons season){
        return new SeasonSkiPass(season);
    }
}

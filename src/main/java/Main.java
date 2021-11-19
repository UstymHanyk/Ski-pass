import passProperties.DayTypes;
import passProperties.DaysNum;
import passProperties.LiftsNum;
import skiPasses.DaysSkiPass;
import skiPasses.LiftsSkiPass;
import skiPasses.PassSystem;
import turnstile.Turnstile;


public class Main {
    public static void main(String[] args) {
        Turnstile turnstile = new Turnstile();
        PassSystem passSystem = PassSystem.getPassSystem(); // the order of initializing turnstile/system does not matter

        DaysSkiPass fiveWeekdayPass = passSystem.generateSkiPass(DayTypes.WEEKDAY, DaysNum.FIVE_DAYS);
        for(int iLift = 1; iLift <= 12; iLift++){
            System.out.println("-- The outcome of " +iLift+" use of the 5 weekday pass:");
            turnstile.scanSkiPass(fiveWeekdayPass);
        }
        System.out.println("\n\n");



        LiftsSkiPass tenLiftWeekdayPass = passSystem.generateSkiPass(DayTypes.WEEKDAY, LiftsNum.TEN_LIFTS);

        for(int iLift = 1; iLift <= 12; iLift++){
            System.out.println("-- The outcome of " +iLift+" use of the 10 lift pass:");
            turnstile.scanSkiPass(tenLiftWeekdayPass);
        }

    }
}

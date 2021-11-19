package turnstile;

import skiPasses.PassSystem;
import skiPasses.SkiPass;

public class Turnstile {

    private final PassSystem passSystem = PassSystem.getPassSystem();

    public boolean scanSkiPass(SkiPass card){
        if (!card.isBlocked()) {
            if (card.isUsable()) {
                card.use();
                System.out.println("Pass accepted, pass id: " + card.getId());
                return true;
            }
        }
        System.out.println("Pass declined, pass id: " + card.getId());
        return false;
    }
}

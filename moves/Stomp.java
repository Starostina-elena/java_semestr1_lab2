package moves;

import ru.ifmo.se.pokemon.*;

public class Stomp extends PhysicalMove {

    public Stomp() {
        super(Type.NORMAL, 65, 100);
    }

    @Override
    protected String describe() {
        return "наступает на врага";
    }

    @Override
    public void applyOppEffects(Pokemon pok) {
        if (Math.random() < 0.3) {
            Effect.flinch(pok);
        }
    }

}

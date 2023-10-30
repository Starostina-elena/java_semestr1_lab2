package moves;

import ru.ifmo.se.pokemon.*;

public class Agility extends StatusMove {

    public Agility() {
        super(Type.PSYCHIC, 70, 90);
    }

    @Override
    protected String describe() {
        return "увеличивает свою скорость";
    }

    @Override
    public void applySelfEffects(Pokemon pok) {
        pok.setMod(Stat.SPEED, +2);
    }

}

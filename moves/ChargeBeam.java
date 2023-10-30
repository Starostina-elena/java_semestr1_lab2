package moves;

import ru.ifmo.se.pokemon.*;


public class ChargeBeam extends SpecialMove {

    public ChargeBeam() {
        super(Type.ELECTRIC, 50, 90);
    }

    @Override
    protected String describe() {
        return "запускает концентрированный пучок электричества";
    }

    @Override
    public void applySelfEffects(Pokemon pok) {
        if (Math.random() < 0.7) {
            pok.setMod(Stat.SPECIAL_ATTACK, +1);
        }
    }

}

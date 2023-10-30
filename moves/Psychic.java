package moves;

import ru.ifmo.se.pokemon.*;


public class Psychic extends SpecialMove{

    public Psychic() {
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    protected String describe() {
        return "использует телекинез";
    }

    @Override
    public void applyOppEffects(Pokemon pok) {
        if (Math.random() < 0.1) {
            pok.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

}

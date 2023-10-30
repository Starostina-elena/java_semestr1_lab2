package moves;

import ru.ifmo.se.pokemon.*;

public class FireFang extends PhysicalMove {

    public FireFang() {
        super(Type.FIRE, 65, 95);
    }

    @Override
    protected String describe() {
        return "кусает окутанными пламенем клыками";
    }

    @Override
    public void applyOppEffects(Pokemon pok) {
        if (Math.random() < 0.1) {
            Effect.flinch(pok);
        }
        if (Math.random() < 0.1) {
            Effect.burn(pok);
        }
    }

}

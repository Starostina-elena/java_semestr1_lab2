package moves;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {

    public ThunderWave() {
        super(Type.ELECTRIC, 70, 90);
    }

    @Override
    protected String describe() {
        return "парализует оппонента";
    }


}

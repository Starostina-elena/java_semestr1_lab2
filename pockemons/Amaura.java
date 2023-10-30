package pockemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Amaura extends Pokemon{

    public Amaura(String name, int level) {
        super(name, level);
        setType(Type.ROCK, Type.ICE);
        setStats(77, 59, 50, 67, 63, 46);
        setMove(new ThunderWave(), new RockSlide(), new PowderSnow());
    }

}

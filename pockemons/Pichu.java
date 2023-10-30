package pockemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Pichu extends Pokemon {

    public Pichu(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(20, 40, 15, 35, 35, 60);
        setMove(new Facade(), new ChargeBeam());
    }

}

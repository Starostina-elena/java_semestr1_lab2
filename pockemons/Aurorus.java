package pockemons;

import moves.*;
import ru.ifmo.se.pokemon.Type;

public class Aurorus extends Amaura {

    public Aurorus(String name, int level) {
        super(name, level);
        setStats(123, 77, 72, 99, 92, 58);
        addMove(new Psychic());
    }

}

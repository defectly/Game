package org.heroes;

import java.util.ArrayList;

public interface IHero {
    void step(Hero hero);
    void step(ArrayList<Hero> enemies);
}

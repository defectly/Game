package org.heroes;

import org.coordinates.Vector;

public class Bandit extends Melee {
    int Strength = 50;

    public Bandit(String name, Vector position) {
        super(name, "Bandit", 100, position);
        Initiative = 2;
    }
}

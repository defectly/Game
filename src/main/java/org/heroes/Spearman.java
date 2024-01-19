package org.heroes;

import org.coordinates.Vector;

public class Spearman extends Melee {

    int Range = 30;

    public Spearman(String name, Vector position) {
        super(name, "Spearman", 100, position);
        Initiative = 2;
    }
}

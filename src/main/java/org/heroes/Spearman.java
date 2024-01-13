package org.heroes;

import org.coordinates.Vector;

public class Spearman extends Hero {

    int Range = 30;

    public Spearman(String name, Vector position) {
        super(name, "Spearman", 100, position);
    }

    @Override
    public void damage(int damage) {
        Health -= damage;
    }
}

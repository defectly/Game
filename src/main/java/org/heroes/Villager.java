package org.heroes;

import org.coordinates.Vector;

public class Villager extends Hero {

    public Villager(String name, Vector position) {
        super(name, "Villager", 100, position);
    }

    @Override
    public void damage(int damage) {
        Health -= damage;
    }
}

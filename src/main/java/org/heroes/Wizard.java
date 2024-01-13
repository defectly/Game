package org.heroes;

import org.coordinates.Vector;

public class Wizard extends Hero {

    int Mane = 100;

    public Wizard(String name, Vector position) {
        super(name, "Wizard", 100, position);
    }

    @Override
    public void damage(int damage) {
        Health -= damage;
    }
}

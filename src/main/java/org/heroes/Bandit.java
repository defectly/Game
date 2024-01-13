package org.heroes;

import org.coordinates.Vector;

public class Bandit extends Hero {

    int Strength = 50;

    public Bandit(String name, Vector position) {
        super(name, "Bandit", 100, position);
    }

    @Override
    public void damage(int damage) {
        Health -= damage;
    }
}
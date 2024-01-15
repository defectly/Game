package org.heroes;

import org.coordinates.Vector;

public class Villager extends Hero {

    public Villager(String name, Vector position) {
        super(name, "Villager", 100, position);
        Initiative = 0;
    }

    public void reload(Archer archer) {
        archer.Arrows += 1;
    }
}

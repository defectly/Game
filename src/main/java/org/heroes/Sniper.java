package org.heroes;

import org.coordinates.Vector;

public class Sniper extends Archer {

    int Range = 60;

    public Sniper(String name, Vector position) {
        super(name, "Sniper", 100, position);
    }
}


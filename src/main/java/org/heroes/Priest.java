package org.heroes;

import org.coordinates.Vector;

import java.awt.*;

public class Priest extends Hero {

    int Mane = 100;

    public Priest(String name, Vector position) {
        super(name, "Priest", 100, position);
        Initiative = 1;
    }
}

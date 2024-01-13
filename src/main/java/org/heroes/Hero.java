package org.heroes;

import org.coordinates.Vector;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Hero {
    String Name;
    String Definition;
    int Health;
    Vector Position;

    protected Hero(String name, String definition, int health, Vector position)
    {
        Name = name;
        Definition = definition;
        Health = health;
        Position = position;
    }

    public abstract void damage(int damage);
    public Vector getPosition() {
        return Position;
    }

    public void printEnemyDistance(ArrayList<Hero> enemies) {
        enemies.forEach(e -> System.out.println(Position.enemyDistance(e.Position)));
    }

    public String getDefinition() {
        return Definition;
    }
    public String getName() {
        return Name;
    }

    @Override
    public String toString()
    {
        return Name + ", Definition: " + Definition;
    }
}

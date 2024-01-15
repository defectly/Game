package org.heroes;

import org.coordinates.Vector;

import java.util.ArrayList;

public abstract class Archer extends Hero {
    int Range = 45;
    int Arrows = 10;

    public Archer(String name, String definition, int health, Vector position) {
        super(name, definition, health, position);
        Initiative = 3;
    }

    @Override
    public void attack(Hero hero) {
        hero.damage(10);
    }

    @Override
    public void step(Hero hero) {
        if(Health <= 0)
            return;
        if(Arrows <= 0)
            return;

        attack(hero);
        System.out.println(hero);
    }
    @Override
    public void step(ArrayList<Hero> enemies) {
        if(Health <= 0)
            return;
        if(Arrows <= 0)
            return;

        var enemyDistance = getNearestEnemyDistance(enemies);

        if(enemyDistance > Range)
            return;

        var enemy = getNearestEnemy(enemies);

        attack(enemy);
        Arrows -= 1;
        System.out.println(enemy);
    }
}

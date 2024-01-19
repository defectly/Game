package org.heroes;

import org.coordinates.Vector;

import java.util.ArrayList;

public abstract class Hero implements IHero {
    String Name;
    String Definition;
    protected int Initiative;
    int Health;
    protected Vector Position;

    protected Hero(String name, String definition, int health, Vector position)
    {
        Name = name;
        Definition = definition;
        Health = health;
        Position = position;
    }

    public void damage(int damage) {
        if(damage > Health)
            Health = 0;
        else
            Health -= damage;
    }
    protected void attack(Hero hero) {
    }
    public Vector getPosition() {
        return Position;
    }

    protected void printEnemyDistance(ArrayList<Hero> enemies) {
        enemies.forEach(e -> System.out.println(Position.enemyDistance(e.Position)));
    }

    protected Float getNearestEnemyDistance(ArrayList<Hero> enemies) {
        Hero hero = null;
        float min = 900;

        for(var enemy : enemies) {
            var distance = Position.enemyDistance(enemy.Position);

            if(min > distance) {
                min = distance;
                hero = enemy;
            }
        }

        return min;
    }

    protected Hero getNearestEnemy(ArrayList<Hero> enemies) {
        Hero hero = null;
        float min = 900;

        for(var enemy : enemies) {
            var distance = Position.enemyDistance(enemy.Position);

            if(min > distance) {
                min = distance;
                hero = enemy;
            }
        }

        return hero;
    }

    public String getDefinition() {
        return Definition;
    }
    public String getName() {
        return Name;
    }

    public void step(Hero hero) {}
    public void step(ArrayList<Hero> enemies) {}

    public Integer getInitiative() {
        return Initiative;
    }


    @Override
    public String toString()
    {
        return Name + ", Definition: " + Definition + ", " + Health + ", " + Initiative;
    }
}

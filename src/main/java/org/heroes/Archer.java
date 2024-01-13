package org.heroes;

import org.coordinates.Vector;
import java.util.ArrayList;

public class Archer extends Hero {

    int Range = 45;
    int Arrows = 10;

    public Archer(String name, Vector position) {
        super(name, "Archer", 100, position);
    }

    @Override
    public void damage(int damage) {
        Health -= damage;
    }

    public Hero getNearestEnemy(ArrayList<Hero> enemies) {
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

    public Float getNearestEnemyDistance(ArrayList<Hero> enemies) {
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
}

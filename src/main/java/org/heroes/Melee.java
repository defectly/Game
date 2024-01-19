package org.heroes;

import org.coordinates.Vector;

import java.util.ArrayList;

public abstract class Melee extends Hero {
    protected Melee(String name, String definition, int health, Vector position) {
        super(name, definition, health, position);
    }

    @Override
    public void attack(Hero hero) {
        hero.damage(10);
    }

    public void step(ArrayList<Hero> enemies) {
        if(Health <= 0)
            return;

        var enemy = getNearestEnemy(enemies);

        if(getNearestEnemyDistance(enemies) > 1) {
            int dX = (getPosition().getX() - enemy.getPosition().getX());
            int dY = (getPosition().getY() - enemy.getPosition().getY());

            Vector changedPosition = Position;

            if(dX>dY) {
                if(dX < 0) {
                    changedPosition.ChangeX(changedPosition.getX() + 1);
                }
                else {
                    changedPosition.ChangeX(changedPosition.getX() - 1);
                }
            }
            else {
                if(dY < 0) {
                    changedPosition.ChangeY(changedPosition.getY() + 1);
                }
                else {
                    changedPosition.ChangeY(changedPosition.getY() - 1);
                }
            }

            Position = changedPosition;

            return;
        }


        if(enemy.Health <= 0)
            return;

        attack(getNearestEnemy(enemies));
    }

}

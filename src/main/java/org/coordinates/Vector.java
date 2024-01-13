package org.coordinates;

public class Vector {
    int X;
    int Y;

    public Vector(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }
    public int getY() {
        return Y;
    }

    public float enemyDistance(Vector enemyPosition) {
        return (float)Math.sqrt(Math.pow(enemyPosition.X - X, 2) + Math.pow(enemyPosition.Y - Y, 2));
    }
}

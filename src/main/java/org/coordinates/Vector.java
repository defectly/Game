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

    public void ChangeX(int x) {
        X = x;
    }

    public void ChangeY(int y) {
        Y = y;
    }

    public boolean equals(Vector position) {
        return X == position.getX() && Y == position.getY();
    }

    public float enemyDistance(Vector enemyPosition) {
        return (float)Math.sqrt(Math.pow(enemyPosition.X - X, 2) + Math.pow(enemyPosition.Y - Y, 2));
    }
}

package org.consoleClient;

import org.coordinates.Vector;
import org.heroes.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    static Random random = new Random();
    static Team light;
    static Team darkness;

    public static void main(String[] args) {
        light = generateTeam(TeamSide.Light);
        darkness = generateTeam(TeamSide.Darkness);

        light.Heroes.forEach(h -> h.step(darkness.HeroesByInitiative));
        System.out.println("*************************************");
        darkness.Heroes.forEach(h -> h.step(light.HeroesByInitiative));
        System.out.println("*************************************");

        light.HeroesByInitiative.forEach(System.out::println);
        System.out.println("*************************************");
        darkness.HeroesByInitiative.forEach(System.out::println);
    }


    static String positionToString(Vector position) {
        return "[x=" + position.getX() + ", " + "y=" + position.getY() + "]";
    }
    static Team generateTeam(TeamSide side) {
        var heroes = new ArrayList<Hero>();

        int position = side == TeamSide.Light ? 0 : 9;

        for(int i = 0; i <= 9; i++) {
            heroes.add(GetRandomHero(new Vector(i, position)));
        }

        return new Team(side, heroes);
    }
    static Hero GetRandomHero(Vector position) {
        return switch (random.nextInt(1,8)) {
            case 1 -> new Crossbower(getRandomName(), position);
            case 2 -> new Bandit(getRandomName(), position);
            case 3 -> new Priest(getRandomName(), position);
            case 4 -> new Sniper(getRandomName(), position);
            case 5 -> new Spearman(getRandomName(), position);
            case 6 -> new Villager(getRandomName(), position);
            case 7 -> new Wizard(getRandomName(), position);

            default -> throw new IllegalStateException("Unexpected value");
        };
    }
    static String getRandomName() {
        String[] names;

        try (var file = new FileInputStream("C:\\Users\\rikar\\Desktop\\names.txt")) {
            names = new String(file.readAllBytes()).split("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return names[random.nextInt(names.length - 1)];
    }
}


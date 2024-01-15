package org.consoleClient;

import org.heroes.Hero;

import java.util.ArrayList;
import java.util.Comparator;

public class Team {
    TeamSide Side;
    ArrayList<Hero> Heroes;
    ArrayList<Hero> HeroesByInitiative = new ArrayList<Hero>();


    public Team(TeamSide side, ArrayList<Hero> heroes) {
        Side = side;
        Heroes = heroes;
        HeroesByInitiative.addAll(Heroes.stream().sorted(Comparator.comparingInt(Hero::getInitiative)).toList().reversed());
    }
}


package org.consoleClient;

import org.heroes.Hero;

import java.util.ArrayList;

public class Team {
    TeamSide Side;
    ArrayList<Hero> Heroes;


    public Team(TeamSide side, ArrayList<Hero> heroes) {
        Side = side;
        Heroes = heroes;
    }
}


package com.mpedersen15;

public class Main {

    public static void main(String[] args) {

        HockeyPlayer superJoe = new HockeyPlayer("Joe Sakic");
        HockeyPlayer peterTheGreat = new HockeyPlayer("Peter Forsberg");

        Team<HockeyPlayer> coloradoAvalanche = new Team<>("Colorado Avalanch");
        coloradoAvalanche.addPlayer(superJoe);
        coloradoAvalanche.addPlayer(peterTheGreat);

        coloradoAvalanche.printRoster();

        HockeyPlayer fedorov = new HockeyPlayer("Sergei Fedorov");
        HockeyPlayer yzerman = new HockeyPlayer("Steve Yzerman");

        Team<HockeyPlayer> detroitRedWings = new Team<>("Detroid Red Wings");
        detroitRedWings.addPlayer(fedorov);
        detroitRedWings.addPlayer(yzerman);

        detroitRedWings.printRoster();

        League<HockeyPlayer> nhl = new League<>("National Hockey League");
        nhl.addTeam(coloradoAvalanche);
        nhl.addTeam(detroitRedWings);

        coloradoAvalanche.addMatchResult(detroitRedWings, 3,2);

        nhl.printStandings();

        FootballPlayer vonMiller = new FootballPlayer("Von Miller");

        Team<FootballPlayer> denverBroncos = new Team<>("Denver Broncos");

        nhl.addTeam(denverBroncos);



    }
}

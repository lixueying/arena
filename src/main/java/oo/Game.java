package oo;

import static java.lang.String.format;

public class Game {
    public void fight(Player firstPlayer, Player secondPlayer) {
        Player attacker = firstPlayer;
        Player victim = secondPlayer;
        Player loser = attacker;

        while (attacker.isAlive()) {
            attacker.attack(victim);
            loser = victim;
            victim = attacker;
            attacker = loser;
        }

        System.out.print(format("%s被打败了", loser.getName()));
    }
}

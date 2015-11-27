package oo;

import static java.lang.String.format;

public class Game {
    private ConsolePrinter consolePrinter;

    public Game(ConsolePrinter consolePrinter) {
        this.consolePrinter = consolePrinter;
    }

    public void fight(Player firstPlayer, Player secondPlayer) {
        Player attacker = firstPlayer;
        Player victim = secondPlayer;
        Player loser = attacker;

        while (attacker.isAlive()) {
            consolePrinter.print(format("%s\n", attacker.attack(victim)));
            loser = victim;
            victim = attacker;
            attacker = loser;
        }

        consolePrinter.print(format("%s被打败了", loser.getName()));
    }
}

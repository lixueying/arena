package oo;

import static java.lang.String.format;

public class Game {
    private ConsolePrinter consolePrinter;

    public Game(ConsolePrinter consolePrinter) {
        this.consolePrinter = consolePrinter;
    }

    public void fight(Person firstPerson, Person secondPerson) {
        Person attacker = firstPerson;
        Person victim = secondPerson;
        Person loser = attacker;

        while (attacker.isAlive()) {
            consolePrinter.print(format("%s\n", attacker.attack(victim)));
            loser = victim;
            victim = attacker;
            attacker = loser;
        }

        consolePrinter.print(format("%s被打败了", loser.getName()));
    }
}

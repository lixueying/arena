package oo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {
    private Game game;
    @Mock
    private ConsolePrinter consolePrinter;

    @Before
    public void setUp() {
        game = new Game(consolePrinter);
    }

    @Test
    public void shouldSecondPlayerLoseWhenFirstPlayerIsPowerful() {
        Player firstPlayer = new Player("张三", 100, 10);
        Player secondPlayer = new Player("李四", 100, 9);

        game.fight(firstPlayer, secondPlayer);

        verify(consolePrinter).print(String.format("%s被打败了", secondPlayer.getName()));
    }

    @Test
    public void shouldFirstPlayerLoseWhenSecondPlayerIsPowerful() {
        Player firstPlayer = new Player("张三", 100, 9);
        Player secondPlayer = new Player("李四", 100, 10);

        game.fight(firstPlayer, secondPlayer);

        verify(consolePrinter).print(String.format("%s被打败了", firstPlayer.getName()));
    }
}
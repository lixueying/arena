package oo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.inOrder;
import static org.mockito.internal.verification.VerificationModeFactory.times;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {
    private Game game;
    @Mock
    private ConsolePrinter consolePrinter;
    InOrder inOrder;

    @Before
    public void setUp() {
        inOrder = inOrder(consolePrinter);
        game = new Game(consolePrinter);
    }

    @Test
    public void should_SecondPlayer_Lose_When_FirstPlayer_Is_Powerful() {
        Person firstPerson = new Person("张三", 10, 10);
        Person secondPerson = new Person("李四", 9, 10);

        game.fight(firstPerson, secondPerson);

        inOrder.verify(consolePrinter, times(1)).print("普通人张三攻击了普通人李四，李四受到了10点伤害，李四剩余生命：-1\n");
        inOrder.verify(consolePrinter, times(1)).print("李四被打败了");
    }

    @Test
    public void should_FirstPlayer_Lose_When_SecondPlayer_Is_Powerful() {
        Person firstPerson = new Person("张三", 10, 8);
        Person secondPerson = new Person("李四", 20, 9);

        game.fight(firstPerson, secondPerson);

        inOrder.verify(consolePrinter, times(1)).print("普通人张三攻击了普通人李四，李四受到了8点伤害，李四剩余生命：12\n");
        inOrder.verify(consolePrinter, times(1)).print("普通人李四攻击了普通人张三，张三受到了9点伤害，张三剩余生命：1\n");
        inOrder.verify(consolePrinter, times(1)).print("普通人张三攻击了普通人李四，李四受到了8点伤害，李四剩余生命：4\n");
        inOrder.verify(consolePrinter, times(1)).print("普通人李四攻击了普通人张三，张三受到了9点伤害，张三剩余生命：-8\n");
        inOrder.verify(consolePrinter, times(1)).print("张三被打败了");
    }
}
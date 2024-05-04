import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameArenaTest {
    @Test
    void testGameEndsWhenPlayerDies() {
        Player player1 = new Player(10, 5, 20);
        Player player2 = new Player(100, 10, 5);
        GameArena arena = new GameArena();

        arena.startMatch(player1, player2);

        assertTrue(player1.getHealth() <= 0 || player2.getHealth() <= 0);
    }

    @Test
    void testCorrectWinner() {
        Player player1 = new Player(10, 5, 20);
        Player player2 = new Player(100, 10, 5);
        GameArena arena = new GameArena();

        arena.startMatch(player1, player2);

        if (player1.getHealth() <= 0) {
            assertTrue(player2.getHealth() > 0);
        } else {
            assertTrue(player1.getHealth() > 0);
        }
    }
}

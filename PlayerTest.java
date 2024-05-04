import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void testHealthReduction() {
        Player player1 = new Player(50, 5, 10);
        Player player2 = new Player(100, 10, 5);
        player1.attack(player2);
        assertTrue(player2.getHealth() < 100);
    }

    @Test
    void testPlayerDies() {
        Player player1 = new Player(10, 5, 10);
        Player player2 = new Player(100, 10, 20);
        for (int i = 0; i < 10; i++) { // Simulate multiple attacks until player1 likely dies
            player2.attack(player1);
            if (player1.getHealth() <= 0) break;
        }
        assertTrue(player1.getHealth() <= 0);
    }

    @Test
    void testDefenseMechanism() {
        Player player1 = new Player(50, 5, 10);
        int initialHealth = player1.getHealth();
        player1.defend(0); // No attack should not change health
        assertEquals(initialHealth, player1.getHealth());
        player1.defend(20); // Defend against 20 points of attack
        assertTrue(player1.getHealth() <= initialHealth);
    }
}

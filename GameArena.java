public class GameArena {
    public void startMatch(Player player1, Player player2) {
        Player attacker = player1.getHealth() <= player2.getHealth() ? player1 : player2;
        Player defender = attacker == player1 ? player2 : player1;

        while (player1.getHealth() > 0 && player2.getHealth() > 0) {
            attacker.attack(defender);
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        if (player1.getHealth() <= 0) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Player 1 wins!");
        }
    }
}

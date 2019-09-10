class pair {
    Player player1;
    Player player2;
    int result;

    pair(Player p1, Player p2, int r) {
        player1 = p1;
        player2 = p2;
        result = r;
    }

    void endGame(int res) {
        player1.opponents.add(player2);
        player2.opponents.add(player1);
        if (res == 1) {
            player1.points++;
        } else if (res == 0) {
            player2.points++;
        } else if (res == 3) {
            player1.points += 0.5;
            player2.points += 0.5;
        }
    }
}
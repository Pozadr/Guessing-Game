public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.displayIntro();

        User user1 = new User();
        user1.getNickFromUser();
        user1.displayNick();

        game.runGame();
    }
}
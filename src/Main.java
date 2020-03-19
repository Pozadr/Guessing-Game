public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Guessing game! ----------");

        User user1 = new User();
        user1.getNickFromUser();
        System.out.println("Your user name is: " + user1.getNick());

        Game game = new Game();
        game.runGame();
    }
}
import java.util.Scanner;

public class User {
    private String nick;
    private int score = 0;

    // Constructor
    public User(){
        this.nick = getNickFromUser();
    }

    // Getters
    public String getNick(){
        return this.nick;
    }

    public int getScore() {
        return this.score;
    }

    // Setters
    public void setNick(String nick){
        if(nick.length() > 1){
            this.nick = nick;
        }
        else{
            System.out.println("Nick name is too short.");
        }
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Methods
    public String getNickFromUser(){
        String nick;
        Scanner keyboard = new Scanner(System.in);

        while(true){
            System.out.print("Type your nick: ");
            nick = keyboard.next();
            if(nick.length() > 1){
                return nick;
            }
            else{
                System.out.println("Nick name is too short. Try again");
            }
        }
    }

    public void displayNick(){
        System.out.println("Your user name is: " + this.nick);
    }

}

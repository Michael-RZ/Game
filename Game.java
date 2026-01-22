import java.util.Scanner;

public class Game {

    private boolean running = true;
    private Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println("");
        System.out.println("Welcome to Michael's Turned Based Java Game!");
        System.out.println("");
        System.out.println("Please select an option with based off the number provided.");
        System.out.println("");
        System.out.println("");

    while (running) {
        System.out.println("(1) Start Game");
        System.out.println("(2) Exit Game");
        int play = scanner.nextInt();


    if (play == 1) {
        Character.playableCharacters();
        int choice = scanner.nextInt();

    }


    else if (play == 2 ) {
        endGame();
    }


    }





    }
  private void endGame(){
        System.out.println("Game closed.");
        running = false;
    } }



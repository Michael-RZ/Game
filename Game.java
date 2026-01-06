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
        int choice = scanner.nextInt();


    if (choice == 1) {
        System.out.println("Please select the game mode based off the number provided."); //Maybe turn these statements into a method in another class???
        System.out.println("");
        System.out.println("(1) 1v1");
        System.out.println("(2) 2v2");
        System.out.println("(3) 3v3");

        int gameModeChoice = scanner.nextInt();
        System.out.println("Choose " + gameModeChoice +  " characters"); //FIXME:

        Characters.characterOptions();

        int characterChoice = scanner.nextInt();

        Characters.characterDescription(characterChoice);
        break;
    }
    else if (choice == 2 ) {
        endGame();
    }


    }





    }
  private void endGame(){
        System.out.println("Game closed.");
        running = false;
    } }



import java.util.Scanner;

public class Game {


    private Scanner scanner = new Scanner(System.in);
    Gamemenu menu = new Gamemenu();


    public void start(){
    menu.selectGameMode();
    int partySize = scanner.nextInt();
        System.out.println("Party size of " + partySize + " has been selected.");
        System.out.println();

        System.out.println("(1) Start Game");
        System.out.println("(2) Exit Game");
        int play = scanner.nextInt();


    if (play == 1) {
        menu.playableCharacters();
        int characterChoice = scanner.nextInt();
        Character Player = Characterfactory.creatCharacter(characterChoice);
        Player.characterInfo();

    }


    else if (play == 2 ) {
        endGame();
    }








    }
  private void endGame(){
        System.out.println("Game closed.");

    } }



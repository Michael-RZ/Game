import java.util.Scanner;

public class Game {


    private Scanner scanner = new Scanner(System.in);
    Gamemenu menu = new Gamemenu();
    Party party = new Party();


    public void start(){
    System.out.println("(1) Start Game");
    System.out.println("(2) Exit Game");
    int play = scanner.nextInt();
    scanner.nextLine();



    menu.selectGameMode();
    int partySize = scanner.nextInt();
        System.out.println("Party size of " + partySize + " has been selected.");
        System.out.println();

        scanner.nextLine();


    if (play == 1) {
        for (int i = 0; i < partySize; i++ ) {
        menu.playableCharacters();
        int characterChoice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("");
        System.out.println("Please name your Character");
        String alias = scanner.nextLine();
        Character Player = Characterfactory.creatCharacter(characterChoice);
        party.addPartyMember(Player);
        Player.setAlias(alias);


        if (i == partySize - 1) {
        System.out.printf("%n%n%nYour Party consists of: ");
        System.out.println("Your Party consists of: ");
        System.out.println("");
        party.showPartyMember();
        }

    }}


    else if (play == 2 ) {
        endGame();
    }








    }
  private void endGame(){
        System.out.println("Game closed.");

    } }



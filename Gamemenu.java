import java.util.Scanner;
public class Gamemenu {
Scanner scnr = new Scanner(System.in);


public int selectGameMode(){

        System.out.println("");
        System.out.println("Welcome to Michael's Turned Based Java Game!");
        System.out.println("");
        System.out.println("Please select an option with based off the number provided.");
        System.out.println("");
        System.out.println("");
        int gameModeChoice = scnr.nextInt();
        return gameModeChoice;

}

};
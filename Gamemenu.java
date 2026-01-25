import java.util.Scanner;
public class Gamemenu {
Scanner scnr = new Scanner(System.in);


public void selectGameMode(){

        System.out.println("");
        System.out.println("Welcome to Michael's Turned Based Java Game!");
        System.out.println("");
        System.out.println("Please select a team size based off the number provided.");
        System.out.println("");
        System.out.println("(1) 1 Member");
        System.out.println("(2) 2 Members");
        System.out.println("(3) 3 Members");


}
public static void playableCharacters(){
        System.out.printf("Please select one playable character from the options below %n %n");
        System.out.println("(1) Knight - Attack: 100, Health : 200);");
        System.out.println("(2) Mage -  Attack: 200, Health : 100 ");
        System.out.println("(3) Archer -  Attack: 150, Health : 150");
    }
};
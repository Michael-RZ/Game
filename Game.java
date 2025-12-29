import java.util.Scanner;

public class Game {

    private boolean running = true;
    private Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.println("Welcome to the Michael RZ Game");
    
    while (running) { 
        System.out.println("Start Game(1)");
        System.out.println("Exit Game(2)");
        int choice = scanner.nextInt();

    if (choice == 1) {
    System.out.println("Start Game(1)");
    }
    else if (choice == 2 ) {
        running = false;
    }
    }}
    }
    



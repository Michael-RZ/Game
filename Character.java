import java.util.Random;



public class Character {
    Random randomGenerator = new Random();
    private String name;
    private int attack;
    private int health;



    public Character(String name , int attack, int health) {

        this.attack = attack;
        this.health = health;
        this.name = name;

    }

    public static void playableCharacters(){
        System.out.printf("Please select one playable character from the options below %n %n");
        System.out.println("(1) Knight");
        System.out.println("(2) Mage");
        System.out.println("(3) Archer");
    }

    public int playerHealth(){
        return health;
    }

    public void attackEnemy(Character enemy){


    }

    public void takeDamage(){



 }


    public boolean  isAlive() {

            return health > 0;


        }

    public int healPlayer(){
        int healthPotion =  randomGenerator.nextInt(101);
        health = health + healthPotion;
        return healthPotion;
    }

    }



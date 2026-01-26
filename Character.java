import java.util.Random;



public class Character {
    Random randomGenerator = new Random();
    private String name;
    private String alias;
    private int attack;
    private int health;



    public Character(String name , int attack, int health, String alias) {

        this.attack = attack;
        this.health = health;
        this.name = name;
        this.alias = alias;

    }

//test
    public int playerHealth(){
        return health;
    }

    public void attackEnemy(Character enemy){


    }

    public void takeDamage(int attack){

        health -= attack;

 }


    public boolean  isAlive() {

            return health > 0;


        }

    public int healPlayer(){
        int healthPotion =  randomGenerator.nextInt(101);
        health = health + healthPotion;
        return healthPotion;
    }

    public void characterInfo(){
        System.err.println("Character Name: " + alias);
        System.err.println("Character Type: " + name);
        System.err.println("Character Default Attack Damage : " + attack);
        System.err.println("Character Health: " + health);
        System.err.println("");
        System.err.println("");


    }

    public void setAlias(String Alias) {

    this.alias = Alias;
    }
    public String getAlias(){

        return alias;
    }

    }



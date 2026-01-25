
public class Characterfactory {

public static Character creatCharacter(int choice){

        switch (choice) {

            case 1: return new Character("Knight", 100, 200,"Unknown");

            case 2: return new Character("Mage", 200, 100,"Unknown");

            case 3: return new Character("Archer", 150, 150,"Unknown");

            default: return null;
        }
}
    }





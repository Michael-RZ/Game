
public class Characterfactory {

public static Character creatCharacter(int choice){

        switch (choice) {
            
            case 1: return new Character("Knight", 100, 200);

            case 2: return new Character("Mage", 200, 100);

            case 3: return new Character("Archer", 150, 150);

            default: return null;
        }
}
    }





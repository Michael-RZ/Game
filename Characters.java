public class Characters {

    public static void characterOptions() {
        String[] characters = {"(1) Knight","(2) Mage","(3) Rogue"};





        for (String c : characters){
            System.out.println(c);
        }
    }


  public static void characterDescription(int userChoice) {
        String knightDescription = "A Knight comes with a sword and shield";
        String mageDescription = "A Mage comes with a Wand and Magic Book";
        String rogueDescription = "A Rogue comes with a Dagger and cloak";
        switch (userChoice) {
            case 1:
                System.out.println(knightDescription);
                break;
            case 2:
                System.out.println(mageDescription);
                break;
            case 3:
                System.out.println(rogueDescription);
                break;
            default:
                System.out.println ("Please pick one of the options!");


        }

    }



}


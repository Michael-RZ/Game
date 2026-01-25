
import java.util.ArrayList;

public class Party {
    public String teamName;
    ArrayList<Character> partyList = new ArrayList<>();

    public void addPartyMember(Character partyMember){

        partyList.add(partyMember);
    }

    public void showPartyMember(){
        for (Character member : partyList){
            System.out.println(member.getAlias());
        }
    }
    public void setPartyName(String partyName) {

        teamName = partyName;
    }


}
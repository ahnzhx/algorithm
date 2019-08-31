package leetCode;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator {
    public static void main(String[] args) {
        ArrayList<SoccerPlayer> playerList = new ArrayList<>();
        SoccerPlayer player1 = new SoccerPlayer("메시", "공격수",23);
        SoccerPlayer player2 = new SoccerPlayer("호날두", "공격수",25);
        SoccerPlayer player3 = new SoccerPlayer("즐라탄", "공격수",26);
        SoccerPlayer player4 = new SoccerPlayer("박지성", "미드필더",30);
        SoccerPlayer player5 = new SoccerPlayer("오스카", "미드필더",21);
        SoccerPlayer player6 = new SoccerPlayer("기안", "공격수",33);

        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
        playerList.add(player4);
        playerList.add(player5);
        playerList.add(player6);

        Collections.sort(playerList, (o1, o2)-> {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else if (o1.getAge() < o2.getAge()) {
                return -1;
            } else
                return 0;
        });

        for(int i =0; i<playerList.size(); i++){
            System.out.println(playerList.get(i).getName()+" "+playerList.get(i).getAge());
        }
    }
}

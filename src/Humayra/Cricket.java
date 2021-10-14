package Humayra;

public class Cricket {
      /*
    Name: Humayra Kabir Nisa
    ID: 2012020298
    Section: F
    Email: cse_2012020298@lus.ac.bd
    Date: 10 september,2021
     */
    String matchType;
    int matchOver;
    Player player;

    Cricket(String matchType,int matchOver,Player player){
        this.matchType = matchType;
        this.matchOver = matchOver;
        this.player = player;
    }
    void display(){
        System.out.println("Match Type:"+matchType);
        System.out.println("Match Over:"+matchOver);
        System.out.println("Player Name:"+player.playerName);
        System.out.println("Jersey Number:"+player.jerseyNumber);
    }
}

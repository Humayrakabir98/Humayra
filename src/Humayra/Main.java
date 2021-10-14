package Humayra;

public class Main {

    public static void main(String[] args) {
          /*
    Name: Humayra Kabir Nisa
    ID: 2012020298
    Section: F
    Email: cse_2012020298@lus.ac.bd
    Date: 10 september,2021
     */
      Player player = new Player("Shakib",75);
      Cricket cricket = new Cricket("International match",20,player);
      cricket.display();
      Football football = new Football();
    }
}

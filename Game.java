import java.util.Random;
import java.util.Scanner;


public class Game {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Player: choose 0(scissor) , choose 1(paper) or choose 2(rock)");
            int userinput = sc.nextInt();
            Random random = new Random();
            int computerinput = random.nextInt(3);
            int scissor = 0;
            int paper = 1;
            int rock = 2;
      if (userinput == computerinput){
                System.out.println("it is a draw");
            } else if 
                (userinput == 0 && computerinput == 1 || userinput == 1 && computerinput == 2 || userinput == 2 && computerinput == 1 || userinput == 2 && computerinput == 0 ){
                    System.out.println("the user wins");
                }else{
                    System.out.println("the computer wins");
                }
            //System.out.println("computer input is " + computerinput);
            if (computerinput == 0){
                System.out.println("SCISSOR");
            }
            else if (computerinput == 1 ){
                System.out.println("PAPER");
            }
            else if (computerinput == 2){
                System.out.println("ROCK");
            }
      
            System.out.println("computer uses" + computerinput);
        }
        }

    }

   
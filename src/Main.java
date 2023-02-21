import java.sql.SQLOutput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //take input form user(scissor-paper-rock)
        Scanner userChoice = new Scanner(System.in);
        System.out.println("please enter S,P or R");
        char userMove = userChoice.next().charAt(0);
        System.out.println("You have choose "+userMove);
        //make computer to make there move
        char[] computer = {'S', 'P', 'R'};
        double doubleRandomNumber = Math.random() * 3;
        int randomNumber = (int)doubleRandomNumber;
        //or
        //Random random = new Random();
        //int randomNumber =  random.nextInt(bound:3);

//        System.out.println("randomNumber = " + randomNumber);
        System.out.println("compter have choose:- "+computer[randomNumber]);
        switch (userMove)
        {
            case 'S':
                if(randomNumber == 0)
                {
                    System.out.println("Its draw");
                }
                else if(randomNumber == 1)
                {
                    System.out.println("You won");
                }
                else {
                    System.out.println("You lost");
                }
                break;
            case 'P':
                if(randomNumber == 0)
                {
                    System.out.println("You lost");
                }
                else if(randomNumber == 1)
                {
                    System.out.println("Its draw");
                }
                else {
                    System.out.println("You won");
                }
                break;
            case 'R':
                if(randomNumber == 0)
                {
                    System.out.println("You won");
                }
                else if(randomNumber == 1)
                {
                    System.out.println("You lost");
                }
                else {
                    System.out.println("Its draw");
                }
                break;
            default:
                System.out.println("Error!!choose only S,P or R OR make your input capital");
        }

    }
}
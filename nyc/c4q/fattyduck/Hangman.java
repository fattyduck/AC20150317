package nyc.c4q.fattyduck;

/**
 * Created by fattyduck on 3/17/15.
 */
import java.util.Scanner;
public class Hangman {
    public static void main(String[] args){
        Drawing drawing= new Drawing();
        SecretWord sw = new SecretWord();
        Scanner input = new Scanner(System.in);
        int guess=0;
        System.out.println("Welcome to getting hanged\n");
        //System.out.println(sw.reveal());
        String in;



        while(sw.isGuessed()==false){



            System.out.println(drawing.get(guess));
            System.out.println("Misses: "+guess);
            System.out.println("Word: " + sw.toString());
            in=input.nextLine();
            sw.set(in.charAt(0));
            if(sw.isLetter(in.charAt(0))){
                guess-=1;
            }

            guess+=1;



            if(sw.isLowerCase(in.charAt(0))){
                System.out.println("Uppercase only, silly. BTW extra penalty for being silly!");
                guess+=1;
            }

            if (in.length() > 1) {
                System.out.println("One guess at a time, silly. BTW extra penalty for being silly!");
                guess+=1;
            }

            if(guess>8){
                System.out.println("Congratz you have been hanged!");
                break;
            }
            if(sw.isGuessed()==true){
                System.out.println("Yes... the word is "+ sw.reveal());
                System.out.println("You have unfortunately been saved, such a pity!");


            }
        }
    }
}

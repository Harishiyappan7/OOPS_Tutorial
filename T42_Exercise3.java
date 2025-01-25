import java.util.Random;
import java.util.Scanner;


class Game{
    public int number;
    public int inputNumber;
    public int noOfguesses=0;
    Game(){
        Random rand = new Random();
        number = rand.nextInt(100);
    }
    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfguesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfguesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }
    public int getGuesses(){
        return noOfguesses;
    }
    public void setGuesses(int noOfguesses){
        this.noOfguesses = noOfguesses;
    }
}
public class T42_Exercise3 {
    public static void main(String[] args) {
        Game g =new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}

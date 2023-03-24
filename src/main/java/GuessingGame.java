import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
//        need a secret number
//        user needs to guess it - take input?
//        if too high or low, let them know
//        if guessed correctly, let them know
        Integer secretNumber = 9;
        System.out.println("Guess my favourite number!");
        Scanner scanner = new Scanner(System.in);

        String guess = scanner.nextLine();
        System.out.println("Your guess was:" + guess);

        if(guess.equals(String.valueOf(secretNumber))){
            System.out.println("Nice, that is my favourite!");
        } else if(secretNumber < Integer.valueOf(guess)){
            System.out.println("Too high, guess again!");
        } else if(secretNumber > Integer.valueOf(guess)){
            System.out.println("Too low, guess again!");
        }
    }
}

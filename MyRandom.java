package sk.kosickaakademia.stanovska.projectarray;

import java.util.Scanner;

public class MyRandom {
    public static void main(String[] args) {
        MyRandom myRandom= new MyRandom();
        myRandom.guessNumber(320);
        MyRandom mojanasobilka= new MyRandom();
        mojanasobilka.malaNasobilka(10);
    }

    public void guessNumber(int max){
        System.out.println("Guess number between 1 and "+max);
        int randomNumber=(int)(Math.random()*max+1);
        Scanner sc= new Scanner(System.in);
        int guess;
        int count=0;
        System.out.println("Take a guess: ");
            do {
                guess = sc.nextInt();
                if (guess == randomNumber)
                    System.out.println("You won");
                else if (guess < randomNumber) {
                    System.out.println("Try a higher number: ");
                } else
                    System.out.println("Try a lower number: ");
                count++;
                if (count>7) {
                    System.out.println("You can take a guess just 7 times.");
                    break;
                }

            }
            while (guess != randomNumber);


    }
    public void malaNasobilka (int max){
        Scanner sc= new Scanner(System.in);
        int i=0;
        int count=0;
        do {
            int randomA=(int)(Math.random()*max+1);
            int randomB= (int)(Math.random()*max+1);
            System.out.println(randomA+"*"+randomB);
            System.out.println("Your resault: ");
            int resault= sc.nextInt();
            int systemresault= randomA*randomB;
            if (resault==systemresault)
                count++;
            i++;
        }while (i<=10);
        int correct= (count*100)/10;
        System.out.println(count+"/10 correct. "+correct+"%");

    }
}

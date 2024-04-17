package fr.amu.iut.exercice5;

public class Count15Seconds {
    public static void main(String[] args) {
        try {
            int seconds = 0;
            while (seconds < 15) {
                System.out.println("Second " + (seconds + 1));
                Thread.sleep(1000); // pause for 1 second
                seconds++;
            }
            System.out.println("15 seconds have passed, program stops.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
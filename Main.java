import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScoreSoure source = new ScoreSoure();

        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();

        source.register(sub1);
        source.register(sub2);

        Scanner sc = new Scanner(System.in);
        String scoreInput = "empty";
        while (!scoreInput.equals("")) {
            System.out.print("Enter Score: ");
            scoreInput = sc.nextLine();
            if (scoreInput.isEmpty()) {
                break;
            }
            source.setScoreLine(scoreInput);
        }
        System.out.println("Thanks for using.");
        sc.close();
    }
}

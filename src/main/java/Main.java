import static utils.Randomiser.getRandomSystem;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.print(getRandomSystem());
        }

    }
}

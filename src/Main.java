import java.util.Random;

public class Main {
    public static void main(String[] args) {
            //N(0.2, 3)
            double media = 0.2;
            double dispersia = 3;

            Random random = new Random();

            double X = random.nextGaussian();

            double Y = media + dispersia * X;

            System.out.println(Y);
        }
    }
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareBufferReader {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number");
            double n = Double.parseDouble(br.readLine());
            System.out.println("Square of number is " + Math.pow(n, 2));
        }
        catch (IOException e) {
            System.out.println("error in input");
        }
    }
}

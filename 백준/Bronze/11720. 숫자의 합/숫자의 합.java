import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        int size = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for (byte by : br.readLine().getBytes()) {
            sum += by - '0';    
        }

        System.out.println(sum);
    }
}
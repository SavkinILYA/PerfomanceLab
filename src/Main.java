import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>(10);

        for(int i = 0; i < 10; ++i) {
            int n = Integer.parseInt(reader.readLine());
            list.add(n);
        }

        Collections.sort(list);


        for (Integer x: list) {


            System.out.print(x + " ");
        }
    }
}

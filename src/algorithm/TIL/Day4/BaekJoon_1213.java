package algorithm.TIL.Day4;

import java.io.*;
import java.util.*;

public class BaekJoon_1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        ArrayList<Object> arr = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            arr.set(i, c);
        }



    }
}

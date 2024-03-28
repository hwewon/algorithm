package algorithm.TIL.Day2;

import java.io.*;
import java.util.*;

public class BaekJoon_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringTokenizer st;

        HashMap<String, String> arr = new HashMap<>();

        for(int i=0; i<a; i++){
            st = new StringTokenizer(br.readLine()," ");

            String name = st.nextToken();
            String condition = st.nextToken();

            if(condition.equals("enter")){
                arr.put(name, condition);
            }else if(condition.equals("leave")) {
                arr.remove(name);
            }
        }

        ArrayList<String> arr2 = new ArrayList<>(arr.keySet());

        Collections.sort(arr2, Collections.reverseOrder());

        for(String name : arr2){
            System.out.println(name);
        }

    }
}

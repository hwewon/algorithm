package algorithm.TIL;

import java.io.*;

public class BaekJoon_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

//        Scanner sc = new Scanner(System.in);
//
//        int M = sc.nextInt();
//
//        for(int i=1; i<=M; i++){
//            for(int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
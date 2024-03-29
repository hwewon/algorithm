package algorithm.TIL.Day3;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        int n = 7;

        int b = 0;

        for(int i=1; i<=n-4; i++){
            for(int j=i+1; j<=n-3; j++){
                for(int k=j+1; k<=n-2; k++){
                    for(int l=k+1; l<=n-1; l++){
                        for(int m=l+1; m<=n; m++){
                            b++;
                        }
                    }
                }
            }
        }
        System.out.println(b);

    }
}

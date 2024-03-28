package algorithm.TIL.Day2;

import java.io.*;
import java.util.*;

public class BaekJoon_27160 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringTokenizer st;

        HashMap<String, Integer> map = new HashMap<>();     // map 생성 (key값 중복 x)

        for(int i=0; i<a; i++){
            st = new StringTokenizer(br.readLine(), " ");
            String fruit = st.nextToken();
            int cnt = Integer.parseInt(st.nextToken());

            if(map.containsKey(fruit)){         // key값이 같은 과일일 경우
                int prevCnt = map.get(fruit);   // 해당 과일의 기존 value값을 임시로 저장
                map.put(fruit, prevCnt + cnt);  // 해당 과일의 value값을 기존 value값과 합하여 재할당
            }else{
                map.put(fruit, cnt);
            }
        }

        if(map.containsValue(5)){               // value값에 5가 있는 경우
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}

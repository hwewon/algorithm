package algorithm.TIL.Day2;

import java.io.*;
import java.util.*;

public class BaekJoon_20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        HashMap<String, Integer> resultArr = new HashMap<>();

        StringTokenizer st;
        // "."로 구분을 줘서 읽어 드린 후 앞에 있는 파일명은 필요없으므로 임시 공간에다가 넣고
        // 확장자 명을 키값으로 HashMap에 넣기
        for(int i=0; i<a; i++){
            st = new StringTokenizer(br.readLine(),".");
            String trash = st.nextToken();      // 파일명은 필요없으므로 쓰레기통으로

            String file = st.nextToken();

            resultArr.put(file, resultArr.getOrDefault(file, 0) + 1);
        }

        // HashMap의 키값으로 ArrayList 생성
        ArrayList<String> arr = new ArrayList<>(resultArr.keySet());

        // 알파벳 순으로 정렬
        Collections.sort(arr);

        // 정렬한 ArrayList로 키값과 밸류값 출력
        for(int i=0; i<arr.size(); i++){
            String result = arr.get(i);
            System.out.println(result + " " + resultArr.get(result));
        }
    }
}

//        for(String result : arr){
//            System.out.println(result + " " + resultArr.get(result));
//        }
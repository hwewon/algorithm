package algorithm.TIL.Day4;

import java.io.*;
import java.util.*;

public class BaekJoon_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 단어 정렬을 위한 TreeSet 생성
        TreeSet<String> set1 = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>();
        TreeSet<String> result = new TreeSet<>();

        for(int i=0; i<n; i++){
            String hear = br.readLine();
            set1.add(hear);
        }
        for(int i=0; i<m; i++){
            String see = br.readLine();
            set2.add(see);
        }

        // 듣도 못한 사람의 이름을 name에 넣고
        // 보도 못한 사람의 set에 중복되는 이름이 있을 경우 result에 담기
        for(String name : set1){
            if(set2.contains(name)){
                result.add(name);
            }
        }

        // 듣도 보도 못한 사람의 수
        System.out.println(result.size());

        // result에 있는 값을 name에 담아서 출력
        for(String name : result){
            System.out.println(name);
        }
    }
}
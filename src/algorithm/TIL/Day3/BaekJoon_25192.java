package algorithm.TIL.Day3;

import java.io.*;
import java.util.*;

public class BaekJoon_25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        HashMap<String, Object> map = new HashMap<>();

        int tmp = 0;    // map을 초기화하기전에 map의 size를 저장할 임시 변수

        for(int i=0; i<a; i++){
            String name = br.readLine();

            // ENTER가 입력될 경우 그 전의 채팅들이 쓸모가 없어지므로 map의 size를 저장한 뒤 map을 초기화
            if(name.equals("ENTER")){
                tmp += map.size();
                map.clear();
            }else{
                map.put(name, " ");     // 중복 키를 갖지 않으므로 서로 다른 이름의 키 값을 저장
            }
        }
        System.out.println(map.size() + tmp);
    }
}

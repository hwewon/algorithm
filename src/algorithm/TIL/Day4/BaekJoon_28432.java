package algorithm.TIL.Day4;

import java.io.*;
import java.util.*;

public class BaekJoon_28432 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        ArrayList<String> arr1 = new ArrayList<>();

        int tmp = 0;    // 임시로 저장할 인덱스 값

        // arr1에 입력받은 문자열 넣고 ?가 입력되었을 시 해당 인덱스의 값을 tmp에 저장
        for(int i=0; i<a; i++){
            String str1 = br.readLine();
            arr1.add(str1);
            if(str1.equals("?")){
                tmp = i;
            }
        }

        int b = Integer.parseInt(br.readLine());

        ArrayList<String> arr2 = new ArrayList<>();

        // 비교할 문자열을 arr2에 저장
        for(int i = 0; i < b; i++){
            arr2.add(br.readLine());
        }

        // ?가 첫번째로 올 경우 구하고자 하는 값의 이 전의 단어를 null로 하고
        // ?가 마지막으로 올 경우 구하고자 하는 값의 이 다음 단어를 null로 설정
        // ?가 중간에 올 경우 arr1에 저장된 문자열의 각 앞의 단어와 뒤의 단어를 저장
        String prevWord = (tmp > 0)? arr1.get(tmp - 1) : null;
        String nextWord = (tmp < arr1.size() - 1) ? arr1.get(tmp + 1) : null;


        // 처음 입력받은 것이 ?일 경우
        // 비교할 문자열이 ?일 경우는 지나치고 ?가 아닐 경우에 출력
        if(tmp == 0 && arr1.size() <= 1){
            for(String str2 : arr2){
                if(str2.equals("?")){
                    continue;
                }else{
                    System.out.println(str2);
                    break;
                }
            }
        }else if(tmp == 0){                     // ?가 젤 앞에 있을 경우 다음 단어만 조건식에 넣어서 비교
            for(String str2 : arr2){
                if(!arr1.contains(str2)){
                    if(str2.charAt(str2.length()-1) == nextWord.charAt(0)){
                        System.out.println(str2);
                        break;
                    }
                }
            }
        }else if(tmp >= arr1.size() - 1){       // ?가 젤 마지막일 경우 앞의 단어만 조건식에 넣어서 비교
            for(String str2 : arr2){
                if(!arr1.contains(str2)){
                    if(str2.charAt(0) == prevWord.charAt(prevWord.length() - 1)){
                        System.out.println(str2);
                        break;
                    }
                }
            }
        }else{                                  // ?가 중간일 경우 앞의 단어와 뒤의 단어를 다 비교
            for(String str2 : arr2){
                if(!arr1.contains(str2)){
                    if(str2.charAt(0) == prevWord.charAt(prevWord.length() - 1) && str2.charAt(str2.length()-1) == nextWord.charAt(0)){
                        System.out.println(str2);
                        break;
                    }
                }
            }
        }
    }
}

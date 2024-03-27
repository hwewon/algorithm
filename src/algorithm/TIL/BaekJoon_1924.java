package algorithm.TIL;

import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class BaekJoon_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String[] day = {"SUN ", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int result;
        int c = 0;

        if(a>=1 && a<=12){
            for(int i=1; i<a; i++){
                c += month[i-1];                // 해당 요일 전까지 전체 일 수 합
            }
            result = (b+c) % 7;                 // b+c -> 현재 일 수 합
            System.out.println(day[result]);
        }else{
            System.out.println();
        }
    }
}


        // 실제 요일을 숫자로 반환해서 구하기
        // String[] day = {"Mon", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
//        LocalDate date = LocalDate.of(2007, a, b);
//        DayOfWeek dayOfWeek = date.getDayOfWeek();
//        int n = dayOfWeek.getValue()-1;       // 1~7로 반환되므로 배열 index는 0부터 시작하기 때문에 -1 해줘야함
//        System.out.println(day[n]);



        // Switch-Case 문
//        switch (a) {
//            case 1 :
//                result = b % 7;
//                System.out.println(day[result]);
//                break;
//            case 2 :
//                for(int i=1; i<a; i++){
//                    c += month[i-1];
//                }
//                result = (b+c) % 7;
//                System.out.println(day[result]);
//                break;
//            case 3 :
//                for(int i=1; i<a; i++){
//                    c += month[i-1];
//                }
//                result = (b+c) % 7;
//                System.out.println(day[result]);
//                break;
//            case 4 :
//                for(int i=1; i<a; i++){
//                    c += month[i-1];
//                }
//                result = (b+c) % 7;
//                System.out.println(day[result]);
//                break;
//            case 5 :
//                for(int i=1; i<a; i++){
//                    c += month[i-1];
//                }
//                result = (b+c) % 7;
//                System.out.println(day[result]);
//                break;
//            case 6 :
//                for(int i=1; i<a; i++){
//                    c += month[i-1];
//                }
//                result = (b+c) % 7;
//                System.out.println(day[result]);
//                break;
//            case 7 :
//                for(int i=1; i<a; i++){
//                    c += month[i-1];
//                }
//                result = (b+c) % 7;
//                System.out.println(day[result]);
//                break;
//            case 8 :
//                for(int i=1; i<a; i++){
//                    c += month[i-1];
//                }
//                result = (b+c) % 7;
//                System.out.println(day[result]);
//                break;
//            case 9 :
//                for(int i=1; i<a; i++){
//                    c += month[i-1];
//                }
//                result = (b+c) % 7;
//                System.out.println(day[result]);
//                break;
//            case 10 :
//                for(int i=1; i<a; i++){
//                    c += month[i-1];
//                }
//                result = (b+c) % 7;
//                System.out.println(day[result]);
//                break;
//            case 11 :
//                for(int i=1; i<a; i++){
//                    c += month[i-1];
//                }
//                result = (b+c) % 7;
//                System.out.println(day[result]);
//                break;
//            case 12 :
//                for(int i=1; i<a; i++){
//                    c += month[i-1];
//                }
//                result = (b+c) % 7;
//                System.out.println(day[result]);
//                break;
//            default:
//                System.out.println("잘못");
//                break;
//        }
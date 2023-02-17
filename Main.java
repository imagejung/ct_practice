import java.util.Arrays;
import java.util.*;



//public class Main{
//    public static void main(String[] ars) {
//        Solution_1 s = new Solution_1();

//        System.out.println(s.solution(1,18));
//
//    }
//}
//
//
//class Solution_1 {
//    public String solution(int month, int day) {
//        String answer = "";
//        int[] month_arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 31, 28, 31, 30, 31};
//
//        int end_day;
//        for (end_day = 98-(month_arr[month-1]-day) ; end_day>month_arr[month] ; month++){
//            end_day -= month_arr[month];
//        }
//
//        if (month+1 > 12){
//            month -= 12;
//        }
//
//        answer =  + month+1 + "월 " + end_day + "일";
//
//        return answer;
//    }
//}






//public class Main{
//    public static void main(String[] ars) {
//        Solution_2 s = new Solution_2();
//
//        int a[] = {9,9,8,8,7,8,9};
//        int b[] = {21,25,30,29,22,23,30};
//
//        int c[] = {9,9,9,9,7,9,8};
//        int d[] = {23,23,30,28,30,23,23};
//
//        System.out.println(s.solution(c,d));
//    }
//}

class Solution_2 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        for (int i=0; i<7; i++){
            if (arr2[i] >=29){
                answer += 21-arr1[i];
            }
            else
            answer += arr2[i] - arr1[i];
        }

        return answer;
    }
}





public class Main{
    public static void main(String[] ars) {
        Solution_3 s = new Solution_3();

        String a = "2 3 4 5";
        String b = "15 3 10 9 7 8";
        String c = "97 75 88 99 95 92 73";

        System.out.println(s.solution(c));
    }
}

class Solution_3{
    public String solution(String s) {
        String answer = "";

        // 정수 배열로 변환
        String[] num_str = s.split(" ");
        int [] num = new int[num_str.length];
        for (int k=0; k< num_str.length; k++){
            num[k] = Integer.parseInt(num_str[k]);
        }

        // 오름차순 정렬
        Arrays.sort(num);

        // 소수x 최소값
        int tmp = 0;
        for (int n=0; n<num.length; n++){
            tmp =0;
            for (int m=2; m<num[n]; m++ ){
                if (num[n] % m == 0){
                    tmp ++;
                    break;
                }
            }
            if (tmp == 1){
                answer = num[n] + " ";
                break;
            }
        }

        //소수 최대값
        for (int i=num.length-1; i>=0; i--){
            tmp = 0;
            for (int j=2; j<num[i]; j++){
                if (num[i]% j == 0){
                    tmp++;
                    break;
                }
            }
            if (tmp == 0){
                answer += num[i];
                break;
            }
        }
        return answer;
    }
}

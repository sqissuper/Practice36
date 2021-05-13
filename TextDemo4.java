import java.util.Arrays;
import java.util.Scanner;

/**
 * ClassName:TextDemo43
 * Package:PACKAGE_NAME
 * Description:
 *
 * @Author:HP
 * @date:2021/5/12 20:07
 */
public class TextDemo4 {


    //小易的升级之路
//    public static int getEndPow(int s,int[] arr) {
//        for(int i = 0; i < arr.length; i++) {
//            if(s >= arr[i]) {
//                s += arr[i];
//            } else {
//                s += mcd(s,arr[i]);
//            }
//        }
//        return s;
//    }
//    public static int mcd(int m, int n){
//        while(m % n != 0){
//            int tmp = m % n;
//            m = n;
//            n = tmp;
//        }
//        return n;
//    }


    //三角形的最小路劲
//    public int minimumTotal(List<List<Integer>> triangle) {
//        int n = triangle.size();
//        if(n == 0) return 0;
//        int[][] dp = new int[n][n];
//        dp[0][0] = triangle.get(0).get(0);
//        int sum = dp[0][0];
//        for(int i = 1; i < n; i++ ){
//            dp[i][0] = dp[i - 1][0] + triangle.get(i).get(0);
//            for(int j = 1; j < i; j++) {
//                dp[i][j] = Math.min(dp[i - 1][j],dp[i - 1][j - 1]) + triangle.get(i).get(j);
//
//            }
//            dp[i][i] = triangle.get(i).get(i) + dp[i - 1][i  -1];
//        }
//        int min = Integer.MAX_VALUE;
//        for(int i = 0; i < triangle.get(n - 1).size(); i++) {
//            min = Math.min(min,dp[n - 1][i]);
//            sum = min;
//        }
//        return sum;
//    }

//    public static int getValue(int[] gifts, int n) {
//        // write code here
//        Arrays.sort(gifts);
//        int mid = n / 2;
//        for(int i = 0; i <= mid; i++) {
//            int j = i + mid;
//            if(gifts[i] == gifts[j]) return gifts[i];
//        }
//        return 0;
//    }
    public static void main(String[] args) {

//        int[] arr = {1,2,3,2,2};
//        int n = 5;
//        System.out.println(getValue(arr, n));

        //找出字符串中第一个只出现一次的字符串
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String s = sc.nextLine();
//            int[] tmp = new int[26];
//            for(int i = 0; i < s.length(); i++) {
//                char c = s.charAt(i);
//                tmp[c - 'a']++;
//            }
//            boolean f = false;
//            for(int i = 0; i < s.length(); i++) {
//                char c = s.charAt(i);
//                if(tmp[c - 'a'] == 1){
//                    f = true;
//                    System.out.println(c);
//                    break;
//                }
//            }
//            if(!f) {
//                System.out.println("-1");
//            }
//        }
    }
}

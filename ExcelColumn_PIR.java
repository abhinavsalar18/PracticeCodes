/*
   A->1, B->2, C->3........AA->27,AB->28.......ZY->701(26*26 + 25),ZY->702(26*26 + 26),AAA->703(26*26 + 26 + 1)
   In this problem we have to convert the given string into Integer using  the above
*/


import java.util.Scanner;
import java.lang.*;
class Solution {

    public static long getColumnInt(String ColStr)
    {
        long val = 0;
        for(int i = 0; i < ColStr.length(); i++)
        {
            val = ((val*26) % 1000000007 + (ColStr.charAt(i) - 'A' + 1) % 1000000007) % 1000000007;
        }
        return val;
    }
    //Driver code
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int t = Integer.parseInt(sc.nextLine());

      while(t-- > 0)
      {
          String ColStr = sc.nextLine();
          long res = getColumnInt(ColStr);
          System.out.println(res);
      }
    }
}
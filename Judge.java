import java.util.*;
public class Judge
{
   public int findJudge(int total, int[][]townsFolk)
   {   // initializes the number of people trusting the judge.
       int [] trust = new int[total+1];
        
       for(int i =0;i<townsFolk.length;i++)
       {
           int[] item = townsFolk[i];
           // decrements because others do not trust judge.
           trust[item[0]]--;
           // judges are trusted so increment.
           trust[item[1]]++;
       }

       for(int i = 1;i<=total;i++)
       {
           if(trust[i]==total-1)
           {
               return i;
           }
       }
       return -1;
   }
   public static void main(String[] args)
   {    //respective population per set.
       int A = 4;
       int B =2;
       int C = 3;
        //test cases for each scenario.
       int [][]set1 = {{1,2}};
       int [][]set2 = {{1,3},{2,3}};
       int [][]set3 = {{1,3},{2,3},{3,1}};
       int [][]set4 = {{1,2},{2,3}};
       int [][]set5 = {{1,3},{1,4},{2,3},{2,4},{4,3}};

       Judge finder = new Judge();

       System.out.println("set1 "+finder.findJudge(B,set1));
       System.out.println("set2 "+finder.findJudge(C,set2));
       System.out.println("set3 "+finder.findJudge(C,set3));
       System.out.println("set4 "+finder.findJudge(A,set4));
       System.out.println("set5 "+finder.findJudge(A,set5));
   }
}
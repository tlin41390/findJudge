import java.util.*;
public class Judge
{
   public int findJudge(int total, int[][]townsFolk)
   {   // initializes the number of people trusting the judge.
       int [] trustArray = new int[total+1];

       for(int i =0;i<townsFolk.length;i++)
       {
           int[] item = townsFolk[i];
           trustArray[item[0]]--;
           trustArray[item[1]]++;
       }
       for(int i = 1;i<=total;i++)
       {
           if(trustArray[i]==total-1)
           {
               return i;
           }
       }
       return -1;
   }
   public static void main(String[] args)
   {
       int[][] townsFolk = {{1,3},{1,4},{2,3},{2,4},{4,3}};
       Judge finder = new Judge();
       System.out.println("Result: "+finder.findJudge(4,townsFolk));
   }
}

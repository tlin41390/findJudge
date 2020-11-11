import java.util.*;
public class Judge
{
   public int findJudge(int N, int[][]townsFolk)
   {
       int [] trustArray = new int[N];

       for(int i =0;i<townsFolk.length;i++)
       {
           int[] item = townsFolk[i];
           trustArray[item[0]--]--;
           trustArray[item[1]--]++;
       }
       for(int i = 0;i<N;i++)
       {
           if(trustArray[i]==N-1)
           {
               return i;
           }
       }
       return -1;
   }
}

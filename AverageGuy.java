
import static java.lang.Math.round;
import java.util.Scanner;


public class AverageGuy {
   public static void main(String args[]){
       int n;
       Scanner in = new Scanner(System.in);
       n = in.nextInt();
       int x[] = new int[n];
       int y[] = new int[n];
       double sum = 0;
       
       for(int i=0; i<x.length; i++){
           x[i] = in.nextInt();
           y[i] = in.nextInt();
           sum = (sum+y[i]);
       }
       System.out.println(round(sum/n));
       
       int count = 0;
       
       for(int i=0; i<x.length; i++){
           if(y[i] == (round(sum/n)))
               count++;
               
         }
       
       if(count<1)
           System.out.println("none");
       else
           System.out.println(count);
       
       for(int i=0; i<x.length; i++){
           if(y[i] == (round(sum/n)))
           System.out.print(x[i]+" ");
      }
       System.out.println();
       
   } 
}

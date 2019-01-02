package MathProblem;

//import java.util.Arrays;

import java.util.Arrays;

public class FabonacciSeries {
  public static void main(String[] args) {
      //Find out 50 Febonacci numbers using java

      int fibo[] = new int[20];
      for (int i = 0; i<20; i++){
          if (i <2){
              fibo[i]=i;
          }else{
              fibo[i]=fibo[i - 2] + fibo[i - 1];

          }   //end of if else
      }   //end of the loop
      System.out.println(Arrays.toString(fibo));
  }  //end main
}

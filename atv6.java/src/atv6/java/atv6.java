package atv6.java;
 import java.util.Scanner;
public class atv6 {
  public static void main(String[] args) {
	  Scanner num= new Scanner(System.in);
	  int[] nu= new int[10];
	  int i;
	  for(i=0;i<=nu.length-1;i++){
		  System.out.printf("Informe :",(i+1));
		  nu[i] = num.nextInt();
		  }
	  int max = nu[0];
      for (i=1;i<nu.length;i++) {
         if (nu[i] > max) 
        	 max = nu[i];
      }

System.out.println("Maximo é " + max);
}
  }
  

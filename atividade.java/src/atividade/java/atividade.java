package atividade.java;

import java.util.Scanner;

public class atividade {

	public static void main(String[] args) {
   	Scanner scr = new Scanner(System.in);
   	float notas[];
   	float soma=0;
   	float media=0;
   	notas = new float[10];
       int i;
   	for(i=0;i<=notas.length-1;i++) {
   		System.out.println("Informe as 10 notas");
   		notas[i]= scr.nextFloat();
   	}
   	for(i=1;i<=notas.length-1;i++) {
   		soma=notas[i]+soma;
   	}
   	media=soma/notas.length;
   	System.out.println("Media="+media);
   	for(i=1;i<=notas.length-1;i++) {
   		if(notas[i]>=media) {
   			System.out.println("Nota acima ou dentro da media="+notas[i]);
   	}
   		else if(notas[i]<media) {
   			System.out.println("Nota abaixo da media="+notas[i]);
   }
  }
 }
}





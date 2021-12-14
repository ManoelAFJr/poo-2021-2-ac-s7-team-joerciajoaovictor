package atv5.java;

public class atv5do {
	public static void main(String[] args) {
		String dias[] = {"Segunda","Terça","Quarta","Quinta","Sexta","Sabado","Domingo"};
		int i=0;
		do{
			System.out.println(dias[i]);
			i++;
		}while(i!=dias.length);
}
}

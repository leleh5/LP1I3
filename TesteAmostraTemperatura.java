//Trabalho prático 04
//Letícia Vitória Rodrigues Rosa - CB3013138

import java.util.Scanner;

class TesteAmostraTemperatura
{
	public static void main(String[] argumentos)
	{
		int a, b, c, d, e, f;
		float v;

		Scanner scan = new Scanner(System.in);

		
		System.out.println("Digite o dia:");
		a = scan.nextInt();

		System.out.println("Digite o mes:");
		b = scan.nextInt();

		System.out.println("Digite o ano:");
		c = scan.nextInt();

		System.out.println("Digite a hora:");
		d = scan.nextInt();

		System.out.println("Digite o minuto:");
		e = scan.nextInt();

		System.out.println("Digite o segundo:");
		f = scan.nextInt();

		System.out.println("Digite o valor:");
		v = scan.nextFloat();

		AmostraTemperatura t1 = new AmostraTemperatura(a,b,c,d,e,f,v);

		System.out.println(t1.getNumSeq());
		System.out.println(t1.getData());
		System.out.println(t1.getHora());
		System.out.println(t1.getValor());

		System.out.println("");

		AmostraTemperatura t2 = new AmostraTemperatura();

		System.out.println(t2.getNumSeq());
		System.out.println(t2.getData());
		System.out.println(t2.getHora());
		System.out.println(t2.getValor());

		System.out.println("");

		t1.setData();
		t1.setHora();
		t1.setValor();

		System.out.println(t1.getNumSeq());
		System.out.println(t1.getData());
		System.out.println(t1.getHora());
		System.out.println(t1.getValor());

		System.out.println("");

	}
}
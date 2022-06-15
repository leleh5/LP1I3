//Trabalho prático 03
//Letícia Vitória Rodrigues Rosa - CB3013138

import java.util.Scanner;

class TesteHora
{
	public static void main(String[] argumentos)
	{
		int h, m, s;
		Scanner scan = new Scanner(System.in);

		// Teste construtor Hora(int h, int m, int s)
		System.out.println("Teste construtor Hora(int h, int m, int s): ");
		System.out.println("Digite a hora:");
		h = scan.nextInt();

		System.out.println("Digite o minuto:");
		m = scan.nextInt();

		System.out.println("Digite o segundo:");
		s = scan.nextInt();

		Hora test_h1 = new Hora(h,m,s);


		// Teste construtor Hora()
		System.out.println("");
		System.out.println("Teste construtor Hora(): ");
		Hora test_h2 = new Hora();

		// Teste setHor(int h), setMin(int m), setSeg(int s), getHor(), getMin() e getSeg()
		System.out.println("");
		System.out.println("Teste setHor(int h), setMin(int m), setSeg(int s), getHor(), getMin() e getSeg(): ");
		System.out.println("Digite a hora:");
		h = scan.nextInt();
		test_h1.setHor(h);
		System.out.println(test_h1.getHor());

		System.out.println("Digite o minuto:");
		m = scan.nextInt();
		test_h1.setMin(m);
		System.out.println(test_h1.getMin());

		System.out.println("Digite o segundo:");
		s = scan.nextInt();
		test_h1.setSeg(s);
		System.out.println(test_h1.getSeg());


		// Teste setHor(), setMin(), setSeg(), getHor(), getMin() e getSeg()
		System.out.println("");
		System.out.println("Teste setHor(), setMin(), setSeg(), getHor(), getMin() e getSeg(): ");
		test_h1.setHor();
		System.out.println(test_h1.getHor());
		test_h1.setMin();
		System.out.println(test_h1.getMin());
		test_h1.setSeg();
		System.out.println(test_h1.getSeg());

		// Teste getHora1(), getHora2() e getSegundos()
		System.out.println("");
		System.out.println("Teste getHora1(), getHora2() e getSegundos(): ");
		System.out.println(test_h1.getHora1());
		System.out.println(test_h1.getHora2());
		System.out.println(test_h1.getSegundos());
	}
}
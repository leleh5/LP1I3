//Trabalho prático 04
//Letícia Vitória Rodrigues Rosa - CB3013138

import java.util.Scanner;

class TesteData
{
	public static void main(String[] argumentos)
	{
		int d, m, a;
		Scanner scan = new Scanner(System.in);

		// Teste construtor Data(int d, int m, int a)
		System.out.println("Teste construtor Data(int d, int m, int a): ");
		System.out.println("Digite o dia:");
		d = scan.nextInt();

		System.out.println("Digite o mes:");
		m = scan.nextInt();

		System.out.println("Digite o ano:");
		a = scan.nextInt();

		Data test_d1 = new Data(d,m,a);


		// Teste construtor Data()
		System.out.println("");
		System.out.println("Teste construtor Data(): ");
		Data test_d2 = new Data();

		// Teste setDia(int d), setMes(int m), setAno(int a), getDia(), getMes() e getAno()
		System.out.println("");
		System.out.println("Teste setDia(int d), setMes(int m), setAno(int a), getDia(), getMes() e getAno(): ");
		System.out.println("Digite o dia:");
		d = scan.nextInt();
		test_d1.setDia(d);
		System.out.println(test_d1.getDia());

		System.out.println("Digite o mes:");
		m = scan.nextInt();
		test_d1.setMes(m);
		System.out.println(test_d1.getMes());

		System.out.println("Digite o ano:");
		a = scan.nextInt();
		test_d1.setAno(a);
		System.out.println(test_d1.getAno());


		// Teste setDia(), setMes(), setAno(), getDia(), getMes() e getAno()
		System.out.println("");
		System.out.println("Teste setDia(), setMes(), setAno(), getDia(), getMes() e getAno(): ");
		test_d1.setDia();
		System.out.println(test_d1.getDia());
		test_d1.setMes();
		System.out.println(test_d1.getMes());
		test_d1.setAno();
		System.out.println(test_d1.getAno());

		// Teste mostra1(), mostra2(), bissexto(), diasTranscorridos() e apresentaDataAtual()
		System.out.println("");
		System.out.println("Teste mostra1(), mostra2(), bissexto(), diasTranscorridos() e apresentaDataAtual(): ");
		System.out.println(test_d1.mostra1());
		System.out.println(test_d1.mostra2());
		System.out.println(test_d1.bissexto());
		System.out.println(test_d1.diasTranscorridos());
		test_d1.apresentaDataAtual();
	}
}
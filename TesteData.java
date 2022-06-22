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

		// Teste entraDia(int d), entraMes(int m), entraAno(int a), retDia(), retMes() e retAno()
		System.out.println("");
		System.out.println("Teste entraDia(int d), entraMes(int m), entraAno(int a), retDia(), retMes() e retAno(): ");
		System.out.println("Digite o dia:");
		d = scan.nextInt();
		test_d1.entraDia(d);
		System.out.println(test_d1.retDia());

		System.out.println("Digite o mes:");
		m = scan.nextInt();
		test_d1.entraMes(m);
		System.out.println(test_d1.retMes());

		System.out.println("Digite o ano:");
		a = scan.nextInt();
		test_d1.entraAno(a);
		System.out.println(test_d1.retAno());


		// Teste entraDia(), entraMes(), entraAno(), retDia(), retMes() e retAno()
		System.out.println("");
		System.out.println("Teste entraDia(), entraMes(), entraAno(), retDia(), retMes() e retAno(): ");
		test_d1.entraDia();
		System.out.println(test_d1.retDia());
		test_d1.entraMes();
		System.out.println(test_d1.retMes());
		test_d1.entraAno();
		System.out.println(test_d1.retAno());

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
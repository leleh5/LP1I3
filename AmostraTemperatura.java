//Trabalho Final
//Letícia Vitória Rodrigues Rosa - CB3013138

import java.text.*;
import java.util.*;

public class AmostraTemperatura
{	Scanner scan = new Scanner(System.in);

	//propriedades da classe AmostraTemperatura
	private static int numseq = 0;
	private Data data;
	private Hora hora;
	private float valor;


	//métodos da classe AmostraTemperatura
	public void setData(int a, int b, int c)
	{ 
		int d = a;
		int m = b;
		int ano = c; 

		data = new Data(d,m,ano);
	}
	public void setHora(int a, int b, int c)
	{ 
		int h = a;
		int min = b;
		int s = c;

		hora = new Hora(h,min,s);
	}
	public void setValor(float v)
	{ 
		valor = v; 
		numseq = numseq+1;	
	}

	//
	public void setData()
	{ 
		int d, m, a;

		System.out.println("Digite o dia:");
		d = scan.nextInt();

		System.out.println("Digite o mes:");
		m = scan.nextInt();

		System.out.println("Digite o ano:");
		a = scan.nextInt();


		setData(d,m,a);
	}

	public void setHora()
	{ 
		int h, min, s;


		System.out.println("Digite a hora:");
		h = scan.nextInt();

		System.out.println("Digite o minuto:");
		min = scan.nextInt();

		System.out.println("Digite o segundo:");
		s = scan.nextInt();

		setHora(h,min,s);
	}

	public void setValor()
	{ 
		float v;


		System.out.println("Digite o valor:");
		v = scan.nextFloat();

		setValor(v);

	}

	public int getNumSeq()
	{ return numseq; }
	public String getData()
	{ return data.mostra1(); }
	public String getHora()
	{ return hora.getHora1(); }
	public float getValor()
	{ return valor; }

	//construtor da classe AmostraTemperatura
	AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v)
	{
		int dia = a;
		int m = b;
		int ano = c;
		int h = d;
		int min = e;
		int s = f;

		setData(dia,m,ano);
		setHora(h,min,s);
		setValor(v);

		System.out.println("Cadastrado com sucesso!");
	}
	
	AmostraTemperatura(Data d, Hora h, float v)
	{
		data = d;
		hora = h;
		valor = v;

		System.out.println("Cadastrado com sucesso!");
	}

	AmostraTemperatura()
	{ 
		setData();
		setHora();
		setValor();
		System.out.println("Cadastrado com sucesso!");
	}
	//


}

//Trabalho prático 03
//Letícia Vitória Rodrigues Rosa - CB3013138

import java.util.Scanner;

public class Hora
{
	//propriedades da classe Hora
	private int hora;
	private int min;
	private int seg;

	//construtor da classe Hora
	Hora(int h, int m, int s)
	{
		hora = h;
		min = m;
		seg = s;

		System.out.println("Cadastrado com sucesso!");
	}

	Hora()
	{ 
		int cond=1;

		do{
			int h_temp, m_temp, s_temp;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite a hora:");
			h_temp = scan.nextInt();

			System.out.println("Digite o minuto:");
			m_temp = scan.nextInt();

			System.out.println("Digite o segundo:");
			s_temp = scan.nextInt();

			if((h_temp>=0 && h_temp<24) && (m_temp>=0 && m_temp<60) && (s_temp>=0 && s_temp<60))
			{
				hora = h_temp;
				min = m_temp;
				seg = s_temp;
				cond = 0;
			}
		}while(cond == 1);

		System.out.println("Cadastrado com sucesso!");
	}

	//métodos da classe Hora
	public void setHor(int h)
	{ hora = h; }
	public void setMin(int m)
	{ min = m; }
	public void setSeg(int s)
	{ seg = s; }

	//
	public void setHor()
	{ 
		int cond=1;

		do{
			int h_temp;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite a hora:");
			h_temp = scan.nextInt();

			if(h_temp>=0 && h_temp<24)
			{
				hora = h_temp;
				cond = 0;
			}
		}while(cond == 1); 
	}

	public void setMin()
	{ 
		int cond=1;

		do{
			int m_temp;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o minuto:");
			m_temp = scan.nextInt();

			if(m_temp>=0 && m_temp<60)
			{
				min = m_temp;
				cond = 0;
			}
		}while(cond == 1);
	}

	public void setSeg()
	{ 
		int cond=1;

		do{
			int s_temp;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o segundo:");
			s_temp = scan.nextInt();

			if(s_temp>=0 && s_temp<60)
			{
				seg = s_temp;
				cond = 0;
			}
		}while(cond == 1);
	}

	public int getHor()
	{ return hora; }
	public int getMin()
	{ return min; }
	public int getSeg()
	{ return seg; }

	//
	public String getHora1()
	{ return hora+":"+min+":"+seg; }

	public String getHora2()
	{
		int h_temp;
		String ident;
		
		if(hora<=12)
		{
			h_temp = hora;
			ident = "AM";
		}

		else
		{
			h_temp = hora - 12;
			ident = "PM";
		}
		
		return h_temp+":"+min+":"+seg+" "+ident; 
	}
	public int getSegundos()
	{ 
		int segundo;
		segundo = (hora*3600) + (min*60) + (seg);
		return segundo; 
	}
}

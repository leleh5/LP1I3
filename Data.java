//Trabalho prático 04
//Letícia Vitória Rodrigues Rosa - CB3013138

import java.text.*;
import java.util.*;

public class Data
{
	//propriedades da classe Data
	private int dia;
	private int mes;
	private int ano;

	//construtor da classe Data
	Data(int d, int m, int a)
	{
		dia = d;
		mes = m;
		ano = a;

		System.out.println("Cadastrado com sucesso!");
	}

	Data()
	{ 
		int cond=1;

		do{
			int d_temp, m_temp, a_temp;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o dia:");
			d_temp = scan.nextInt();

			System.out.println("Digite o mes:");
			m_temp = scan.nextInt();

			System.out.println("Digite o ano:");
			a_temp = scan.nextInt();

			if((d_temp>0 && d_temp<32) && (m_temp>0 && m_temp<13) && (a_temp>0))
			{
				dia = d_temp;
				mes = m_temp;
				ano = a_temp;
				cond = 0;
			}
		}while(cond == 1);

		System.out.println("Cadastrado com sucesso!");
	}

	//métodos da classe Data
	public void entraDia(int d)
	{ dia = d; }
	public void entraMes(int m)
	{ mes = m; }
	public void entraAno(int a)
	{ ano = a; }

	//
	public void entraDia()
	{ 
		int cond=1;

		do{
			int d_temp;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o dia:");
			d_temp = scan.nextInt();

			if(d_temp>0 && d_temp<32)
			{
				dia = d_temp;
				cond = 0;
			}
		}while(cond == 1); 
	}

	public void entraMes()
	{ 
		int cond=1;

		do{
			int m_temp;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o mes:");
			m_temp = scan.nextInt();

			if(m_temp>0 && m_temp<13)
			{
				mes = m_temp;
				cond = 0;
			}
		}while(cond == 1);
	}

	public void entraAno()
	{ 
		int cond=1;

		do{
			int a_temp;
			Scanner scan = new Scanner(System.in);
			System.out.println("Digite o ano:");
			a_temp = scan.nextInt();

			if(a_temp>0)
			{
				ano = a_temp;
				cond = 0;
			}
		}while(cond == 1);
	}

	public int retDia()
	{ return dia; }
	public int retMes()
	{ return mes; }
	public int retAno()
	{ return ano; }

	//
	public String mostra1()
	{ return dia+"/"+mes+"/"+ano; }

	public String mostra2()
	{
		String mes_ext;
		switch(mes){
			case 1: mes_ext = "janeiro";
				break;
			case 2: mes_ext = "fevereiro";
				break;
			case 3: mes_ext = "marco";
				break;
			case 4: mes_ext = "abril";
				break;
			case 5: mes_ext = "maio";
				break;
			case 6: mes_ext = "junho";
				break;
			case 7: mes_ext = "julho";
				break;
			case 8: mes_ext = "agosto";
				break;
			case 9: mes_ext = "setembro";
				break;
			case 10: mes_ext = "outubro";
				break;
			case 11: mes_ext = "novembro";
				break;
			case 12: mes_ext = "dezembro";
				break;
			default:
				mes_ext = "nenhum";
		}
		
		return dia+"/"+mes_ext+"/"+ano; 
	}
	public boolean bissexto()
	{
		if((ano%4)==0){
			return true;
		}
		else{return false;}
	}

	public int diasTranscorridos()
	{ 
		int dias_t=0;
		int[] m_30 = {4, 6, 9, 11};
		int[] m_31 = {1, 3, 5, 7, 8, 10, 12};
		int[] m_28 = {2};

		for (int i = mes; i > 0; i--){
			if(Arrays.asList(m_30).contains(i)){
				dias_t += 30;}

			if((Arrays.asList(m_31).contains(i)) && i!=1){
				dias_t += 31;}

			if(Arrays.asList(m_28).contains(i)){
				dias_t += 28;}

		}

		return dias_t+dia;
	}

	public void apresentaDataAtual(){
		Date date = new Date();
        	System.out.println("Current date is " + date);

		DateFormat DFormat = DateFormat.getDateInstance();
		String dat = DFormat.format(new Date());
		System.out.println(dat);
	}


}

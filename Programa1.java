class Programa1
{
	public static void main (String entrada [])
	{
 //declaração de variaveis
 int Numint;
 double NumReal, soma;
 char Caracter;
 
 //entrada de dados
 Numint = Integer.parseInt(entrada[0]);
 NumReal = Double.parseDouble(entrada[1]);
 Caracter = (entrada[2]).charAt (0);
 //processamento
 soma = (double)Numint + NumReal;
 //saida de resultados
 System.out.println((double)Numint + " + " + NumReal + " = " + soma + " sinal " + Caracter);
 
 System.exit(0);
	}
}
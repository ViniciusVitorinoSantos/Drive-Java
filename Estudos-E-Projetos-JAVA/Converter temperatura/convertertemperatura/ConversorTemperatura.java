package convertertemperatura;

import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double cel = 0;
		boolean continuar = true;
		
		do {
			boolean validarEntrada = false;
			
			do {
				System.out.print("Digite a temperatura em graus celcius °C:");
				try {
					// double cel = sc.nextDouble();
					String entrada = sc.next().replace(",", ".");
					cel = Double.parseDouble(entrada);
					validarEntrada = true;

					Celcius celcius = new Celcius(cel);
					Fahrenheit fahrenheit = celcius.converteParaFarenheit();
					System.out.printf("A temperatura em Fahrenheit é: %.2f\n ", fahrenheit.getTemperatura());

				} catch (NumberFormatException e) {
					System.out.println("ERRO! Digite apenas valores numéricos ! ");
				}

			} while (!validarEntrada);

			System.out.println("Deseja continuar ? (S/N)");
			String resposta = sc.next();
			continuar = resposta.equalsIgnoreCase("s");

		} while (continuar);

		sc.close();
	}
}

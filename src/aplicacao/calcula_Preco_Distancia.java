package aplicacao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class calcula_Preco_Distancia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        


        System.out.print("Viagem unica[u] ou semanal[s] ou mensal[m]? [U/S/M] :");
        char letra = sc.nextLine().charAt(0);

       try{ if ((letra == 'u') || (letra == 'U')) {
            System.out.print("Digite a distacia em km: ");
            Double km = sc.nextDouble();

            System.out.print("Digite a média de consumo do veiculo: ");
            Double media = sc.nextDouble();

            System.out.print("Digite o preço por litro do combustivel: ");
            Double pLC = sc.nextDouble();

            Double calc = km / media * pLC;

            System.out.printf("O gasto vai ser de R$:  %.2f", calc);
       }
         else if ((letra == 'S') || (letra == 's')) {

            System.out.println("Apenas de seugnda a sexta? [s/n] ");
            char diaS = sc.nextLine().charAt(0);
            switch (diaS) {
                case 's':
                    System.out.print("Digite a distacia em km: ");
                    Double km = sc.nextDouble();

                    System.out.println("Digite a média de consumo do veiculo: ");
                    Double media = sc.nextDouble();

                    System.out.print("Digite o preço por litro do combustivel: ");
                    Double pLC = sc.nextDouble();

                    Double calc = (km / media * pLC) * 5;

                    System.out.printf("O gasto vai ser de %.2f", calc);
                    break;
                case 'n':
                    System.out.print("Digite a distacia em km: ");
                    km = sc.nextDouble();

                    System.out.println("Digite a média de consumo do veiculo: ");
                    media = sc.nextDouble();

                    System.out.print("Digite o preço por litro do combustivel: ");
                    pLC = sc.nextDouble();

                    calc = (km / media * pLC) * 7;

                    System.out.printf("O gasto vai ser de %.2f", calc);
            }
        } else {
            System.out.println("Somente dias úteis? [s/n] ");
            char diaM = sc.nextLine().charAt(0);
            if (diaM == 's') {
                System.out.print("Digite a distacia em km: ");
                Double km = sc.nextDouble();

                System.out.println("Digite a média de consumo do veiculo: ");
                Double media = sc.nextDouble();

                System.out.print("Digite o preço por litro do combustivel: ");
                Double pLC = sc.nextDouble();

                Double calc = (km / media * pLC) * 22;

                System.out.printf("O gasto vai ser de %.2f", calc);
            } else {
                System.out.print("Digite a distacia em km: ");
                Double km = sc.nextDouble();

                System.out.println("Digite a média de consumo do veiculo: ");
                Double media = sc.nextDouble();

                System.out.print("Digite o preço por litro do combustivel: ");
                Double pLC = sc.nextDouble();

                Double calc = (km / media * pLC) * 30;

                System.out.printf("O gasto vai ser de %.2f", calc);
            }

        }
    } catch(InputMismatchException err){
        System.out.println("Erro: valor digitado é invalido");
   }

        sc.close();

    }
}

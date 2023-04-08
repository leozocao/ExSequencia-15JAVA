import java.util.Scanner;

public class impostor{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double ganhaHora, horaTrabalha, salarioBruto, salarioLiquido;
        double descontoIR, descontoINSS, descontoSindi;

        System.out.print("Digite quanto você ganha por hora: ");
        ganhaHora = teclado.nextDouble();
        System.out.print("Digite quantas horas você trabalha no mês: ");
        horaTrabalha = teclado.nextDouble();

        salarioBruto = horaTrabalha * ganhaHora;
        descontoIR = salarioBruto * (11 / 100.0f);
        descontoINSS = salarioBruto * (8 / 100.0f);
        descontoSindi = salarioBruto * (5 / 100.0f);
        salarioLiquido = salarioBruto - descontoIR - descontoINSS - descontoSindi;

        System.out.printf("Seu salário bruto foi de R$%.2f \nPorém, descontando R$%.2f do Imposto de Renda, R$%.2f do INSS e R$%.2f do sindicato, o salário líquido fica: R$%.2f", salarioBruto, descontoIR, descontoINSS, descontoSindi, salarioLiquido);
       
        teclado.close();

    }

}
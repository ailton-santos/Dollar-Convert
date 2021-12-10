public class Main { public static void main(String args[])

    {
        Scanner input = new Scanner(System.in);
        double real;
        // valor da conversão de dólar para real
        double dolar;
        // quantidade em dólares do usuário
        double cotacao;
        // cotação do dólar
        System.out.print("Digite a quantidade em dolar:" );
        dolar = input.nextDouble();
        System.out.print("Digite a cotação do dolar:" );
        cotacao = input.nextDouble();
        real = dolar * cotacao;
        System.out.printf("Quantia em reais: " +real+ " R$");
    }

    }

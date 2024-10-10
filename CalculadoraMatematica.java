import java.util.Scanner;

public class CalculadoraMatematica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("=== Calculadora ===");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Potência");
            System.out.println("6. Raiz Quadrada");
            System.out.println("7. Seno");
            System.out.println("8. Cosseno");
            System.out.println("9. Tangente");
            System.out.println("10. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                case 5:
                    System.out.print("Digite a base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o expoente: ");
                    int expoente = scanner.nextInt();
                    System.out.println("Resultado: " + Math.pow(num1, expoente));
                    break;
                case 6:
                    System.out.print("Digite o número: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        System.out.println("Resultado: " + Math.sqrt(num1));
                    } else {
                        System.out.println("Erro: Raiz quadrada de número negativo não é permitida.");
                    }
                    break;
                case 7:
                    System.out.print("Digite o ângulo em graus: ");
                    double angulo = scanner.nextDouble();
                    System.out.println("Resultado: " + Math.sin(Math.toRadians(angulo)));
                    break;
                case 8:
                    System.out.print("Digite o ângulo em graus: ");
                    angulo = scanner.nextDouble();
                    System.out.println("Resultado: " + Math.cos(Math.toRadians(angulo)));
                    break;
                case 9:
                    System.out.print("Digite o ângulo em graus: ");
                    angulo = scanner.nextDouble();
                    System.out.println("Resultado: " + Math.tan(Math.toRadians(angulo)));
                    break;
                case 10:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println(); // Linha em branco para melhor legibilidade
        } while (opcao != 10);

        scanner.close();
    }
}

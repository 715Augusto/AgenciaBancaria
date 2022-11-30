package AgenciaBancaria;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaBancaria {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Contacorrente> contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Contacorrente>();
        operacoes();
    }

    public static void operacoes() {
        System.out.println("                              ");
        System.out.println("           Banco APK          ");
        System.out.println("                              ");
        System.out.println("Que operação deseja realizar ?");
        System.out.println("                              ");
        System.out.println("  Abrir minha conta corrente  ");
        System.out.println("     Efetuar um depósito      ");
        System.out.println("         Realizar saque       ");
        System.out.println("   Efetuar uma transferência  ");
        System.out.println("             Sair             ");

        int operacao = input.nextInt();

        switch (operacao) {
            case 1:
                criarContacorrente();
                break;
            case 2:
                depositar();
                break;
            case 3:
                sacar();
                break;
            case 4:
                transferir();
                break;
            case 5:
                System.out.println("Obrigado usar nossa agência, volte sempre!!");
                System.exit(0);
            default:
                System.out.println("Opção inválida!");
        }

    }
    public static void criarContacorrente(){
        System.out.println("\nNome: ");
        String nome = input.next();

        System.out.println("\nCPF: ");
        String cpf = input.next();

        System.out.println("\nEmail: ");
        String email = input.next();

        Cliente cliente = new Cliente(nome,cpf,email);
        Contacorrente contacorrente = new Contacorrente(cliente);

        contasBancarias.add(contacorrente);
        System.out.println("Sua conta foi criada com sucesso");
    }


    public static void depositar(){

    }
    public static void sacar(){}
    public static void transferir(){}
    public static void sair(){}

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
        }
    }
}
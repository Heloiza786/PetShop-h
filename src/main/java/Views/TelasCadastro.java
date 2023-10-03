package Views;

import Domain.Users;

import java.util.Scanner;

public class TelasCadastro {
    static Scanner sc = new Scanner(System.in);
    static TelasCadastro telas = new TelasCadastro();

    static Users user = new Users();

    public static void cadastroUsuario(){



        System.out.println("Nome: ");
         user.name = sc.nextLine();

        System.out.println("Idade: ");
        user.age = sc.nextInt();

        System.out.println("Endereço: ");
        user.address = sc.nextLine();

        System.out.println("E-mail: ");
        user.email = sc.nextLine();

        System.out.println("Senha: ");
        user.password = sc.nextLine();

        System.out.println("CPF: ");
        user.cpf = sc.nextLine();




    }

}

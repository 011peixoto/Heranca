package sp.senai.sp.jandira.model;

import java.util.Scanner;

public class Jogador extends Pessoas {

        String posicao;
        int numeroCamisa;

        Scanner scanner = new Scanner(System.in);

    public void cadastrarJogador(){

        System.out.println("/----- Cadastro -----/");
        System.out.println("Informe o seu Nome: ");
        super.nome = scanner.nextLine();
        System.out.println("Informe seu Rg: ");
        super.rg = scanner.nextLong();
        System.out.println("Informe seu cpf: ");
        super.cpf = scanner.nextLong();
        System.out.println("Informe sua Idade: ");
        super.idade = scanner.nextInt();
        System.out.println("Informe o numero da Sua Camisa: ");
        numeroCamisa = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe sua Posição: ");
        posicao = scanner.nextLine();
        System.out.println("/-----------------------------------/");




    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }


}


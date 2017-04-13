package testes;


import strategy.*;

import java.util.Scanner;

public class TestePrincipal_strategy {

    public static void main(String[] args) {

        ContaVeiculoMoto umEixo = new ContaVeiculoMoto();
        ContaVeiculo2Eixo doisEixo = new ContaVeiculo2Eixo();
        ContaVeiculo3Eixo tresEixo = new ContaVeiculo3Eixo();
        ContaVeiculo4Eixo quatroEixo = new ContaVeiculo4Eixo();
        ContaVeiculo5Eixo cincoEixo = new ContaVeiculo5Eixo();
        Scanner entrada = new Scanner(System.in);
        Veiculo veiculo = new Veiculo(15);

        ContaEstacionamento calculador = new ContaEstacionamento();

        System.out.println("Valor Cobrado por Moto: " + calculador.realizarCalculo(veiculo, umEixo));

        System.out.println("Valor Cobrado por Automóvel: " + calculador.realizarCalculo(veiculo, doisEixo));

        System.out.println("Valor Cobrado por Caminhão Três Eixos: " + calculador.realizarCalculo(veiculo, tresEixo));

        System.out.println("Valor Cobrado por Caminhão Quatro Eixos: " + calculador.realizarCalculo(veiculo, quatroEixo));

        System.out.println("Valor Cobrado por Caminhão Cinco Eixos: " + calculador.realizarCalculo(veiculo, cincoEixo));

    }
}

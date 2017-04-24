package teste_contrato;

import contrato.*;

public class TestePrincipal {

    public static void main(String[] args) {

        CarroPasseioA passeioA = new CarroPasseioA();
        CarroPasseioB  passeioB = new CarroPasseioB();
        CarroPasseioC passeioC = new CarroPasseioC();
        Moto moto = new Moto();
        Caminhao caminhao = new Caminhao();

        Veiculo veiculo = new Veiculo();

        ContaLocacao locacao = new ContaLocacao();

        locacao.realizarCalculo(veiculo, passeioA);
        locacao.realizarCalculo(veiculo, passeioB);
        locacao.realizarCalculo(veiculo, passeioC);
        locacao.realizarCalculo(veiculo, moto);
        locacao.realizarCalculo(veiculo, caminhao);
        


    }
}

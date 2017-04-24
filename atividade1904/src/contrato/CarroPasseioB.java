package contrato;

public class CarroPasseioB implements Contrato {

    @Override
    public double locacao(Veiculo veiculo) {
        double valor = 79.99 * 1.10;
        System.out.println("Valor da Locação: 79.99");
        System.out.println("Valor do Imposto: 10%");
        return valor;
    }
}

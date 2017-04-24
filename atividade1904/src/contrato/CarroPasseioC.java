package contrato;

public class CarroPasseioC implements Contrato {

    @Override
    public double locacao(Veiculo veiculo) {
        double valor = 100.99 * 1.10;
        System.out.println("Valor da Locação: 100.99");
        System.out.println("Valor do Imposto: 10%");
        return valor;
    }
}

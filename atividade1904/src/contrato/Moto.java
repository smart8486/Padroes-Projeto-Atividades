package contrato;

public class Moto implements Contrato {

    @Override
    public double locacao(Veiculo veiculo) {
        double valor = 39.99 * 1.10;
        System.out.println("Valor da Locação: 39.99");
        System.out.println("Valor do Imposto: 10%");
        return valor;
    }
}

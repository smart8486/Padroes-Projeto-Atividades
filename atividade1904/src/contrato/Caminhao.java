package contrato;

public class Caminhao implements Contrato {

    @Override
    public double locacao(Veiculo veiculo) {
        double valor = 159.99 * 1.10;
        System.out.println("Valor da Locação: 159.99");
        System.out.println("Valor do Imposto: 10%");
        return valor;
    }
}

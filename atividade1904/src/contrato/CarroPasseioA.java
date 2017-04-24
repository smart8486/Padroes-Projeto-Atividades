package contrato;

public class CarroPasseioA implements Contrato {

    @Override
    public double locacao(Veiculo veiculo) {
        double valor = 59.99 * 1.10;
        System.out.println("Valor da Locação: 59.99");
        System.out.println("Valor do Imposto: 10%");
        return valor;
        
    }
}

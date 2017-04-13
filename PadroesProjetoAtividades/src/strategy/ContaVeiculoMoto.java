package strategy;

public class ContaVeiculoMoto implements ContaVeiculo {

    @Override
    public double calcular(Veiculo veiculo) {
        double valor = veiculo.getHora() * 1.00;

        return valor;
    }
}

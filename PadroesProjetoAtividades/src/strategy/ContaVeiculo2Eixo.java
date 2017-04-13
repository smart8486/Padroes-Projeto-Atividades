package strategy;

public class ContaVeiculo2Eixo implements ContaVeiculo {

    @Override
    public double calcular(Veiculo veiculo) {
        double valor = veiculo.getHora() * 2.00;
        
        if (veiculo.getHora() > 12) {
            return (veiculo.getHora() * 2.00) / 10 + valor;
        }
        return valor;
    }
}

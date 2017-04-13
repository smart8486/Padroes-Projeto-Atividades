package strategy;

public class ContaVeiculo4Eixo implements ContaVeiculo {

    @Override
    public double calcular(Veiculo veiculo) {
        double valor = veiculo.getHora() * 12.00;
        
        if (veiculo.getHora() > 12) {
            return (veiculo.getHora() * 7.00) / 15 + valor;
        }
        return valor;
    }
}

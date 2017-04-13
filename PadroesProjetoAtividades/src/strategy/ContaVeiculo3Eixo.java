package strategy;

public class ContaVeiculo3Eixo implements ContaVeiculo {

    @Override
    public double calcular(Veiculo veiculo) {
        if (veiculo.getHora() > 12) {
            return (veiculo.getHora() * 4.50) / 12 + veiculo.getHora() * 4.50;
        }
        return veiculo.getHora() * 4.50;
    }
}

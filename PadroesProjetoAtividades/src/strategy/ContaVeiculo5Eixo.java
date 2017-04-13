package strategy;

public class ContaVeiculo5Eixo implements ContaVeiculo {

    @Override
    public double calcular(Veiculo veiculo) {
        
        double valor = veiculo.getHora() * 12.00;
        
        if (veiculo.getHora() > 12) {
            return valor / 20 + valor;
        }
        return valor;
    }
}

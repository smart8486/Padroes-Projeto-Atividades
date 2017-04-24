package contrato;

public class ContaLocacao {

    public void realizarCalculo(Veiculo veiculo, Contrato Veiculo) {

        double valortotal = Veiculo.locacao(veiculo);
        String resultado = String.format("%.2f", valortotal);

        System.out.println("Valor Total: " + resultado + "\n" + "-------------------------------------");
    }
}

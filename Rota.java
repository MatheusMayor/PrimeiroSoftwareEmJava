import javax.swing.JOptionPane;

public class Rota {
    public void planejarDia() {
        int quantidadeRotas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de rotas do dia:"));
        double totalKm = 0;

        for (int i = 1; i <= quantidadeRotas; i++) {
            double kmRota = Double
                    .parseDouble(JOptionPane.showInputDialog("Digite a quilometragem da rota " + i + ":"));
            totalKm += kmRota;
        }

        double mediaConsumo = 2.5; // média de consumo em km/litro
        double quantidadeCombustivel = totalKm / mediaConsumo;

        double valorLitroDiesel = Double
                .parseDouble(JOptionPane.showInputDialog("Digite o valor do litro do óleo diesel:"));
        double valorTotalCombustivel = valorLitroDiesel * quantidadeCombustivel;

        JOptionPane.showMessageDialog(null, "Total de KM: " + totalKm
                + "\nQuantidade de combustível necessária: " + quantidadeCombustivel + " litros"
                + "\nValor total desembolsado: R$" + valorTotalCombustivel);
    }
}
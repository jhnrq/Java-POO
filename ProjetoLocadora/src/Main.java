import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Carro carro1 = new Carro("Porsche", "Cayenne", 2027, "ABC1B34", 2350, 4);
//        Moto moto1 = new Moto("Suzuki", "Hayabusa", 2005, "DYG-2146", 190, 1000);

//        System.out.println(carro1.exibirDados());
//        System.out.println(moto1.exibirDados());

        Locadora locadora = new Locadora();
        locadora.addVeiculo(new Carro("Volkswagen", "Nivus", 2024, "ABL1C22", 450, 4));
        locadora.addVeiculo(new Carro("Volkswagen", "T-Cross", 2025, "ABL1C83", 500, 4));
        locadora.addVeiculo(new Carro("Fiat", "Argo", 2026, "GBA3D34", 200, 4));
        locadora.addVeiculo(new Carro("Fiat", "e500", 2025, "GBD1F85", 500, 2));
        locadora.addVeiculo(new Carro("Hyundai", "HB20s", 2023, "FRN4D22", 250, 4));
        locadora.addVeiculo(new Carro("Hyundai", "Creta", 2026, "TJM2F58", 550, 4));
        locadora.addVeiculo(new Moto("Honda", "CG", 2022, "BRA2E19", 120, 160));
        locadora.addVeiculo(new Moto("Yamaha", "Fazer", 2021, "KLM5G47", 170, 250));
        locadora.addVeiculo(new Moto("Kawasaki", "Ninja", 2020, "FLW4J91", 550, 160));
        locadora.addVeiculo(new Moto("Yamaha", "YZF-R3", 2022, "HJK5L52", 280, 320));

        locadora.listarVeiculo();

        int tamanho = locadora.getFrota().size();

        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha o veículo de 1 a " + tamanho + ": ");
        int veiculoSelecionado = sc.nextInt();

        System.out.print("Quantidade de dias: ");
        int dias = sc.nextInt();

        locadora.aluguelVeiculo(dias, (veiculoSelecionado - 1));

    }
}

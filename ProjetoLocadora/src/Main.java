import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Porsche", "Cayenne", 2027, "ABC1B34", 2350, 4);
        Moto moto1 = new Moto("Suzuki", "Hayabusa", 2005, "DYG-2146", 190, 1000);


        System.out.println(carro1.exibirDados());
        System.out.println(moto1.exibirDados());

        Locadora locadora = new Locadora();
        locadora.addVeiculo(new Carro("Volkswgen", "Nivus", 2024, "TMA2F66", 550, 4));
        locadora.addVeiculo(new Moto("BMW", "R1250", 2020, "GDA4C37", 700, 1000));

        locadora.listarVeiculo();


    }
}

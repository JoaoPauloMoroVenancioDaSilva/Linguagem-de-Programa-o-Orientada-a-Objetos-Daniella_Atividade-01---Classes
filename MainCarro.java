public class MainCarro {
    public static void main(String[] args) {
        //Vamos criar os objetos da class CARRO
        Carro carro1 = new Carro("Toyota", "Prata", "Corolla", 2018);
        Carro carro2 = new Carro("Honda", "Preto", "Civic", 2020);
        Carro carro3 = new Carro("Wolksvagen", "Amarelo", "Brasília", 1981);

        //Vamos utilizar os métodos construídos para definir a velocidade
        carro1.acelerar(100);
        carro2.acelerar(120);
        carro3.acelerar(80);

        System.out.println(carro1.getDescricao());
        System.out.println(carro2.getDescricao());
        System.out.println(carro3.getDescricao());

        System.out.println();
        carro1.frear(50);
        carro2.frear(95);
        carro3.frear(40);

        System.out.println(carro1.getDescricao());
        System.out.println(carro2.getDescricao());
        System.out.println(carro3.getDescricao());

        System.out.println();
        //Troca de Óleo
        carro1.trocarOleo("Gasolina Aditivada");
        carro2.trocarOleo("Etanol");
        carro3.trocarOleo("Gasolina");

        System.out.println();
        //Revisão dos freios
        carro1.revisarFreio(5);
        carro2.revisarFreio(3);
        carro3.revisarFreio(10);

        System.out.println();
        //Consumo médio de combustível de cada um
        System.out.println(carro1.consumoMedio(10, 126));
        System.out.println(carro2.consumoMedio(10, 144));
        System.out.println(carro3.consumoMedio(10, 110));

        System.out.println();
        //Checar o valor inicial do tanque
        carro1.tanqueLitros();
        carro2.tanqueLitros();
        carro3.tanqueLitros();

        System.out.println();
        //Simulador de viagem
        carro1.viagemSimulator(500);
        carro2.viagemSimulator(1000);
        carro3.viagemSimulator(100);

        System.out.println();
        //Checar o valor final do tanque
        carro1.tanqueLitros();
        carro2.tanqueLitros();
        carro3.tanqueLitros();
    }
}

import java.util.Scanner;

public class Carro {
    Scanner scanner = new Scanner(System.in);
        //Atributos
        private String marca;
        private String cor;
        private String modelo;
        private int ano_fabricacao;
        private double velocidade;
        private double tanque;
        private String tipoOleo;
        private double media;
        private double combustivelGasto;

        //Construtores
        public Carro(String marca, String cor, String modelo, int ano_fabricacao) {
            this.marca = marca;
            this.cor = cor;
            this.modelo = modelo;
            this.ano_fabricacao = ano_fabricacao;
            this.velocidade = 0;
            this.tanque = 55; //Média de Litros em um tanque de carro
            this.tipoOleo = "" ;
            this.media = 0;
            this.combustivelGasto = 0;
        }


        //Métodos
        public void acelerar(double incremento) {
            this.velocidade += incremento;
        }

        public void frear(double decremento){
            this.velocidade -= decremento;
        }

        public String getDescricao(){
            return "Marca: " + this.marca + ", Cor: " + this.cor + ", Modelo: " + this.modelo + ", Ano de Fabricação" + this.ano_fabricacao + ", Velocidade: " + this.velocidade;
        }

        public void tanqueLitros(){
            if (this.tanque == 55){
                System.out.println(this.tanque + " litros. O tanque do " + this.modelo + " está cheio.");
            }else if(this.tanque >= 45 ){
                System.out.println(this.tanque + " litros. O tanque do " + this.modelo + " está quase cheio.");
            }else if(this.tanque >= 30){
                System.out.println(this.tanque + " litros. O tanque do " + this.modelo + " está com boa quantidade de óleo. ");
            }else if(this.tanque >= 20){
                System.out.println(this.tanque + " litros. O tanque do " + this.modelo + " está cheio pela metade");
            }else if(this.tanque >= 10){
                System.out.println(this.tanque + " litros. O tanque do " + this.modelo + " está com pouco óleo.");
            }else if(this.tanque > 0){
                System.out.println(this.tanque + " litros. O tanque do " + this.modelo + " está com pouquíssimo óleo.");
            }else {
                System.out.println(this.tanque + " litros. O tanque do " + this.modelo + " está vazio.");
            }
        }

        //Método Trocar Óleo
        public void trocarOleo(String Oleo){
            this.tipoOleo = Oleo;
            System.out.println("O óleo agora é " + this.tipoOleo);
        }

        //Método Revisar Freio
        public void revisarFreio(int condicao){
            if (condicao >= 7){
                System.out.println("Os freios do " + this.modelo + " estão usáveis.");
            }else if (condicao >= 4){
                System.out.println("Os freios do " + this.modelo + " estão inconsistentes. Melhor ir no mecânico.");
            }else {
                System.out.println("Os freios do " + this.modelo + " estão péssimos. Troque imediatamente.");
            }
        }
        // Método Consumo Médio
        public String consumoMedio(double litro, int km){
            this.media = km/litro ;
            return "Esse carro faz " + this.media + " km/L" ;
        }

        //Simulação de viagem
        public void viagemSimulator(double distancia){
            this.combustivelGasto = (distancia / this.media);
            this.tanque -= this.combustivelGasto;
            if (this.tanque < 0){
                this.tanque = 0;
            }
        }


}

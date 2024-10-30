package javaCurso.classe;

class Carro { //Criando uma classe de Carro

    //ATRIBUTOS
    String cor;
    String modelo;


    //CONSTRUT
    public Carro(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }


    //Métodos
    public void acelerar() {
        System.out.println("Carro acelerado " + this.modelo);
    }
}

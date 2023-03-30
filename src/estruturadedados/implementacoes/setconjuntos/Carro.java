package estruturadedados.implementacoes.setconjuntos;

import java.util.Objects;

class Carro implements Comparable<Carro>{
    
    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public boolean equals(Object o){
        if (this == o) return true; //testa se o objeto instanciado é igual o outro
        
        if (o == null || getClass() != o.getClass()) return false;

        Carro carro = (Carro) o; //cria objeto carro e faz cast do obj passado por parametro
        return Objects.equals(this.marca, carro.marca);
    }

    public int hashCode() { //retorna um hash
        return Objects.hash(marca);
    }

    public String toString() {
        return "Carro{" + marca + "}";
    }

    // retorna baseado no tamanho
    // public int compareTo(Carro carro) {
    //     if (this.marca.length() < carro.marca.length()) {
    //         return -1;
    //     } else if (this.marca.length() > carro.marca.length()){
    //         return 1;
    //     }  //pois se parar em qualquer lugar vai parar e retornar
    //     return 1; //tree não usa o 0, pois se for igual vai pra direita
    //     //0 não adiciona
    // }

    //comparacao de ordem alfabetica
    //usando metodo compareTo da classe String
    public int compareTo(Carro carro) {
        return this.getMarca().compareTo(carro.marca);
    }
}

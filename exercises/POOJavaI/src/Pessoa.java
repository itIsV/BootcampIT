public class Pessoa {

    String nome;
    int idade;
    String ID;
    Double peso;
    Double altura;

    public Pessoa(String nome, int idade, String ID, Double peso, Double altura) {

        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", ID='" + ID + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}

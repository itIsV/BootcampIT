import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pessoa {

    private String nome;
    private int idade;
    private String ID;
    private Double peso;
    private Double altura;
    public static ArrayList<HashMap> pessoas = new ArrayList();
    private HashMap<String, String> pessoa = new HashMap();

    public Pessoa(String nome, int idade, String ID, Double peso, Double altura) {

        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;

        this.pessoa.put(
            "nome", nome
        );

        this.pessoa.put(
            "idade", Integer.toString(idade)
        );

        this.pessoa.put(
            "ID", ID
        );

        this.pessoa.put(
            "peso", Double.toString(peso)
        );

        this.pessoa.put(
            "altura", Double.toString(altura)
        );

        pessoas.add(pessoa);

    }

    public Pessoa(String nome, int idade, String ID) {

        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa() {

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

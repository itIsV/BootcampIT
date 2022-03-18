public class Main {

    public static void main(String [] args) {

        Pessoa hommer = new Pessoa("Hommer", 39, "171", 85.00,1.78);

        Pessoa Anonymous = new Pessoa("Hom", 39, "171", 85.00,1.78);

        Pessoa Anonymous2 = new Pessoa("???", 39, "171");

        Pessoa Anonymous3 = new Pessoa();

        System.out.println(Anonymous3);

        Pessoa.pessoas.stream().forEach(System.out::println);


    }

}

package Explicaçao;

/*
    Criar uma classe Funcionário
    com os seguintes atributos:
        - Nome
        - Idade
        - Cargo
        - Salário
        - Endereço
      Construa um método exibe() que
      permite exibir todos estes campos.

 */
public class Funcionario {
    // Declaração dos atributos da classe
    // Características da classe
    // Determinam o estado do objeto
    private String nome;
    private Integer idade;
    private String cargo;
    private double salario;
    private String endereco;

    // Declarando construtores da classe
    // Aqui inicializamos os atributos da classe
//     Construtor vazio
    public Funcionario() {

        this.nome = "Não preenchido";
        this.idade = 0;
        this.salario = 0;
        this.endereco = "Não preenchido";
    }

    //    Construtor com atributos
    public Funcionario(String nome,
                       Integer idade,
                       double salario,
                       String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
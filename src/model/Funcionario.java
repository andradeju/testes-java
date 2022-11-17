package model;

public abstract class Funcionario {
    protected int numRegitro;
    protected String nome;

    public Funcionario(int numRegitro, String nome) {
        super();
        this.numRegitro = numRegitro;
        this.nome = nome;
    }
    //as classes abstratas me permitem criar as "cláusulas contratuais" p/ que as subclasses se comprometam a
    // implementar.
    public abstract  double calcularSalario();

    public int getNumRegitro() {
        return numRegitro;
    }

    public void setNumRegitro(int numRegitro) {
        this.numRegitro = numRegitro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

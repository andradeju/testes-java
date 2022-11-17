package model;

public class Empreteiro extends Funcionario{
    private double valorEmpreita;

    public Empreteiro(int numRegitro, String nome, double valorEmpreita) {
        super(numRegitro, nome);
        this.valorEmpreita = valorEmpreita;
    }

    public double getValorEmpreita() {

        return valorEmpreita;
    }

    public void setValorEmpreita(double valorEmpreita) {

        this.valorEmpreita = valorEmpreita;
    }

    @Override
    public double calcularSalario() {
        return valorEmpreita;
    }
}

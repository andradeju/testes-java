package app;

import model.Conta;
import model.ContaEspecial;

public class PIBank {
    public static void main(String[] args) {
        Conta c1 = new Conta("Juca", "123321456", 1234,100);
        Conta c2 = new ContaEspecial("Madonna","98765432114", 3412,100.00,100.00);

        System.out.println(c1);
        System.out.println(c2);
        c1.debitar(80);
        c2.debitar(180);

        System.out.println(c1);
        System.out.println(c2);
    }
}

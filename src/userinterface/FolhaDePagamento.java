package userinterface;

import model.*;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionario f1, f2, f3, f4;

        f1 = new Chefe(1234, "Ju Chefinha",5000,15.0,500.0);
        f2 = new Comissionado(4321, "Juca", 4000,35.0);
        f3 = new Horista(9876,"Nietzsche", 80, 150.0);
        f4 = new Empreteiro(5612, "Freud", 5872.35);

        System.out.println(f1.getNumRegitro()+ " - " +f1.getNome()+ " R$ " +f1.calcularSalario());
        System.out.println(f2.getNumRegitro()+ " - " +f2.getNome()+ " R$ " +f2.calcularSalario());
        System.out.println(f3.getNumRegitro()+ " - " +f3.getNome()+ " R$ " +f3.calcularSalario());
        System.out.println(f4.getNumRegitro()+ " - " +f4.getNome()+ " R$ " +f4.calcularSalario());
    }
}

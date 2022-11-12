import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Leonardo", 200266, 17);
        System.out.println("Nome:" + a1.getNome());
        System.out.println("R.A: " + a1.getRa());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("-------------------------------------");

        Aluno a2 = new Aluno("Ramon", 200272, 17);
        System.out.println("Nome:" + a2.getNome());
        System.out.println("R.A: " + a2.getRa());
        System.out.println("Idade: " + a2.getIdade());
        System.out.println("-------------------------------------");

        ArrayList <Aluno> lista = new ArrayList();
        lista.add(a1);
        lista.add(a2);

        for (Aluno a: lista)
        {

            System.out.println("Nome: " + a.getNome());
            System.out.println("R.A: " + a.getRa());
            System.out.println("Idade: " + a.getIdade());
            System.out.println("-------------------------------------");

        }


    }
}
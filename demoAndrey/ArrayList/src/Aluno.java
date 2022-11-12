public class Aluno {

    private String nome;
    private int ra;
    private int idade;

    public Aluno(String nome, int ra, int idade) {
        this.nome = nome;
        this.ra = ra;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

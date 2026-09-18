public class Paciente {
    private String nome;
    private String cpf;
    private String telefone;
    private char genero;
    private int idade;
    private Recepcionista recepCadastro;

    public void cadastrar(Recepcionista recepcionista){
        this.recepCadastro = recepcionista;
    }

    public void consultar(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

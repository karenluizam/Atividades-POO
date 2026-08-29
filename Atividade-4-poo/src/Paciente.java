public class Paciente {
    private String nome;
    private String cpf;
    private String telefone;
    private char genero;
    private int idade;

    public Paciente() {
    }

    public Paciente(String nome, String cpf, String telefone, char genero, int idade) throws Exception{
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setGenero(genero);
        setIdade(idade);
    }

    public void consultar(){

    }
    public void cadastrar(){

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

    public void setCpf(String cpf) throws Exception{
        if(cpf.isBlank() || cpf.isEmpty()){
            throw new Exception("CPF Obrigatório!");
        }

        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws Exception{
        if(telefone.isBlank() || telefone.isEmpty()){
            throw new Exception("Telefone Obrigatório!!");
        }

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

    public void mostrar(){
        System.out.println("Nome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("Tel: "+telefone);
        System.out.println("Genero: "+genero);
        System.out.println("idade: "+idade);
    }
}

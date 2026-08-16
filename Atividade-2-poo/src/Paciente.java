public class Paciente {
    public String nome;
    public String cpf;
    public String telefone;
    public char genero;
    public int idade;

    public void consultar(){

    }
    public boolean cadastrar(){

        return false;
    }

    public void mostrar(){
        System.out.println("Nome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("Tel: "+telefone);
        System.out.println("Genero: "+genero);
        System.out.println("idade: "+idade);
    }
}

public class Consulta extends Agenda{
    private String motivo;
    private String historico;
    private Medico mediConsul;
    private Paciente paciConsul;
    private Exame exame;
    private Receita receita;

    //recepcionista é uma associação
    //medico e paciente são uma agregação
    public void marcar(Recepcionista recepcionista, Paciente paciente, Medico medico){
        this.mediConsul = medico;
        this.paciConsul = paciente;
    }

    public void cancelar(){

    }

    public void consultar(Receita receita){
        this.receita = receita;
    }

    public void realizar(Exame exame){
        this.exame = exame;
        //agregação
    }

    public void atualizar(){

    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
}

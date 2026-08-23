public class Consulta {

    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;
    private String motivo;

    public Consulta() {
    }

    public Consulta(String data, String hora, Medico medico, Paciente paciente, String motivo) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
        this.motivo = motivo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void marcar(){

    }

    public void cancelar(){
    }

    public void consultar(){
    }

    public void realizar(){
    }

    public void atualizar(){
    }

    public void mostrar(){
        System.out.println("Data: "+data);
        System.out.println("Hora: "+hora);
        System.out.println("Medico: "+medico);
        System.out.println("Paciente: "+paciente);
        System.out.println("Motivo: "+motivo);
    }

}

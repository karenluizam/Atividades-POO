public class Consulta {

    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;
    private String motivo;

    public Consulta() {
    }

    public Consulta(String data, String hora, Medico medico, Paciente paciente, String motivo) throws Exception{
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
        setMotivo(motivo);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception {
        if(data.isEmpty() || data.isBlank()) {
            throw new Exception("A data e obrigatoria!");
        }
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

    public void setMedico(Medico medico) throws Exception {
        if(paciente == null) {
            throw new Exception("O nome do Medico e obrigatorio!");
        }
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

public class Agenda {

    public String data;
    public Medico medico;
    public Paciente paciente;
    public String hora;

    public Agenda() {
    }

    public Agenda(String data, Medico medico, Paciente paciente, String hora) {
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
        this.hora = hora;
    }

    public void consultar(){

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void mostrar(){
        System.out.println("Data: "+data);
        System.out.println("Hora: "+hora);
        System.out.println("Medico: "+medico);
        System.out.println("Paciente: "+paciente);
    }
}

public class Agenda {

    private String data;
    private Medico medico;
    private Paciente paciente;
    private String hora;

    public Agenda() {
    }

    public Agenda(String data, Medico medico, Paciente paciente, String hora) throws Exception{
        setData(data);
        setMedico(medico);
        setPaciente(paciente);
        setHora(hora);
    }

    public void consultar(){

    }

    public String getData()  {
        return data;
    }

    public void setData(String data) throws Exception {
        if(data.isEmpty() || data.isBlank()) {
            throw new Exception("A data e obrigatoria!");
        }

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

    public void setPaciente(Paciente paciente) throws Exception{
        if(paciente == null) {
            throw new Exception("O nome do Paciente e obrigatorio!");
        }

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

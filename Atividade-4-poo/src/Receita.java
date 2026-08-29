public class Receita {
    private Consulta consulta;
    private String data;
    private String descritivo;

    public Receita() {
    }

    public Receita(Consulta consulta, String data, String descritivo) throws Exception{
        setConsulta(consulta);
        setData(data);
        setDescritivo(descritivo);
    }

    public void preescrever(){

    }
    public void consultar(){
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) throws Exception {
        if(consulta == null){
            throw new Exception("Consulta Obrigatória!!");
        }

        this.consulta = consulta;
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

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public void mostrar(){
        System.out.println("Consulta: "+consulta);
        System.out.println("Data: "+data);
        System.out.println("Descritivo: "+descritivo);
    }

}

public static void main(String[] args){

    //OBJETO PACIENTE
    Paciente jose = new Paciente();
    jose.nome = "Jose da Silva";
    jose.cpf = "839.039.485-03";
    jose.genero = 'M';
    jose.idade = 7;
    jose.telefone = "(11) 92736-0293";
    jose.mostrar();
    System.out.println("=======================");
    System.out.println(" ");

    //OBJETO MEDICO
    Medico angelica = new Medico();
    angelica.nome = "Angelica Braga";
    angelica.crm = "83938272-3/BR";
    angelica.especialidade = "Pediatria";
    angelica.telefone = "92832-7543";
    angelica.senha = "kdsLkds87";
    angelica.mostrar();
    System.out.println("=======================");
    System.out.println(" ");

    //OBJETO RECEPCIONISTA
    Recepcionista cinthia = new Recepcionista();
    cinthia.nome = "Cinthia Moraes";
    cinthia.cpf = "364.234.454-96";
    cinthia.telefone = "(11) 93724-9485";
    cinthia.senha = "sDcnsdn87";
    cinthia.mostrar();
    System.out.println("=======================");
    System.out.println(" ");

    //OBJETO CONSULTA
    Consulta consulta01 = new Consulta();
    consulta01.data = "01/09/2026";
    consulta01.hora = "17h00";
    consulta01.medico = "Angelica Braga";
    consulta01.paciente = "Jose da Silva";
    consulta01.motivo = "Dor abdominal";
    consulta01.mostrar();
    System.out.println("=======================");
    System.out.println(" ");

    //OBJETO EXAME
    Exame exame01 = new Exame();
    exame01.consulta = "Pediatria";
    exame01.data = "30/09/2026";
    exame01.descritivo = "Exame endoscópico";
    exame01.mostrar();
    System.out.println("=======================");
    System.out.println(" ");

    //OBJETO AGENDA
    Agenda agenda = new Agenda();
    agenda.data = "01/09/2026";
    agenda.hora = "17h00";
    agenda.medico = "Angelica Braga";
    agenda.paciente = "Jose da Silva";
    agenda.mostrar();
    System.out.println("=======================");
    System.out.println(" ");

    //OBJETO RECEITA
    Receita receita01 = new Receita();
    receita01.consulta = "Pediatria";
    receita01.data = "30/09/2026";
    receita01.descritivo = "Exame endoscópico";
    receita01.mostrar();
    System.out.println("=======================");

}

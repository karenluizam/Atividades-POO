/******************************************************************************

 1-Quais as principais caracteristicas do java
 que são vantagens em detrimento de outra tecnologias?

 O Java é independente de plataforma e hardware.
 Ele tem portabilidade para vários tipos de sistema, diferente de outras linguagens.

 -------

 2-O que e JVM e qual a sua correlação com o bytecode?
 JVM é a Máquina Virtual do Java. Ela não compila em executável,
 compila em uma linguagem intermediária, o bytecode.


 *******************************************************************************/


public static void main(String[] args){

    //OBJETO PACIENTE
    Paciente pac1 = new Paciente();
    pac1.setNome("Jose da Silva");
    pac1.setCpf("839.039.485-03");
    pac1.setGenero('M');
    pac1.setIdade(7);
    pac1.setTelefone("(11) 92736-0293");
    pac1.mostrar();
    System.out.println("=======================\n\n");

    //OBJETO MEDICO
    Medico med1 = new Medico();
    med1.setNome("Angelica Braga");
    med1.setCrm("83938272-3/BR");
    med1.setEspecialidade("Pediatria");
    med1.setTelefone("92832-7543");
    med1.setSenha("kdsLkds87");
    med1.mostrar();
    System.out.println("=======================");

    //OBJETO RECEPCIONISTA
    Recepcionista rec1 = new Recepcionista();
    rec1.setNome("Cinthia Moraes");
    rec1.setCpf("364.234.454-96");
    rec1.setTelefone("(11) 93724-9485");
    rec1.setSenha("sDcnsdn87");
    rec1.mostrar();
    System.out.println("=======================\n\n");

    //OBJETO CONSULTA
    Consulta consulta01 = new Consulta();
    consulta01.setData("01/09/2026");
    consulta01.setHora("17h00");
    consulta01.setMedico(med1);
    consulta01.setPaciente(pac1);
    consulta01.setMotivo("Dor abdominal");
    consulta01.mostrar();
    System.out.println("=======================\n\n");

    //OBJETO EXAME
    Exame exame01 = new Exame();
    exame01.setConsulta(consulta01);
    exame01.setData("30/09/2026");
    exame01.setDescritivo("Exame endoscópico");
    exame01.mostrar();
    System.out.println("=======================\n\n");

    //OBJETO AGENDA
    Agenda agenda1 = new Agenda();
    agenda1.setData("01/09/2026");
    agenda1.setHora("17h00");
    agenda1.setMedico(med1);
    agenda1.setPaciente(pac1);
    agenda1.mostrar();
    System.out.println("=======================\n\n");

    //OBJETO RECEITA
    Receita receita01 = new Receita();
    receita01.setConsulta(consulta01);
    receita01.setData("30/09/2026");
    receita01.setDescritivo("Exame endoscópico");
    receita01.mostrar();
    System.out.println("=======================");
}

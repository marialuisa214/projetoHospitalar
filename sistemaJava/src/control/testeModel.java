package control;

import model.*;

public class testeModel {
  public static void main(String[] args){
    
    //Paciente paciente = neW Paciente(String nome, String rg, String cpf, char sexo, String dataNascimento, String telefone, String email, String cidade, String endereco, String patologia)
    Paciente paciente = new Paciente("Elaine Venson","3.890.657","004.625.879-00",'F',"25/03/1996","3478-2158","elainevenson@gmail.com","Brasília-DF","Bairro do Limoeiro","Nenhuma");
    Paciente paciente1 = new Paciente("Rejane Maria da Costa Figueiredo","3.782.487","047.150.304-01",'F',"27/02/1996","3578-2218","rejanefigueiredo@gmail.com","Brasília-DF","Bairro do Maracujá","Nenhuma");
    Paciente paciente2 = new Paciente("Luiz Carlos Miyadaira Ribeiro","3.602.987","045.250.520-01",'M',"05/07/1997","3547-2547","luizmiyadaira@gmail.com","Brasília-DF","Bairro do Mangueiral","Nenhuma");
    Paciente paciente3 = new Paciente("Pedro Vitor Augusto de Jesus","5.727.924","046.257.459-02",'M',"27/09/2002","3482-2547","pedrojesus@gmail.com","Gama","Quadra 45","Intolerância a lactose");
    Paciente paciente4 = new Paciente("Lucas Ramon Alves de Oliveira","7.583.977","047.358.569-01",'M',"05/01/2001","3759-2518","lucasalves@gmail.com","Valparaíso-GO","Avenida das Cachoeiras","Dermatite");
    Paciente paciente5 = new Paciente("Mateus Fernando Alves de Oliveira","3.352.677","047.345.569-02",'M',"05/01/2001","3759-2518","mateusalves@gmail.com","Valparaíso-GO","Avenida das Cachoeiras","Ansiedade");
    Paciente paciente6 = new Paciente("Bruno Seiji Kishibe","3.875.246","048.759.149-04",'F',"12/10/2001","3549-7890","brunokhishibe@gmail.com","Águas Claras","Avenida das Castanheiras","Asma");
    Paciente paciente7 = new Paciente("Maurício Marcos Costa de Souza","3.759.249","045.579.329-01",'M',"15/02/1995","3578-1897","mauriciosouza@gmail.com","Park Sul","Quadra 05","Alergia a Camarão");
    Paciente paciente8 = new Paciente("Ramon Castro dos Santos","3.359.789","046.157.347-02",'M',"10/02/2000","3567-3818","ramonsantos@gmail.com","Guará 2","Quadra 30","Rinite");
    Paciente paciente9 = new Paciente("Caio César Ribeiro","3.467.977","046.784.321-03",'M',"10/07/2006","3387-1249","caioribeiro@gmail.com","Taguatinga Norte","QNL 2","Diabetes tipo 1");
    Paciente paciente10 = new Paciente("Beatriz Soares da Silva","3.774.957","049.220.789-05",'F',"24/08/2010","3597-249","beatrizsilva@gmail.com","Guará 1","QI 7","Pressão alta");
    Paciente paciente11 = new Paciente("Gabriella Monteiro do Nscimento","3.268.791","049.497.471-03",'F',"01/12/1997","3798-4569","gabriellanascimento@gmail.com","Arniqueiras","Condomínio Vista Nobre","Rinite");
    Paciente paciente12 = new Paciente("Ana Luísa da Silva","3.249.700","045.123.321-05",'F',"10/11/2000","3577-1249","analuisasilva@gmail.com","Núcleo Bandeirante","Avenida Central","Nenhuma");
    Paciente paciente13 = new Paciente("Ana Júlia da Silva","3.489.746","047.357.467-04",'F',"10/09/2009","3577-1249","anajuliasilva@gmail.com","Núcleo Bandeirante","Avenida Central","Nenhuma");
    Paciente paciente14 = new Paciente("Vanessa Araújo","3.359.759","048.249.467-03",'F',"10/07/2006","3387-1249","vanessaaraujo@gmail.com","Taguatinga Norte","QNL 7","Sinusite");
    Paciente paciente15 = new Paciente("Phillippi Augusto da Silva","3.794.987","044.746.367-00",'M',"29/05/2000","3979-3259","phillippisilva@gmail.com","Taguatinga Sul","QSD 2","Pressão baixa");
    Paciente paciente16 = new Paciente("Fernando da Silva Júnior","3.497.746","043.349.137-00",'M',"15/04/1998","3792-3597","fernandojunior@gmail.com","Taguatinga Centro","Quadra C 11","Anemia falciforme");
    Paciente paciente17 = new Paciente("Clarisse Manuella de Oliveira Costa","3.789.704","047.644.951-01",'F',"07/07/2007","3497-3579","clarissecosta@gmail.com","Taguatinga Norte","QNL 2","Síndrome de Down");
    Paciente paciente18 = new Paciente("Maria Fernanda Ribeiro de Oliveira","3.579.426","044.574.654-03",'F',"08/09/1999","3367-1579","mariafernandaoliveira@gmail.com","Taguatinga Norte","QNL 2","Diabetes tipo 2");
    Paciente paciente19 = new Paciente("Mariana de Oliveira Gonçalves","3.759.789","041.774.606-03",'F',"07/04/2005","3388-9961","marianagonçalves@gmail.com","Taguatinga Norte","QNL 2","Fibrose cística");
    
    Atendente atendente = new Atendente("luana", "1234", 'F', "10/12/2001","luana123", "123");
    Medico medico = new Medico("carlos", "333", 'M', "06/04/1991", "2121", "malu", "ginicologista");
    Marcada consulta = new Marcada("sdfg","16:00", "16:22");


    Agenda agenda = new Agenda();
    agenda.setMedico(medico);
    agenda.setHorarioInicio("12/02/2023 14:30");
    agenda.setHorarioInicio("13/02/2023 3:00");



    // ArrayList<Consulta> listaConsultaTeste = new ArrayList<>();
    // listaConsultaTeste.add(consulta);

    // System.out.println(listaConsultaTeste.get(0).getCodigo());

    atendente.agendaConsulta(agenda, paciente, consulta);
    // System.out.println(agenda.getListaConsultas().get(0).getCodigo());

    System.out.println(paciente.getIdade());

    
    
  }
}

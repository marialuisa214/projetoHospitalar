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
    
    //Atendente atendente = new Atendente(String nome, String rg, String cpf, char sexo, String dataNascimento, String telefone, String email, String cidade, String endereco, String usuario, String senha)
    Atendente atendente = new Atendente("Lorrane Lorena de Oliveira Ribeiro", "3.567.324","047.657.459.00",'F',"10/11/1995","(61)99185-7674", "lorraneLOribeiro@gmail.com","Gama","Quadra 12","lorrane" ,"1011");
    Atendente atendente1 = new Atendente("Laryssa Brito Tavares", "3.559.123","048.657.154.00",'F',"17/08/1997","(61)98759-7245", "laryssaBTavares@gmail.com","Guará 1","Quadra 7","laryssa" ,"1708");
    Atendente atendente2 = new Atendente("Beatriz Moreira do Nascimento", "3.466.324","047.032.477.01",'F',"08/11/1995","(61)97592-7677", "beatrizMNascimento@gmail.com","Gama","Quadra 07","beatriz" ,"0811");
    Atendente atendente3 = new Atendente("Emanuel Augusto dos Anjos", "3.570.897","047.765.657.02",'M',"10/11/1995","(61)99745-7678", "emanuelAAnjos@gmail.com","Guará 2","Quadra 15","emanuel" ,"1011");
    Atendente atendente4 = new Atendente("Jorge Evangelista Santana", "3.597.367","047.432.957.00",'M',"05/09/1992","(61)98745-3567", "jorgeESantana@gmail.com","Valparaíso-GO","Avenida das Castanheiras","ljorge" ,"0509");

    //Medico medico = new Medico(String nome, String rg, String cpf, char sexo, String dataNascimento, String telefone, String email, String cidade, String endereco, String usuario, String senha, String crm, String especialidade)
    Medico medico = new Medico("Maria Luisa Alves","3.579.321", "047.321.499-00", 'F', "10/12/2001", "(61)98745-3216", "maria_luisa_rodrigues@gmail.com", "Park Way", "Quadra 1", "malu", "1012", "DF101201","Clíco Geral");
    Medico medico1 = new Medico("Gabriela Silva Alves","3.789.123", "045.552.489-01", 'F', "27/11/2001", "(61)98677-3574", "gabriela_alves@gmail.com", "Riacho Fundo 2", "Quadra 7", "gabi", "2711", "DF271101","Clíco Geral");
    Medico medico2 = new Medico("Marina Márcia Costa de Souza","3.354.659", "047.189.498-01", 'F', "13/11/2000", "(61)99567-1918", "marina_souza@gmail.com", "Guará 2", "Quadra 28", "mari", "1311", "DF131100","Clíco Geral");
    Medico medico3 = new Medico("Júlia Stefanie Santos Mendonça","3.326.759", "046.332.579-02", 'F', "05/08/2000", "(61)98381-5974", "julia_mendonca@gmail.com", "Riacho Fundo 1", "Quadra 6", "juli", "0508", "DF050800","Pedriátra");
    Medico medico4 = new Medico("Marcos Aurélio Araújo","3.469.332", "048.155.467-00", 'M', "10/02/1995", "(61)99661-3554", "marcos_araujo@gmail.com", "Park Way", "Gama 3", "marc", "1002", "DF100295","Pediátra");
    Medico medico5 = new Medico("Maria Catarina Miranda Barcelos","3.023.123", "045.552.489-01", 'F', "27/08/1998", "(61)99569-3257", "maria_catarina_barcelos@gmail.com", "Gama", "Quadra 7", "mari", "2708", "DF271898","Cardiologista");
    Medico medico6 = new Medico("Gabriel Sucupira de Oliveira","3.708.367", "048.367.489-02", 'M', "26/09/1999", "(61)98845-2376", "gabriel_oliveira@gmail.com", "Park Way", "Quadra 7", "gabr", "2609", "DF260999","Geriatria");
    Medico medico7 = new Medico("Rafael dos Santos Nascimento","3.788.897", "049.572.400-01", 'M', "22/10/1994", "(61)98569-1374", "rafael_nascimento@gmail.com", "Guará 2", "Quadra 17", "rafa", "2210", "DF221094","Pneumologista");
    Medico medico8 = new Medico("Pedro Henrique de Sousa Silva","3.770.321", "050.232.489-01", 'M', "26/11/1992", "(61)98778-3234", "pedro_silva@gmail.com", "Guará 2", "Quadra 21", "pedr", "2611", "DF261192","Dermatologista");
    Medico medico9 = new Medico("Augusto de Souza Pereira","3.776.123", "045.567.499-00", 'M', "06/03/1990", "(61)99597-3211", "augusto_pereira@gmail.com", "Guará 1", "Quadra 7", "augu", "20603", "DF060300","Mastologista");
      
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

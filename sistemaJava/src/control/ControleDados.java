package control;

import model.*;
import view.TransicaoMetodosAtendente;

public class ControleDados {
  public static void main(String[] args){
    ControlePaciente pacientes = new ControlePaciente();
    TransicaoMetodosAtendente telaInicial = new TransicaoMetodosAtendente(pacientes); telaInicial.setVisible(true);


    //PACIENTES
    Paciente paciente = new Paciente("Maria Alves Correa", "3.620.107", "760.454.203-30", 'F', "10/10/2001", "4002-8922", "mariamaria@gmail.com", "Brasilia-DF", "Bairro do Limoeiro, 203", "Alérgica a camarão");

    Paciente paciente1 = new Paciente("Gabriela Alves Martins", "3.234.100", "760.333.205-66", 'F', "27/11/2002", "3321-8181", "Brasilia-DF", "Bairro do Maracujá, 702", "Bairro do Maracujá, 702", "Alérgica a sabão");

    Paciente paciente2 = new Paciente("Marina Márcia Nakagomi", "2.555.100", "345.322.555-09", 'F', "04/02/2000", "3321-8181", "MarinaLula2023@gmail.com", "Bairro do Maracujá, 702", "Bairro da Goiaba, 222", "Intolerante a Lactose");

    Paciente paciente3 = new Paciente("Júlia Felipe Santos", "5.000.234", "234.789.898-22", 'F', "09/11/2000", "0101-0202", "Julia@gmail.com", "Bairro do Maracujá, 702", "Bairro da Goiaba, 222", "Intolerante a Lactose");


    //ATENDENTES
    Atendente atendente = new Atendente("Julio Mendonça", "7.234.234", "909.865.202-77", 'M', "10/12/2001","6074-2342", "Julio@gmail.com", "Brasília-DF", "Rua da Banana, 305", "4334", "325@201");

    Atendente atendente1 = new Atendente("Michael Jackson Alves", "2.244.555", "890.345.657-02", 'M', "10/08/1990","7865-2356", "MichaelAlves@gmail.com", "Brasília-DF", "Rua da Acerola, 308", "5443", "342@207");
    

    //MEDICOS
    Medico medico = new Medico("Yasmin Sebastiana da Luz", "12.432.934-2", "923.451.331-20", 'F', "09/01/1996", "(61) 99971-3942", "yasmin_sebastiana_daluz@eberlin.agr.br", "Brasília-DF", "Quadra Quadra 1 Comércio Local 7", "6775", "547@111", "000222", "Ginecologista");

    Medico medico1 = new Medico("Oliver Paulo da Paz", "12.432.934-2", "335.573.791-75", 'M', "24/01/1996", "(61) 98232-5528", "oliver_paulo_dapaz@vol.com.br", "Brasília-DF", "Quadra CNB 3", "7689", "567@198","777444", "Clínico Geral");

    Medico medico2 = new Medico("Cláudio Caio Carvalho", "12.476.152-5", "928.773.491-79", 'M', "25/01/1996", "(61) 98232-5528", "claudio_caio_carvalho@bassanpeixoto.adv.br", "Brasília-DF", "Quadra 103 Conjunto 2", "5674", "501@109","555333", "Clínico Geral");


    //ENFERMEIROS
    Enfermeiro enfermeiro = new Enfermeiro("Milena Jaqueline Galvão", "49.657.617-3", "865.167.181-48", 'F', "08/01/1994", "(61) 98484-8540", "milena_galvao@utbr.com.br", "Brasília-DF", "Rua Deodato Louly", "5566", "349@376", "777555");

    Enfermeiro enfermeiro1 = new Enfermeiro("Osvaldo Alexandre Baptista", "21.209.406-3", "635.055.521-00", 'M', "04/01/1994", "(61) 98156-5943", "osvaldo-baptista80@openlink.com.br", "Brasília-DF", "Quadra CLS 404 Bloco A", "5544", "129@491", "333666");


    //ENTRADAS
    Entrada entrada = new Entrada("Estável", paciente3);
    
    Entrada entrada1 = new Entrada("Estável", paciente2);
    

    //TRIAGENS
    Triagem triagem = new Triagem("Garganta inflamada", "verde", entrada);
    
    Triagem triagem1 = new Triagem("Fratura exposta", "Vermelha", entrada1);


    //CONSULTAS MARCADAS
    Consulta consulta = new Marcada("4444", paciente, medico);

    Consulta consulta1 = new Marcada("3333", paciente, medico1);

    Consulta consulta2 = new Marcada("5555", paciente2, medico2);


    //CONSULTAS DE EMERGENCIA
    Consulta emergencia = new Emergencia("3434", paciente3, medico2, "01", triagem);

    Consulta emergencia1 = new Emergencia("6565", paciente2, medico1, "02", triagem1);

    //EXAMES
    Exame exame = new Exame("Raio-x", "111", enfermeiro);

    Exame exame1 = new Exame("Colonoscopia", "222", enfermeiro1);

    Exame exame2 = new Exame("Exame de sangue", "333", enfermeiro1);

    Exame exame3 = new Exame("Exame de sangue", "444", enfermeiro);


    //PRONTUARIOS
    paciente.getProntuario().getHistoricoConsultas().add(consulta);
    paciente.getProntuario().getHistoricoConsultas().add(consulta1);
    paciente.getProntuario().getHistoricoConsultas().add(emergencia);
    paciente.getProntuario().getHistoricoExame().add(exame3);
    paciente1.getProntuario().getHistoricoConsultas().add(consulta2);
    paciente1.getProntuario().getHistoricoExame().add(exame);
    paciente1.getProntuario().getHistoricoConsultas().add(emergencia1);
    paciente2.getProntuario().getHistoricoExame().add(exame2);
    paciente3.getProntuario().getHistoricoExame().add(exame1);


    //MEDICAMENTOS
    Medicamento medicamento = new Medicamento("Cloridrato de Sertralina", "001", "Geolab");

    Medicamento medicamento1 = new Medicamento("Hemitartarato de Zolpidem", "002", "Pfarma");

    Medicamento medicamento2 = new Medicamento("Paracetamol", "003", "Globo");

    Medicamento medicamento3 = new Medicamento("Neosaldina", "004", "Hypera Pharma");

    Medicamento medicamento4 = new Medicamento("Doril", "005", "Cosmed");

    Medicamento medicamento5 = new Medicamento("Lacto-Purga", "006", "Hypera Pharma");

    Medicamento medicamento6 = new Medicamento("Ivermectina", "007", "Vitamedic");

    Medicamento medicamento7 = new Medicamento("Buscopan", "008", "Hypera Pharma");

    Medicamento medicamento8 = new Medicamento("Neo Soro", "009", "Neo Química");

    Medicamento medicamento9 = new Medicamento("Torsilax", "010", "Neo Química");

    Medicamento medicamento10 = new Medicamento("Poslov", "011", "Levonorgestrel");


    //RECEITAS
    Receita receita = new Receita();
    // receita.setDataPedido();
    // receita.setDataEntrega();
    receita.setUnidade("30 comprimidos");
    receita.setDescricaoMed("Para depressão e coisas para baixo");
    receita.getMedicamentos().add(medicamento);
    receita.setPosologia("Sertralina de 8 em 8 horas");
    receita.setAssinatura(medico.getNome());

    Receita receita1 = new Receita();
    // receita.setDataPedido();
    // receita.setDataEntrega();
    receita1.setUnidade("20 comprimidos");
    receita1.setDescricaoMed("Para insônia. Deitar imediatamente após ingerir o medicamento.");
    receita1.getMedicamentos().add(medicamento1);
    receita1.setPosologia("Uma comprimido toda noite.");
    receita1.setAssinatura(medico1.getNome());

    Receita receita2 = new Receita();
     // receita.setDataPedido();
    // receita.setDataEntrega();
    receita2.setUnidade("20 comprimidos");
    receita2.setDescricaoMed("Sempre que necessário.");
    receita2.getMedicamentos().add(medicamento2);
    receita2.getMedicamentos().add(medicamento3);
    receita2.getMedicamentos().add(medicamento4);
    receita2.setPosologia("8 em 8 horas.");
    receita2.setAssinatura(medico1.getNome());

    Receita receita3 = new Receita();
     // receita.setDataPedido();
    // receita.setDataEntrega();
    receita3.setUnidade("15 comprimidos");
    receita3.setDescricaoMed("Sempre que necessário.");
    receita3.getMedicamentos().add(medicamento5);
    receita3.getMedicamentos().add(medicamento6);
    receita3.getMedicamentos().add(medicamento7);
    receita3.setPosologia("8 em 8 horas.");
    receita3.setAssinatura(medico1.getNome());

    Receita receita4 = new Receita();
     // receita.setDataPedido();
    // receita.setDataEntrega();
    receita4.setUnidade("15 comprimidos de cada medicamento");
    receita4.setDescricaoMed("Sempre que necessário.");
    receita4.getMedicamentos().add(medicamento8);
    receita4.getMedicamentos().add(medicamento9);
    receita4.setPosologia("12 em 12 horas.");
    receita4.setAssinatura(medico2.getNome());

    Receita receita5 = new Receita();
     // receita.setDataPedido();
    // receita.setDataEntrega();
    receita5.setUnidade("1 comprimido");
    receita5.setDescricaoMed("...");
    receita5.getMedicamentos().add(medicamento10);;
    receita5.setPosologia("Dose única.");
    receita5.setAssinatura(medico2.getNome());
    
    // Marcada consulta = new Marcada("sdfg","16:00", "16:22");

    // Agenda agenda = new Agenda();
    // agenda.setMedico(medico);
    // agenda.setHorarioInicio("12/02/2023 14:30");
    // agenda.setHorarioInicio("13/02/2023 3:00");

    // // ArrayList<Consulta> listaConsultaTeste = new ArrayList<>();
    // // listaConsultaTeste.add(consulta);

    // // System.out.println(listaConsultaTeste.get(0).getCodigo());

    // atendente.agendaConsulta(agenda, paciente, consulta);
    // // System.out.println(agenda.getListaConsultas().get(0).getCodigo());

    // System.out.println(paciente.getIdade());

  }
}

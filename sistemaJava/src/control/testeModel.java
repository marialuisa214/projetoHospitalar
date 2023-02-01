package control;

import java.text.SimpleDateFormat;
import java.util.Date;

import model.*;
import view.*;

public class testeModel {
  public static void main(String[] args){
   

    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    Date c = new Date();
    System.out.println(formatador.format(c));
    
    // //PACIENTES
     Paciente paciente = new Paciente("Maria Alves Correa", "3.620.107", "760.454.203-30", 'F', "10/10/2001", "4002-8922", "mariamaria@gmail.com", "Brasilia-DF", "Bairro do Limoeiro, 203", "Alérgica a camarão");

    Paciente paciente1 = new Paciente("Gabriela Alves Martins", "3.234.100", "760.333.205-66", 'F', "27/11/2002", "3321-8181", "Brasilia-DF", "Bairro do Maracujá, 702", "Bairro do Maracujá, 702", "Alérgica a sabão");

    Paciente paciente2 = new Paciente("Marina Márcia Nakagomi", "2.555.100", "345.322.555-09", 'F', "04/02/2000", "3321-8181", "MarinaLula2023@gmail.com", "Bairro do Maracujá, 702", "Bairro da Goiaba, 222", "Intolerante a Lactose");

    Paciente paciente3 = new Paciente("Júlia Felipe Santos", "5.000.234", "234.789.898-22", 'F', "09/11/2000", "0101-0202", "Julia@gmail.com", "Bairro do Maracujá, 702", "Bairro da Goiaba, 222", "Intolerante a Lactose");
    

    // //MEDICOS
     Medico medico = new Medico("Yasmin Sebastiana da Luz", "12.432.934-2", "923.451.331-20", 'F', "09/01/1996", "(61) 99971-3942", "yasmin_sebastiana_daluz@eberlin.agr.br", "Brasília-DF", "Quadra Quadra 1 Comércio Local 7", "6775", "1212", "000222", "Ginecologista");

     Medico medico1 = new Medico("Oliver Paulo da Paz", "12.432.934-2", "335.573.791-75", 'M', "24/01/1996", "(61) 98232-5528", "oliver_paulo_dapaz@vol.com.br", "Brasília-DF", "Quadra CNB 3", "7689", "567@198","777444", "Clínico Geral");

     Medico medico2 = new Medico("Cláudio Caio Carvalho", "12.476.152-5", "928.773.491-79", 'M', "25/01/1996", "(61) 98232-5528", "claudio_caio_carvalho@bassanpeixoto.adv.br", "Brasília-DF", "Quadra 103 Conjunto 2", "5674", "501@109","555333", "Clínico Geral");

    // //CONSULTAS MARCADAS
     Marcada consulta = new Marcada("4444", paciente, medico);

     Marcada consulta1 = new Marcada("3333", paciente, medico);

     Marcada consulta2 = new Marcada("5555", paciente, medico);


    

    //ENFERMEIROS
    Enfermeiro enfermeiro = new Enfermeiro("Milena Jaqueline Galvão", "49.657.617-3", "865.167.181-48", 'F', "08/01/1994", "(61) 98484-8540", "milena_galvao@utbr.com.br", "Brasília-DF", "Rua Deodato Louly", "5566", "1313", "777555");

    Enfermeiro enfermeiro1 = new Enfermeiro("Osvaldo Alexandre Baptista", "21.209.406-3", "635.055.521-00", 'M', "04/01/1994", "(61) 98156-5943", "osvaldo-baptista80@openlink.com.br", "Brasília-DF", "Quadra CLS 404 Bloco A", "5544", "129@491", "333666");

    //EXAMES
    Exame exame = new Exame("Raio-x", "111", paciente1);

    Exame exame1 = new Exame("Colonoscopia", "222", paciente1);

    Exame exame2 = new Exame("Exame de sangue", "333", paciente2);

    Exame exame3 = new Exame("Exame de sangue", "444", paciente);

    //PRONTUARIOS
    paciente.getProntuario().getHistoricoConsultasMarcadas().add(consulta);
    paciente.getProntuario().getHistoricoConsultasMarcadas().add(consulta1);
    paciente.getProntuario().getHistoricoExame().add(exame3);
    paciente1.getProntuario().getHistoricoConsultasMarcadas().add(consulta2);
    paciente.getProntuario().getHistoricoExame().add(exame);
    paciente.getProntuario().getHistoricoExame().add(exame1);
    paciente.getProntuario().getHistoricoExame().add(exame2);


    //ENTRADAS
    Entrada entrada = new Entrada("Estável", paciente3);
    
    Entrada entrada1 = new Entrada("Estável", paciente2);
    

    //TRIAGENS
    Triagem triagem = new Triagem( entrada, enfermeiro);
    
    Triagem triagem1 = new Triagem( entrada1, enfermeiro);



    enfermeiro.getListaTriagem().add(triagem1);
    enfermeiro.getListaTriagem().add(triagem);



    enfermeiro.getListaExame().add(exame3);
    enfermeiro.getListaExame().add(exame1);
    enfermeiro.getListaExame().add(exame);



     medico.getListConsultasPendentes().add(consulta);
     medico.getListConsultasPendentes().add(consulta2);
     medico.getListConsultasPendentes().add(consulta1);

    

    ControleDados banco = new ControleDados();
    banco.adicionaMedico(medico);
    banco.adicionaMedico(medico1);
    banco.adicionaMedico(medico2);

    banco.getaBancoEntradas().add(entrada);
    banco.getaBancoEntradas().add(entrada1);

    banco.bancoEnfermeiros.add(enfermeiro1);
    banco.bancoEnfermeiros.add(enfermeiro);

  
    new TelaLogin(banco).setVisible(true);
    // paciente.getProntuario().getHistoricoConsultasMarcadas().size();

    // // System.out.println(enfermeiro.getListaTriagem().get(0).getEntrada().getDataEntrada());


   
  }
}

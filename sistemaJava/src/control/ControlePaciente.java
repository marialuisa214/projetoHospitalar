package control;
import java.util.*;
import model.Paciente;

//Administrando Pacientes

public class ControlePaciente {
  //ATENDENTE
    //PACIENTES
      private ArrayList<Paciente> listaPacientes = new ArrayList<>();

    //METODOS
      public ControlePaciente() {
        this.listaPacientes = new ArrayList<>();
      }
      
      public ArrayList<Paciente> listaPacientes(){
        return this.listaPacientes;
      }
      
      public void cadastraPaciente(String nome, String rg, String cpf, char sexo,String dataNascimento, String telefone, String email, String cidade, String endereco, String patologia) {
        Paciente paciente = new Paciente(nome, rg, cpf, sexo, dataNascimento, telefone, email, cidade, endereco, patologia);
        this.listaPacientes.add(paciente);
      }

      public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
      }
    
      public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
      }

      public String[] listaNomePacientes(){
        int qtdPacientes = this.getListaPacientes().size();
        String[] nomesPacientes = new String[qtdPacientes];

        for (int i=0; i<qtdPacientes; i++){
          String nome = this.getListaPacientes().get(i).getNome();

          nomesPacientes[i] = nome;
        }

        return nomesPacientes;
      } 

  }
  
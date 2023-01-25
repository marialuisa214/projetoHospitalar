package view;


import javax.swing.table.AbstractTableModel;
import control.*;
import model.*;

public class TabelaMedico extends AbstractTableModel {

    private ControleDados dados;
    private String[] colunas =  {"Dia", "Horário", "Paciente", "Código" }; 


//CONSTRUTOR
    public TabelaMedico(ControleDados dados){
        this.dados = dados;  
    }

    public String getColumnName(int coluna){
        return colunas[coluna];

    }

    @Override
//    quantidade de linhas
    public int getRowCount() {
        return dados.getBancoConsultaMarcadas().size();
    
    }

    @Override
//    quantidade de colunas
    public int getColumnCount() { 
        return colunas.length;
    }

    @Override
//    seleciona os valores da tabela
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return dados.getBancoConsultaMarcadas().get(linha).getDia();
            case 1:
                return dados.getBancoConsultaMarcadas().get(linha).getHorarioInicio();
            case 2:
                return dados.getBancoConsultaMarcadas().get(linha).getPaciente().getNome();
            case 3:
                return dados.getBancoConsultaMarcadas().get(linha).getCodigo();
        }

        return null;
    }

    public void addRow(Marcada cm){
        this.dados.adicionaConsulta(cm);;
        this.fireTableDataChanged();
    }
    
    public Marcada selecionaItem(int linha){
        return this.dados.getBancoConsultaMarcadas().get(linha);
    }

}

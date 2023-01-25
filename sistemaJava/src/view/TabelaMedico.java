package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import control.*;
import model.*;

public class TabelaMedico extends AbstractTableModel {

    private List<Marcada> dados = new ArrayList<Marcada>();
    private String[] colunas =  {"Dia", "Horário", "Paciente", "Código" }; 

    public String getColumnName(int coluna){
        return colunas[coluna];

    }

    @Override
//    quantidade de linhas
    public int getRowCount() {
        return dados.size();
    
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
                return dados.get(linha).getDia();
            case 1:
                return dados.get(linha).getHorarioInicio();
            case 2:
                return dados.get(linha).getPaciente().getNome();
            case 3:
                return dados.get(linha).getCodigo();
        }

        return null;
    }
    
}

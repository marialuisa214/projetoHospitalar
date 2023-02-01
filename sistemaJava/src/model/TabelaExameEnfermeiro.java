package model;

import javax.swing.table.AbstractTableModel;

public class TabelaExameEnfermeiro extends AbstractTableModel {
    private Enfermeiro enfermeiro;
    private String[] colunas =  { "Data",  "Paciente", "Tipo de Exame" };


    //CONSTRUTOR
    public TabelaExameEnfermeiro(Enfermeiro enfermeiro){
        this.enfermeiro = enfermeiro;
    }


    public String getColumnName(int coluna){
        return colunas[coluna];
    }
    @Override
//    quantidade de linhas
    public int getRowCount() {
        return enfermeiro.getListaExame().size();
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
                return enfermeiro.getListaExame().get(linha).getCodigo();
            case 1:
                return enfermeiro.getListaExame().get(linha).getNomeExame();
        }

        return null;
    }

    public void addRow(Exame exame){
        this.enfermeiro.getListaExame().add(exame);
        this.fireTableDataChanged();
    }
    
    public Exame selecionaItem(int linha){
        return this.enfermeiro.getListaExame().get(linha);
    }
}

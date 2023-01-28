package model;

import javax.swing.table.AbstractTableModel;


public class TabelaTriagem extends AbstractTableModel {
    private Enfermeiro enfermeiro;
    private String[] colunas =  { "Horario de Entrada",  "Paciente", "Situação" };


    //CONSTRUTOR
    public TabelaTriagem(Enfermeiro enfermeiro){
        this.enfermeiro = enfermeiro;
    }


    public String getColumnName(int coluna){
        return colunas[coluna];
    }

    @Override
//    quantidade de linhas
    public int getRowCount() {
        return enfermeiro.getListaTriagem().size();
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
                return enfermeiro.getListaTriagem().get(linha).getEntrada().getDataEntrada();
            case 1:
                return enfermeiro.getListaTriagem().get(linha).getEntrada().getPacienteVinculado().getNome();
            case 2:
                return enfermeiro.getListaTriagem().get(linha).getEntrada().getSituacaoPaciente();
        }

        return null;
    }

    public void addRow(Triagem cm){
        this.enfermeiro.getListaTriagem().add(cm);
        this.fireTableDataChanged();
    }
    
    public Triagem selecionaItem(int linha){
        return this.enfermeiro.getListaTriagem().get(linha);
    }
}
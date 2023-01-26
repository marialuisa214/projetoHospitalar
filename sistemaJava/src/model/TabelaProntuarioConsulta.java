package model;

import javax.swing.table.AbstractTableModel;

public class TabelaProntuarioConsulta extends AbstractTableModel {
    
    private Prontuario prontuario;
    private String[] colunas = {"DATA", "CÓDIGO", "DESCRIÇÃO"};

//CONSTRUTOR
    public TabelaProntuarioConsulta(Prontuario p ){
        this.prontuario = p;

    }

    @Override
    public int getColumnCount() {
            return prontuario.getHistoricoConsultasMarcadas().size();
    }
    
    public String getColumnName(int coluna){
        return colunas[coluna];
    }

    @Override
    public int getRowCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return prontuario.getHistoricoConsultasMarcadas().get(linha).getDia();
            case 1:
                return prontuario.getHistoricoConsultasMarcadas().get(linha).getCodigo();
            case 2:
                return prontuario.getHistoricoConsultasMarcadas().get(linha).getDescricaoMedica();
        }

        return null;
    }

    public void addRow(Marcada cm){
        this.prontuario.getHistoricoConsultasMarcadas().add(cm);;
        this.fireTableDataChanged();
    }
    
    public Marcada selecionaItem(int linha){
        return this.prontuario.getHistoricoConsultasMarcadas().get(linha);
    }
}

package view.utils;

/**
 * Clase <code>TableModel</code> que crea una tabla para visualizar las
 * reservas del usuario.
 * 
 * @author Adrián Calvo Rojo
 * @author Sergio García Prado
 */

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Reserva;

public class TableModel extends AbstractTableModel {
    
    private static final String FECHA_ENTRADA = "Fecha de Entrada";
    private static final String FECHA_SALIDA = "Fecha de Salida"; 
    private static final String TIPO_ALOJAMIENTO = "Tipo de Alojamiento"; 
    private static final String TIPO_HABITACION = "Tipo de Habitación"; 
    private static final String NUM_PLAZAS = "Nº Plazas"; 

    private static final String[] columnNames = {
        FECHA_ENTRADA
        ,FECHA_SALIDA
        ,TIPO_ALOJAMIENTO
        ,TIPO_HABITACION
        ,NUM_PLAZAS
    };
    
    private Object[][] data;
    
    /**
     * Constructor de la clase <code>TableModel</code> 
     * @param listaReservas 
     */
    public TableModel(ArrayList<Reserva> listaReservas){
        super();
        data = new Object[listaReservas.size()][4];
        for(int i = 0; i < listaReservas.size(); i++){
            data[i] = listaReservas.get(i).toArray();
        }
    }

    /**
     * Devuelve numero de columnas.
     * @return 
     */
    public int getColumnCount() {
        return columnNames.length;
    }

    /**
     * Devuelve el numero de filas.
     * @return 
     */
    public int getRowCount() {
        return data.length;
    }

    /**
     * Devuelve el nombre de la columna.
     * @param col
     * @return 
     */
    public String getColumnName(int col) {
        return columnNames[col];
    }

    /**
     * Devuelve el objeto en una posicion [fila][columna]
     * @param row
     * @param col
     * @return 
     */
    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    /**
     * Devuelve la clase de una columna dada.
     * @param c
     * @return 
     */
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    /**
     * Establece un valor en una posicion determinada.
     * @param value
     * @param row
     * @param col 
     */
    public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }
}

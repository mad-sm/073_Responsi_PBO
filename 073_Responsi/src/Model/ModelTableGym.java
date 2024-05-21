/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab Informatika
 */
public class ModelTableGym extends AbstractTableModel{
    List<ModelGym>daftarGym;
    String kolom[] = {"Nama","Alat","Nomor","Waktu","Biaya"};
    public ModelTableGym(List<ModelGym>daftarGym){
        this.daftarGym=daftarGym;
    }
    @Override
    public int getRowCount(){
        return daftarGym.size();
    }
    @Override
    public int getColumnCount(){
        return kolom.length;
    }
    @Override
    public Object getValueAt(int rowIndex,int columnIndex){
        switch(columnIndex){
            case 0:
                return daftarGym.get(rowIndex).getNama();
            case 1:
                return daftarGym.get(rowIndex).getAlat();
            case 2:
                return daftarGym.get(rowIndex).getNomor();
            case 3:
                return daftarGym.get(rowIndex).getWaktu();
            case 4:
                return daftarGym.get(rowIndex).getBiaya();
            default :
                return null;
        }
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return kolom[columnIndex];
    }
    public void removeRow(int selectedRow){
        daftarGym.remove(selectedRow);
        fireTableRowsDeleted(selectedRow, selectedRow);
    }
}

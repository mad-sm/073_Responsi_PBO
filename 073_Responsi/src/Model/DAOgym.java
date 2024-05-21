/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import connector.connect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Lab Informatika
 */
public class DAOgym implements interfaceDAOgym{
    
    @Override
    public void insert(ModelGym gym){
    try{
        String query = "INSERT INTO bullking(nama,alat,nomor,waktu,biaya) VALUES(?,?,?,?,?);";
        ModelGym dm = new ModelGym();
        PreparedStatement statement;
        statement = connect.connection().prepareStatement(query);
        statement.setString(1,gym.getNama);
        statement.setString(2,gym.getAlat);
        statement.setString(3,gym.getNomor);
        statement.setInt(4,gym.getWaktu);
        statement.setDouble(5,gym.getBiaya);
        statement.executeUpdate();
        statement.close();
    }catch(SQLException e){
        System.out.println("Input Failed" + e.getLocalizedMessage());
    }
    }
   @Override
    public void update(ModelGym gym){
    try{
        String query = "UPDATE bullking SET nama=?, alata=?, nomor=?, waktu=?, biaya=? WHERE id=?;";
        PreparedStatement statement;
        statement = connect.connection().prepareStatement(query);
        statement.setString(1,gym.getNama);
        statement.setString(2,gym.getAlat);
        statement.setString(3,gym.getNomor);
        statement.setInt(4,gym.getWaktu);
        statement.setDouble(5,gym.getBiaya);
        statement.executeUpdate();
        statement.close();
    }catch(SQLException e){
        System.out.println("Input Failed(" + e.getMessage()+")");
    }
    }
    
    @Override
    public void delete(int id){
    try{
        String query = "DELETE bullking FROM bullking WHERE id=?;";
        PreparedStatement statement;
        statement = connect.connection().prepareStatement(query);
        statement.setInt(1,id);
        statement.executeUpdate();
        statement.close();
    }catch(SQLException e){
    System.out.println("Delete Failed :" + e.getLocalizedMessage());
    }
    }
    
    @Override
    public List<ModelGym>getAll(){
    List<ModelGym>listGym=null;
    try{listGym = new ArrayList<>();
        Statement statement = connect.connection().createStatement();
        String query = "SELECT * FROM bullking;";
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            ModelGym hew = new ModelGym();
            //hew.setId(resultSet.getInt("id"));
            hew.setNama(resultSet.getString("nama"));
            hew.setAlat(resultSet.getString("alat"));
            hew.setNomor(resultSet.getString("nomor"));
            hew.setWaktu(resultSet.getInt("waktu"));
            hew.setBiaya(resultSet.getDouble("biaya"));
            listGym.add(hew);
        }
        statement.close();
    }catch(SQLException e){
        System.out.println("Error :" + e.getLocalizedMessage());
    }return listGym;
    }

    @Override
    public boolean hapusData(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author Lab Informatika
 */
public interface interfaceDAOgym {
    public void insert(ModelGym gym);
    public void update(ModelGym gym);
    public void delete(int id);
    public List<ModelGym>getAll();
    public boolean hapusData(String id);
}

package org.example.repository;

import org.example.repository.entity.Calisan;
import org.example.utility.ConnectionProvider;

import java.sql.PreparedStatement;

public class CalisanRepository implements ICrud<Calisan>{
    private String sql="";
    private ConnectionProvider connectionProvider;
    private PreparedStatement preparedStatement;
    public CalisanRepository() {
        this.connectionProvider=new ConnectionProvider();
    }

    @Override
    public void save(Calisan calisan) {
        sql="INSERT INTO calisan(isim,soyisim) VALUES(?,?)";
        try{
            preparedStatement=connectionProvider.getPreparedStatement(sql);
            preparedStatement.setString(1,calisan.getIsim());
            preparedStatement.setString(2,calisan.getSoyisim());
            preparedStatement.executeUpdate();
            connectionProvider.closeConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

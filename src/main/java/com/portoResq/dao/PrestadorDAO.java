package com.portoResq.dao;

import com.portoResq.model.Prestador;
import com.portoResq.database.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PrestadorDAO {

    public List<Prestador> getPrestadores() {
        List<Prestador> prestadores = new ArrayList<>();
        String sql = "SELECT * FROM PRESTADOR";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Prestador prestador = new Prestador();
                // Preenchimento do objeto prestador com dados do ResultSet
                prestadores.add(prestador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prestadores;
    }

    // Métodos para CREATE, UPDATE, DELETE...
}

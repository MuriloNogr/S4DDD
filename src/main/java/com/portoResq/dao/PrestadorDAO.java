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
                Prestador prestador = new Prestador(sql, sql, sql, sql);
                prestadores.add(prestador);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prestadores;
    }

    public void addPrestador(Prestador prestador) {
        String sql = "INSERT INTO PRESTADOR (email, senha, modeloGuincho, nome) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, prestador.getEmail());
            stmt.setString(2, prestador.getSenha());
            stmt.setString(3, prestador.getModeloGuincho());
            stmt.setString(4, prestador.getNome());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePrestador(int id, Prestador prestador) {
        String sql = "UPDATE PRESTADOR SET email = ?, senha = ?, modeloGuincho = ?, nome = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, prestador.getEmail());
            stmt.setString(2, prestador.getSenha());
            stmt.setString(3, prestador.getModeloGuincho());
            stmt.setString(4, prestador.getNome());
            stmt.setInt(5, id);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePrestador(int id) {
        String sql = "DELETE FROM PRESTADOR WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

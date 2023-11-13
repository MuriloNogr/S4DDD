package com.portoResq.service;

import com.portoResq.dao.PrestadorDAO;
import com.portoResq.model.Prestador;
import java.util.List;

public class PrestadorService {

    private PrestadorDAO dao = new PrestadorDAO();

    public List<Prestador> getPrestadores() {
        // Aqui podem ser adicionadas validações antes de chamar o DAO
        return dao.getPrestadores();
    }

    public void addPrestador(Prestador prestador) {
        // Validações, se necessário, e chama DAO
        dao.addPrestador(prestador);
    }

    public void updatePrestador(int id, Prestador prestador) {
        // Validações e chama DAO
        dao.updatePrestador(id, prestador);
    }

    public void deletePrestador(int id) {
        // Validações e chama DAO
        dao.deletePrestador(id);
    }
}

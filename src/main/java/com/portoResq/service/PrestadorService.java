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

    // Outros métodos para CREATE, UPDATE, DELETE...
}

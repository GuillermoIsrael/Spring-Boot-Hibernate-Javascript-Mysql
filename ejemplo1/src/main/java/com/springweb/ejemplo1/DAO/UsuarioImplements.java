package com.springweb.ejemplo1.DAO;

import com.springweb.ejemplo1.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UsuarioImplements implements UsuarioDAO{

    private EntityManager  entityManager;

    @Override
    @Transactional
    public list<Usuario> getUsuario() {
        return null;
    }
}

package com.springweb.ejemplo1.controllers;

import com.springweb.ejemplo1.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(){
        Usuario usuario = new Usuario();
        usuario.setId(12L);
            usuario.setNombre("Guillermo");
            usuario.setApellido("Riva");
            usuario.setEmail("guillerivadeneira7@gmail.com");
            usuario.setTelefono("42774257");
            usuario.setPassword("riquelme");

        return usuario;

    }


    @RequestMapping(value = "usuarios")
    public Usuario getUsuario(@PathVariable long id){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(85);
        usuario.setNombre("Gustavo");
        usuario.setApellido("Roman");
        usuario.setEmail("cristianGustiavo7@gmail.com");
        usuario.setTelefono("42774257");
        usuario.setPassword("gustavooo");

        Usuario usuario2 = new Usuario();
        usuario2.setId(96L);
        usuario2.setNombre("Israel");
        usuario2.setApellido("Molina");
        usuario2.setEmail("molinaisrtael7@gmail.com");
        usuario2.setTelefono("42774257");
        usuario2.setPassword("molina1");

        Usuario usuario3 = new Usuario();
        usuario3.setId(36L);
        usuario3.setNombre("hugo");
        usuario3.setApellido("Rivadero");
        usuario3.setEmail("rivaderohugo7@gmail.com");
        usuario3.setTelefono("42774257");
        usuario3.setPassword("rivadero12");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuario;

    }
    @RequestMapping(value = "usuario/12")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Guillermo");
        usuario.setApellido("Riva");
        usuario.setEmail("guillerivadeneira7@gmail.com");
        usuario.setTelefono("42774257");
        usuario.setPassword("riquelme");

        return usuario;

    }
    @RequestMapping(value = "usuario/123")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Guillermo");
        usuario.setApellido("Riva");
        usuario.setEmail("guillerivadeneira7@gmail.com");
        usuario.setTelefono("42774257");
        usuario.setPassword("riquelme");

        return usuario;

    }
    @RequestMapping(value = "usuario/1235")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Guillermo");
        usuario.setApellido("Riva");
        usuario.setEmail("guillerivadeneira7@gmail.com");
        usuario.setTelefono("42774257");
        usuario.setPassword("riquelme");

        return usuario;

    }
}

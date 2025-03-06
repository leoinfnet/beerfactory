package br.com.acme.beerfact.service.impl;


import br.com.acme.beerfact.model.Role;
import br.com.acme.beerfact.model.Usuario;
import br.com.acme.beerfact.repository.UsuarioRepository;
import br.com.acme.beerfact.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    @Override
    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario update(Long id, Usuario atualizada) {
        atualizada.setId(id);
        return usuarioRepository.save(atualizada);
    }

    @Override
    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public List<Usuario> findAllUsuariosAtivos() {
        return null;
    }

    @Override
    public List<Usuario> findAllByRoles(List<Role> roles) {
        return null;
    }

    @Override
    public Optional<Usuario> findByEmail(String email) {
        return Optional.empty();

    }

    @Override
    public Boolean hasRole(Usuario usuario, String role) {
        return null;
    }
}

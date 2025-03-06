package br.com.acme.beerfact.service;



import br.com.acme.beerfact.model.Role;
import br.com.acme.beerfact.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    void save(Usuario usuario);
    List<Usuario> findAll();
    Optional<Usuario> findById(Long id);
    Usuario update(Long id, Usuario atualizada);
    void deleteById(Long id);
    List<Usuario> findAllUsuariosAtivos();
    List<Usuario> findAllByRoles(List<Role> roles);

    Optional<Usuario> findByEmail(String email);
    Boolean hasRole(Usuario usuario,String role);
}

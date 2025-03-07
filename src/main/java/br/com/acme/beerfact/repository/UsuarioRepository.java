package br.com.acme.beerfact.repository;


import br.com.acme.beerfact.model.Role;
import br.com.acme.beerfact.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    //Nao eh SQL => JPQL
    @Query("SELECT u from Usuario u WHERE u.status = 1")
    List<Usuario> findAllAtivos();
    @Query("SELECT u from Usuario u where u.email=?1 OR u.nome=?2")
    List<Usuario> findAllBy(String email,String nome);
    @Query("SELECT u from Usuario u where u.email=:email OR u.nome=:nome")
    List<Usuario> findAllByNamedParameter(@Param("nome") String nome, @Param("email") String email);
    @Query("SELECT u from Usuario u where u.status in :roles")
    List<Usuario> findAllByStatusIn(@Param("roles") List<Integer> statusList);
    @Query("SELECT u from Usuario u inner join  u.roles roles where roles in :roles")
    List<Usuario> findAllByRole(@Param("roles") List<Role> roles);
}

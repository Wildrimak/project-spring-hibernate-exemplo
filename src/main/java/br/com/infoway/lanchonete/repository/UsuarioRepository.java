package br.com.infoway.lanchonete.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.infoway.lanchonete.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}

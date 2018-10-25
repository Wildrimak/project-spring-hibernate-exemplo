package br.com.infoway.lanchonete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infoway.lanchonete.model.Usuario;
import br.com.infoway.lanchonete.repository.UsuarioRepository;

@RestController
@RequestMapping("/")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public Usuario index() {
		Usuario u = new Usuario();
		u.setNome("Jardiel sousa");
		
		this.repository.save(u);
		
		return u;
	}
	
}

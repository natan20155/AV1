package fvs.edu.br.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fvs.edu.br.domain.Pessoa;
import fvs.edu.br.repositories.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repositorio;
	
	public Pessoa buscar(Integer id) {
		Optional<Pessoa> pessoa = repositorio.findById(id);
		return pessoa.orElse(null);
	}
	
	
}

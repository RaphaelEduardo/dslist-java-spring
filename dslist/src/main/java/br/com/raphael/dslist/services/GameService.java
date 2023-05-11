package br.com.raphael.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.raphael.dslist.dto.GameDTO;
import br.com.raphael.dslist.dto.GameMinDTO;
import br.com.raphael.dslist.entities.Game;
import br.com.raphael.dslist.projections.GameMinProjection;
import br.com.raphael.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	//Anotação do Spring
	@Transactional(readOnly = true) //só leitura, sem escrita
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get(); // o retorno é Optional, logo se usa .get() para poder pegar o dado.
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		/*
		 *  Transforma uma lista de games em uma lista de GameDTO;
		 *  stream(): faz operações com sequencias de dados;
		 *  map(): transforma objetos (usando a expressão lambda);
		 *  toList(): converte para lista novamente;
		 */
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	
	
}

package br.com.raphael.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.raphael.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

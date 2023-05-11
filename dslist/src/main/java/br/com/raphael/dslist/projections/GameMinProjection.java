package br.com.raphael.dslist.projections;

public interface GameMinProjection {

	// Metodos GET correspondentes a consulta feita no GameRepository

	Long getId();
	String getTitle();
	Integer getGameYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
	
}

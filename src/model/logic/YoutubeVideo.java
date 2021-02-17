package model.data_structures;

import java.sql.Date;

/**
 * @author miguelmontes
 *
 */
/**
 * @author miguelmontes
 *
 */
public class YoutubeVideo implements Comparable <YoutubeVideo>
{
	/**
	 * Identificador del video
	 */
	private String id;
	
	/**
	 * Fecha en el que el video se volvio destacado
	 */
	private Date trendingDate;
	
	/**
	 * Titulo del video
	 */
	private String titulo;
	
	/**
	 * Titulo del canal 
	 */
	private String tituloCanal;
	
	/**
	 * Categoria  del video
	 */
	private int categoriaId;
	
	/**
	 * Fecha de publicacion del video
	 */
	private Date publishingTime;
	
	/**
	 * Arraylist que contiene los tags del video
	 */
	private ArregloDinamico tags;

	/**
	 * Numero de views del video
	 */
	private int numeroViews;
	
	/**
	 * Numero de likes del video
	 */
	private int numeroLikes;

	/**
	 * Numero de deilikes del video
	 */
	private int numeroDislikes;

	
	public YoutubeVideo(String Identificador, Date fechaTrending, String tit, String titCan, int Catego, Date publi, ArregloDinamico ttt, int numeroV ,int numeroL, int numeroD)
	{
		id = Identificador;
		trendingDate = fechaTrending;
		titulo = tit;
		tituloCanal = titCan; 
		categoriaId = Catego;
		publishingTime = publi;
		tags = ttt;
		numeroViews = numeroV;
		numeroLikes = numeroL;
		numeroDislikes = numeroD;
	  	
	}
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Date getTrendingDate() {
		return trendingDate;
	}


	public void setTrendingDate(Date trendingDate) {
		this.trendingDate = trendingDate;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getTituloCanal() {
		return tituloCanal;
	}


	public void setTituloCanal(String tituloCanal) {
		this.tituloCanal = tituloCanal;
	}


	public int getCategoriaId() {
		return categoriaId;
	}


	public void setCategoriaId(int categoriaId) {
		this.categoriaId = categoriaId;
	}


	public Date getPublishingTime() {
		return publishingTime;
	}


	public void setPublishingTime(Date publishingTime) {
		this.publishingTime = publishingTime;
	}


	public ArregloDinamico getTags() {
		return tags;
	}


	public void setTags(ArregloDinamico tags) {
		this.tags = tags;
	}


	public int getNumeroViews() {
		return numeroViews;
	}


	public void setNumeroViews(int numeroViews) {
		this.numeroViews = numeroViews;
	}


	public int getNumeroLikes() {
		return numeroLikes;
	}


	public void setNumeroLikes(int numeroLikes) {
		this.numeroLikes = numeroLikes;
	}


	public int getNumeroDislikes() {
		return numeroDislikes;
	}


	public void setNumeroDislikes(int numeroDislikes) {
		this.numeroDislikes = numeroDislikes;
	}

	
	/**
	 * 
	 */
	// Se compara en la fecha qque fue tendencia
	@Override
	public int compareTo(YoutubeVideo o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}

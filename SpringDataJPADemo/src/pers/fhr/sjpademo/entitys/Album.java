package pers.fhr.sjpademo.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Album")
public class Album implements Serializable{
	
	private static final long serialVersionUID = -8242831550240660383L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer albumId;
	
	@Column(name="ArtistId",nullable=false)
	private Integer artistId;
	
	@Column(name="GenreId",nullable=false)
	private Integer genreId;
	
	@Column(name="Title",nullable=false)
	private String title;
	
	@Column(name="Price",nullable=false)
	private Double price;
	
	@Column(name="AlbumArtUrl",nullable=true)
	private String albumArtUrl;
   
	public Album(){
		super();
	}
	
	public Album(Integer albumId, Integer artistId, Integer genreId, String title, Double price, String albumArtUrl) {
		super();
		this.albumId = albumId;
		this.artistId = artistId;
		this.genreId = genreId;
		this.title = title;
		this.price = price;
		this.albumArtUrl = albumArtUrl;
	}
	
}

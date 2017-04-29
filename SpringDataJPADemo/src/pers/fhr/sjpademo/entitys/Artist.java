package pers.fhr.sjpademo.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Artist")
public class Artist implements Serializable{
	
	private static final long serialVersionUID = 8242831550240660363L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Integer artistId;
	
	@Column(name="Name",nullable=true)
	private String name;

	public Integer getArtistId() {
		return artistId;
	}

	public void setArtistId(Integer artistId) {
		this.artistId = artistId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Artist(){
		super();
	}
	
	public Artist(Integer artistId, String name) {
		super();
		this.artistId = artistId;
		this.name = name;
	}
	
}

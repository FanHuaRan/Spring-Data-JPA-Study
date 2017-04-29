package pers.fhr.sjpademo.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Genre")
public class Genre implements Serializable {
	
	private static final long serialVersionUID = 9003107513694487764L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer genreId;
	
	@Column(name="Name",nullable=true)
	private String name;
	
	@Column(name="Description",nullable=true)
	private String description;

	public Integer getGenreId() {
		return genreId;
	}

	public void setGenreId(Integer genreId) {
		this.genreId = genreId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Genre(){
		super();
	}
	
	public Genre(Integer genreId, String name, String description) {
		super();
		this.genreId = genreId;
		this.name = name;
		this.description = description;
	}
}

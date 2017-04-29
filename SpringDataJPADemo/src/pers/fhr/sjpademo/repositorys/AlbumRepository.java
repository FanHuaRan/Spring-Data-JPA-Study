package pers.fhr.sjpademo.repositorys;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import pers.fhr.sjpademo.entitys.Album;

public interface AlbumRepository extends PagingAndSortingRepository<Album,Integer>{
	List<Album> findByGenreId(Integer genreId);
	
	List<Album> findByArtistIdAndTitle(Integer artistId,String title);
	
}

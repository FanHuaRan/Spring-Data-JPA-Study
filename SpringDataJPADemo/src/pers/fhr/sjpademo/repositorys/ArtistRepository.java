package pers.fhr.sjpademo.repositorys;

import org.springframework.data.repository.PagingAndSortingRepository;

import pers.fhr.sjpademo.entitys.Artist;

public interface ArtistRepository extends PagingAndSortingRepository<Artist, Integer> {

}

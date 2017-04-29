package pers.fhr.sjpademo.repositorys;

import org.springframework.data.repository.PagingAndSortingRepository;

import pers.fhr.sjpademo.entitys.Album;

public interface AlbumRepository extends PagingAndSortingRepository<Album,Integer>{

}

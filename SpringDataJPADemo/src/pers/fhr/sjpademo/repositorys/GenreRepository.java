package pers.fhr.sjpademo.repositorys;

import org.springframework.data.repository.PagingAndSortingRepository;

import pers.fhr.sjpademo.entitys.Genre;

public interface GenreRepository extends PagingAndSortingRepository <Genre,Integer> {

}

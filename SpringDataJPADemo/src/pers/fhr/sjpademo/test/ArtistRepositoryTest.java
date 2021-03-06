package pers.fhr.sjpademo.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pers.fhr.sjpademo.entitys.Album;
import pers.fhr.sjpademo.entitys.Artist;
import pers.fhr.sjpademo.entitys.Genre;
import pers.fhr.sjpademo.repositorys.AlbumRepository;
import pers.fhr.sjpademo.repositorys.ArtistRepository;
import pers.fhr.sjpademo.repositorys.GenreRepository;

@RunWith(SpringJUnit4ClassRunner.class)    
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"}) 
public class ArtistRepositoryTest {
	
	@Autowired
	private ArtistRepository artistRepository=null;
	
	@Test
	public void testFindAll() {
		Iterable<Artist> artists=artistRepository.findAll();
		assertNotNull(artists);
	}
	@Test
	public void testFindOne(){
		Artist artist=artistRepository.findOne(1);
		assertNotNull(artist);
	}

}

package pers.fhr.sjpademo.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pers.fhr.sjpademo.entitys.Album;
import pers.fhr.sjpademo.repositorys.AlbumRepository;

@RunWith(SpringJUnit4ClassRunner.class)    
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"}) 
public class ArtistRepositoryTest {
	
	@Autowired
	private AlbumRepository albumRepository=null;
	
	@Test
	public void testFindAll() {
		Iterable<Album> albums=albumRepository.findAll();
		assertNotNull(albums);
	}

}

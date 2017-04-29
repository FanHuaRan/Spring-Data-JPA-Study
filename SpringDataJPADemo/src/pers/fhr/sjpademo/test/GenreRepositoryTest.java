package pers.fhr.sjpademo.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pers.fhr.sjpademo.entitys.Genre;
import pers.fhr.sjpademo.repositorys.GenreRepository;

@RunWith(SpringJUnit4ClassRunner.class)    
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"}) 
public class GenreRepositoryTest {
	
	@Autowired
	private GenreRepository genreRepository=null;
	
	@Test
	public void testFindAll() {
		Iterable<Genre> genres=genreRepository.findAll();
		assertNotNull(genres);
	}
	@Test
	public void testFindOne(){
		Genre genre=genreRepository.findOne(1);
		assertNotNull(genre);
	}
    public void testSave(){
    	
    }
}

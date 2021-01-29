package bueno.andre.springboot2.service;

import bueno.andre.springboot2.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

    //private final AnimeRepository animeRepository;
    public List<Anime> listAll(){
        return List.of(new Anime(1L,"DB2"), new Anime(2L,"Berseke"));
    }
}

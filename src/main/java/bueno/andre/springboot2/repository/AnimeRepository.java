package bueno.andre.springboot2.repository;

import bueno.andre.springboot2.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}

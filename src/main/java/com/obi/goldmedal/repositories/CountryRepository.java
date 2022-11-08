package com.obi.goldmedal.repositories;
import org.springframework.data.repository.CrudRepository;
import com.obi.goldmedal.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryRepository extends CrudRepository<Country, Long> {
    List<Country> getAllByOrderByNameAsc();
    List<Country> getAllByOrderByNameDesc();
    List<Country> getAllByOrderByGdpAsc();
    List<Country> getAllByOrderByGdpDesc();
    List<Country> getAllByOrderByPopulationAsc();
    List<Country> getAllByOrderByPopulationDesc();
    Optional<Country> getByName(String name);
    
}

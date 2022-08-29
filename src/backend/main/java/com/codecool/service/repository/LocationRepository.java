package com.codecool.service.repository;

import com.codecool.model.infopage.Location;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_NULL)

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

    @Query(value = "SELECT l FROM Location l " +
            "WHERE l.continent.name LIKE :continentName")
    Collection<Location> findAllByContinentName(@Param("continentName") String continentName);

    @Query(value = "SELECT l FROM Location l WHERE l.name LIKE ?1")
    Optional<Location> findByName(String locationName);
}

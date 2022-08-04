package com.codecool.service.repository;

import com.codecool.model.infopage.location.Location;
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
            "LEFT JOIN l.continent c " +
            "WHERE c.name LIKE ?1")
    Collection<Location> findAllByContinentName(String continentName);

    @Query(value = "SELECT l FROM Location l WHERE l.name LIKE ?1")
    Optional<Location> findByName(String locationName);
}

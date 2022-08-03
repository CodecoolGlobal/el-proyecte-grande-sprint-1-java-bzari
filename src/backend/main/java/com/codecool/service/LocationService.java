package com.codecool.service;

import com.codecool.model.DTO.MapDTO;
import com.codecool.model.infopage.location.Location;
import com.codecool.service.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public Collection<MapDTO> getLocationsByContinentName(String continentName) {
        Collection<Location> loc = locationRepository.findAllByContinentName(continentName);
        Collection<MapDTO> mapDTOS = new ArrayList<>();
        for (Location location : loc) {
            mapDTOS.add(new MapDTO(location.getName(), location.getId()));
        }
        return mapDTOS;
    }

    public Optional<Location> getLocationById(Long locationId) {
        return locationRepository.findById(locationId);
    }

    public Optional<Location> getLocationByName(String locationName) {
        return locationRepository.findByName(locationName);
    }
}

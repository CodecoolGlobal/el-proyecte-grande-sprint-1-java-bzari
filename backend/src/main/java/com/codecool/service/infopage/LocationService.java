package com.codecool.service.infopage;

import com.codecool.model.DTO.MapDTO;
import com.codecool.model.infopage.Location;
import com.codecool.service.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Service
public class LocationService {
    private LocationRepository locationRepository;

    @Autowired
    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Collection<MapDTO> getLocationsByContinentName(String continentName) {
        Collection<Location> loc = locationRepository.findAllByContinentName(continentName);
        return getMapDTOS(loc);
    }

    public Optional<Location> getLocationById(Long locationId) {
        return locationRepository.findById(locationId);
    }

    public Optional<Location> getLocationByName(String locationName) {
        return locationRepository.findByName(locationName);
    }

    public Collection<MapDTO> getAllLocations() {
        Collection<Location> locations = locationRepository.findAll();
        return getMapDTOS(locations);
    }

    private Collection<MapDTO> getMapDTOS(Collection<Location> loc) {
        Collection<MapDTO> mapDTOS = new ArrayList<>();
        for (Location location : loc) {
            mapDTOS.add(new MapDTO(location.getName(), location.getId(), location.getContinent().getId(), location.getAltitude(), location.getLongitude()));
        }
        return mapDTOS;
    }
}

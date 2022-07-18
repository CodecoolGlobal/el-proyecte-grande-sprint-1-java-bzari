package com.codecool.service;

import com.codecool.service.locations.LocationCreator;
import com.codecool.service.locations.LocationStorage;
import com.codecool.service.locations.wildlife.WildLifeCreator;
import com.codecool.service.locations.wildlife.WildLifeStorage;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class Config {
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public ContinentStorage getContinentStorage(){return new ContinentStorage(getContinentCreator());}
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean
    public LocationStorage getLocationStorage(){return new LocationStorage(getLocationCreator());}
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean
    public WildLifeStorage getWildLifeStorage(){return new WildLifeStorage(getWildLifeCreator());}
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean
    public ContinentCreator getContinentCreator(){return new ContinentCreator();}
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean
    public LocationCreator getLocationCreator(){return new LocationCreator(getWildLifeStorage());}
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean
    public WildLifeCreator getWildLifeCreator(){return new WildLifeCreator();}

}

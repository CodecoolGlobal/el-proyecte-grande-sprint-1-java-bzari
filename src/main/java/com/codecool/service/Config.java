package com.codecool.service;

import com.codecool.service.dao.*;
import com.codecool.service.implementation.continents.ContinentCreatorMem;
import com.codecool.service.implementation.continents.ContinentStorageMem;
import com.codecool.service.implementation.continents.locations.LocationCreatorMem;
import com.codecool.service.implementation.continents.locations.LocationStorageMem;
import com.codecool.service.implementation.continents.locations.wildlife.WildLifeCreatorMem;
import com.codecool.service.implementation.continents.locations.wildlife.WildLifeStorageMem;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;


@Configuration
public class Config {
//    @Bean
//    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//    public ContinentStorageDao getContinentStorage(){return new ContinentStorageMem(getContinentCreator());}
//
//    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//    @Bean
//    public LocationStorageDao getLocationStorage(){return new LocationStorageMem(getLocationCreator());}
//
//    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//    @Bean
//    public WildLifeStorageDao getWildLifeStorage(){return new WildLifeStorageMem(getWildLifeCreator());}
//
//    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//    @Bean
//    public ContinentCreatorDao getContinentCreator(){return new ContinentCreatorMem();}
//
//    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//    @Bean
//    public LocationCreatorDao getLocationCreator(){return new LocationCreatorMem(getWildLifeStorage());}
//
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean
    public WildLifeCreatorDao getWildLifeCreator(){return new WildLifeCreatorMem();}



}

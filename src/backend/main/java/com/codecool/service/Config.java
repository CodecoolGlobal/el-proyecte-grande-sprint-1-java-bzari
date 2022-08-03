package com.codecool.service;

import com.codecool.service.dao.*;
import com.codecool.service.implementation.continents.locations.wildlife.WildLifeCreatorMem;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
//    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//    @Bean
//    public WildLifeCreator getWildLifeCreator(){return new WildLifeCreator();}
//    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//    @Bean
//    public WildLifeStorage getWildLifeStorage(){return new WildLifeStorage(getWildLifeCreator());}
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean
    public WildLifeCreatorDao getWildLifeCreator(){return new WildLifeCreatorMem();}


//    public LocationCreator getLocationCreator(){return new LocationCreator(getWildLifeStorage());}
//    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//    @Bean
//    public LocationStorage getLocationStorage(){return new LocationStorage(getLocationCreator());}
//    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//    @Bean
//    public ContinentCreator getContinentCreator(){return new ContinentCreator();}
//    @Bean
//    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
//    public ContinentStorage getContinentStorage(){return new ContinentStorage(getContinentCreator());}



}

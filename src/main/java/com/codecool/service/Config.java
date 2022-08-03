package com.codecool.service;

import com.codecool.service.repositories.*;
import com.codecool.service.implementation.continents.locations.wildlife.WildLifeCreatorMem;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class Config {

    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean
    public WildLifeCreatorDao getWildLifeCreator(){return new WildLifeCreatorMem();}
}

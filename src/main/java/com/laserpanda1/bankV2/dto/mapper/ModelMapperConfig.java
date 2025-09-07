package com.laserpanda1.bankV2.dto.mapper;

import org.hibernate.proxy.HibernateProxy;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.getConfiguration()
                .setSkipNullEnabled(true)
                .setPropertyCondition(context->
                        !(context.getSource() instanceof HibernateProxy));

        return modelMapper;

    }
}

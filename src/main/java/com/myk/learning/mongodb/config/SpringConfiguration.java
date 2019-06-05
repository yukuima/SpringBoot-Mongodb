package com.myk.learning.mongodb.config;

import com.myk.learning.mongodb.service.OperationService;
import com.myk.learning.mongodb.service.impl.OperationServiceImpl;
import com.myk.learning.mongodb.support.DefaultMongoDbImpl;
import com.myk.learning.mongodb.support.MongoDbDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring configuration
 * <p/>
 * Created in 2018.11.08
 * <p/>
 *
 * @author myk
 */
@Configuration
public class SpringConfiguration {
    /**
     * Mongo db dao mongo db dao.
     *
     * @return the mongo db dao
     */
    @Bean
    public MongoDbDao mongoDbDao() {
        return new DefaultMongoDbImpl();
    }

    @Bean
    public OperationService operationService() {
        return new OperationServiceImpl();
    }
}

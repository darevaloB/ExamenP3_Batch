/*
 * Copyright (c) 2021 Diana.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Diana - initial API and implementation and/or initial documentation
 */
package ec.edu.espe.distribuidas.examen.examenbatch.config;

import ec.edu.espe.distribuidas.examen.examenbatch.tasks.ConsolidacionEfectivo;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 *
 * @author Diana
 */
@Configuration
@EnableAutoConfiguration
@EnableBatchProcessing
public class JobConfig {
    
    @Autowired
    private JobBuilderFactory jobs;

    @Autowired
    private StepBuilderFactory steps;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private ApplicationValues applicationValues;
    

    
    @Bean
    protected Step consolidacionEfectivo() {
        return steps
                .get("consolidacionEfectivo")
                .tasklet(new ConsolidacionEfectivo(this.applicationValues, this.mongoTemplate))
                .build();
    }
    
    @Bean
    public Job consolidarEfectivo() {
        return jobs
                .get("consolidarEfectivo")
                .start(consolidacionEfectivo())
                .build();
    }
    
}

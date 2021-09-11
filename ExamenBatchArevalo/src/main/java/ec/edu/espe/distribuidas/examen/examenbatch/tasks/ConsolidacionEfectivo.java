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
package ec.edu.espe.distribuidas.examen.examenbatch.tasks;

import ec.edu.espe.distribuidas.examen.examenbatch.config.ApplicationValues;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.scheduling.annotation.Scheduled;

/**
 *
 * @author Diana
 */
public class ConsolidacionEfectivo implements Tasklet, StepExecutionListener {

    private final ApplicationValues applicationValues;
    private final MongoTemplate mongoTemplate;
    private ExecutionContext jobContext;

    public ConsolidacionEfectivo(ApplicationValues applicationValues, MongoTemplate mongoTemplate) {
        this.applicationValues = applicationValues;
        this.mongoTemplate = mongoTemplate;
    }
    

    @Override
    @Scheduled(fixedDelay = 900000)
    public void beforeStep(StepExecution arg0) {
      
    }

    
    
    
    @Override
    public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
       
        
        
        
        
        
        
        return RepeatStatus.FINISHED;
    }

    
    
    @Override
    public ExitStatus afterStep(StepExecution arg0) {
          return ExitStatus.COMPLETED;
    }

}

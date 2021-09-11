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
package ec.edu.espe.distribuidas.examen.examenbatch.model;

import java.security.Timestamp;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Diana
 */
@Data
public class Consolidado {

    @Id
    private String id;
    private String codigo;
    private Integer montoRetiro;
    private Integer numerobilletesDiez;
    private Integer numerobilletesVeinte;
    private Timestamp fecha;
    
}

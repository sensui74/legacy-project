/*
 * JBoss, Home of Professional Open Source
 * Copyright 2005, JBoss Inc., and individual contributors as indicated
 * by the @authors tag.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the JBPM BPEL PUBLIC LICENSE AGREEMENT as
 * published by JBoss Inc.; either version 1.0 of the License, or
 * (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */
package org.jbpm.bpel.xml;

import javax.xml.namespace.QName;

import org.jbpm.bpel.def.Throw;
import org.jbpm.bpel.variable.def.VariableDefinition;

/**
 * @author Juan Cant�
 * @version $Revision: 1.7 $ $Date: 2006/08/22 04:13:10 $
 */
public class ThrowReaderTest extends AbstractReaderTestCase {
  
  public void testFaultName() throws Exception {
    String xml ="<throw faultName='fn'/>";
    Throw throwActivity = (Throw) readActivity(xml);
    assertEquals(new QName("fn"), throwActivity.getFaultName());
  }
  
  public void testFaultVariable() throws Exception {
    VariableDefinition variable = new VariableDefinition();
    variable.setName("fv");
    scope.addVariable(variable);
    
    String xml ="<throw faultName='fn' faultVariable='fv'/>";
    
    Throw throwActivity = (Throw) readActivity(xml);
    assertEquals( "fv", throwActivity.getFaultVariable().getName() );    
  }
}

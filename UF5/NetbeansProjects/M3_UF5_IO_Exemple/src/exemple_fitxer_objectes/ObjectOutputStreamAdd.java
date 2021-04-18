/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple_fitxer_objectes;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author tanreb123456
 */
public class ObjectOutputStreamAdd extends ObjectOutputStream {

    
     /** Constructor que recibe OutputStream */
    public ObjectOutputStreamAdd(OutputStream out) throws IOException
    {
        super(out);
    }
    
      /** Constructor sin par�metros */
    protected ObjectOutputStreamAdd() throws IOException, SecurityException
    {
        super();
    }
    
     protected void writeStreamHeader() throws IOException
    {
     
    }
}

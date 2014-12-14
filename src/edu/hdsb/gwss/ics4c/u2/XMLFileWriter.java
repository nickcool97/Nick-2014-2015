/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics4c.u2;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author Nick
 */
public class XMLFileWriter {

    /**
     * @param args the command line arguments
     */
    //wrie nick in data.xml
    public static void main(String[] args) throws Exception {
      String name = "nick";
      FileWriter fw = new FileWriter("data.xml");
      BufferedWriter bw =  new BufferedWriter(fw);
      bw.write(name);
      
      bw.close();
    }
    
}

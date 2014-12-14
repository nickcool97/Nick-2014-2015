/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics4c.u2;

import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author Nick
 */
public class StudentInfo {
    //varible names to print out
    public static final String CLASS_OPEN = "<class>";
    public static final String CLASS_CLOSED = "</class>";
    public static final String STUDENT_OPEN = "<student>";
    public static final String STUDENT_CLOSED = "</student>";
    public static final String NAME_OPEN = "<name>";
    public static final String NAME_CLOSED = "</name>";
    public static final String ADDRESS_OPEN = "<address>";
    public static final String ADDRESS_CLOSED = "</address>";
    public static final String PHONE_OPEN = "<phone>";
    public static final String PHONE_CLOSED = "</phone>";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //write to student.txt
        PrintWriter output = new PrintWriter( new File( "student.txt" ) );
        
        output.println( CLASS_OPEN );
        output.println(STUDENT_OPEN);
        output.println(NAME_OPEN);
        output.println("Nick");
        output.println(NAME_CLOSED);
        output.println(ADDRESS_OPEN);
        output.println("123 easy st");
        output.println(ADDRESS_CLOSED);
        output.println(PHONE_OPEN);
        output.println("555-0001");
        output.println(PHONE_CLOSED);
        output.println(STUDENT_CLOSED);
        
        
        output.println(STUDENT_OPEN);
        output.println(NAME_OPEN);
        output.println("Nicholas");
        output.println(NAME_CLOSED);
        output.println(ADDRESS_OPEN);
        output.println("1 easy st");
        output.println(ADDRESS_CLOSED);
        output.println(PHONE_OPEN);
        output.println("555-0002");
        output.println(PHONE_CLOSED);
        output.println(STUDENT_CLOSED);
        
        
        output.println(STUDENT_OPEN);
        output.println(NAME_OPEN);
        output.println("Jordan");
        output.println(NAME_CLOSED);
        output.println(ADDRESS_OPEN);
        output.println("12 easy st");
        output.println(ADDRESS_CLOSED);
        output.println(PHONE_OPEN);
        output.println("555-0003");
        output.println(PHONE_CLOSED);
        output.println(STUDENT_CLOSED);
        
        output.println( CLASS_CLOSED );
        //close file
        output.close();
    }
    
}

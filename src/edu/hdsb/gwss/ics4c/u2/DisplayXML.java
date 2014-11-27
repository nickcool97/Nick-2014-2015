/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics4c.u2;

import java.io.File;
import java.io.IOException;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.ParsingException;

/**
 *
 * @author Nick
 */
public class DisplayXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        File file = new File("friends.xml");
        Builder builder = new Builder();
        try {
            Document doc = builder.build(file);
            Element root = doc.getRootElement();
            Elements friends = root.getChildElements();

            for (int j = 0; j<friends.size();j++){
                System.out.println(friends.get(j).getFirstChildElement("name").getValue());
            }
        } catch (IOException e) {
        } catch (ParsingException e) {
        }
    }
    
}

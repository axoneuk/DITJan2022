package uk.axone.devintest.filehandling;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class XMLDemo {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        XMLUtil myUtil = new XMLUtil("M1 - File Handling/","TestSpec.xml");
        String value = myUtil.xmlReadChildNodeValue("Test","Browser",1);
        System.out.println(value);

        myUtil.xmlModifyChildNodeValue("Test","ID","93489348",1);
    }
}

package ua.epam.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;

/**
 * Created by Viktoriia_Marynchak on 10/5/2016.
 */
public class Runner {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, XPathExpressionException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        Document document = db.parse(Runner.class.getResourceAsStream("/Children.csv"));

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xpath = xPathFactory.newXPath();

        XPathExpression expression = xpath.compile("/Childrens/Children[@id=1]/firstName");
        String result = (String) expression.evaluate(document , XPathConstants.STRING);
        System.out.println(result);

        expression = xpath.compile("/Childrens/Children/firstName[contains(., 'B')]");
        NodeList nodeList = (NodeList) expression.evaluate(document , XPathConstants.NODESET);
        for( int i = 0; i< nodeList.getLength(); i++){
            Element elem = (Element) nodeList.item(i);
            System.out.println(elem.getTextContent());
        }

        expression = xpath.compile("/Childrens/Children");
        nodeList = (NodeList) expression.evaluate(document , XPathConstants.NODESET);
        for( int i = 0; i< nodeList.getLength(); i++){
            Element elem = (Element) nodeList.item(i);
            System.out.println(elem.getAttribute("id"));
            System.out.print( elem.getElementsByTagName("firstName")
                    .item(0).getFirstChild().getNodeValue() + " ");
            System.out.println( elem.getElementsByTagName("lastName")
                    .item(0).getFirstChild().getNodeValue());
        }
    }
}

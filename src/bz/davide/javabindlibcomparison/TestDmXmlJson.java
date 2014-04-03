
package bz.davide.javabindlibcomparison;

import java.io.ByteArrayInputStream;
import org.json.JSONObject;
import bz.davide.dmxmljson.marshalling.json.JSONStructure;
import bz.davide.dmxmljson.marshalling.xml.XMLStructure;
import bz.davide.dmxmljson.unmarshalling.json.org.JSONOrgStructure;
import bz.davide.dmxmljson.unmarshalling.xml.W3CXMLStructure;
import bz.davide.javabindlibcomparison.model.Invoice;
import bz.davide.javabindlibcomparison.model.XmlJsonMarshaller;
import bz.davide.javabindlibcomparison.model.XmlJsonUnmarshaller;

public class TestDmXmlJson
{
   public static void main(String[] args) throws Exception
   {
      Object obj1 = Invoice.createTestObjects();

      XmlJsonMarshaller marshaller = new XmlJsonMarshaller();
      XMLStructure xmlStructure = new XMLStructure("invoice");
      marshaller.marschall(obj1, xmlStructure);

      JSONStructure jsonStructure = new JSONStructure(3);
      marshaller.marschall(obj1, jsonStructure);

      String xmlText = xmlStructure.toString();
      System.out.println(xmlText);
      String jsonText = jsonStructure.toString();
      System.out.println(jsonText);

      Object obj2 = new Invoice();
      XmlJsonUnmarshaller unmarshaller = new XmlJsonUnmarshaller();
      W3CXMLStructure w3cxmlStructure = new W3CXMLStructure(new ByteArrayInputStream(xmlText.getBytes()));
      unmarshaller.unmarschall(w3cxmlStructure, obj2);
      System.out.println("read xml!");

      Object obj3 = new Invoice();
      JSONOrgStructure jsonOrgStructure = new JSONOrgStructure(new JSONObject(jsonText));
      unmarshaller.unmarschall(jsonOrgStructure, obj3);
      System.out.println("read json!");
   }
}

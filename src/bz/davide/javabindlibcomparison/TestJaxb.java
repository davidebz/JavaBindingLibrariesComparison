
package bz.davide.javabindlibcomparison;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import bz.davide.javabindlibcomparison.model.Invoice;
import bz.davide.javabindlibcomparison.model.Smartphone;

public class TestJaxb
{
   public static void main(String[] args) throws JAXBException
   {
      Object obj1 = Invoice.createTestObjects();

      JAXBContext jaxbContext = JAXBContext.newInstance(Invoice.class, Smartphone.class);

      Marshaller marshaller = jaxbContext.createMarshaller();
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
      StringWriter stringWriter = new StringWriter();
      marshaller.marshal(obj1, stringWriter);
      String xmlText = stringWriter.toString();
      System.out.println(xmlText);

      Object obj2 = jaxbContext.createUnmarshaller().unmarshal(new StringReader(xmlText));
      System.out.println("xml parsed!");
   }
}

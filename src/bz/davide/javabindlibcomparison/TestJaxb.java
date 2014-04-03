
package bz.davide.javabindlibcomparison;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import bz.davide.javabindlibcomparison.model.Invoice;

public class TestJaxb
{
   public static void main(String[] args) throws JAXBException
   {
      JAXBContext jaxbContext = JAXBContext.newInstance(Invoice.class);
      Marshaller marshaller = jaxbContext.createMarshaller();
   }
}

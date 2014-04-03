
package bz.davide.javabindlibcomparison.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//only for jaxb
@XmlRootElement
public class Invoice
{
   //only for jaxb
   @XmlElement
   String       number;
   //only for jaxb
   @XmlElement
   int          total;
   //only for jaxb
   @XmlElement
   InvoiceRow[] rows;

   public static Invoice createTestObjects()
   {
      Invoice invoice = new Invoice();
      return invoice;
   }
}

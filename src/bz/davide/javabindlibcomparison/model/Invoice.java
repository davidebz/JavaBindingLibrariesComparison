
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
   Person       customer;

   //only for jaxb
   @XmlElement
   InvoiceRow[] rows;

   public static Invoice createTestObjects()
   {
      Invoice invoice = new Invoice();
      invoice.rows = new InvoiceRow[2];
      invoice.rows[0] = new InvoiceRow();
      invoice.rows[1] = new InvoiceRow();
      invoice.customer = new Person();
      invoice.customer.name = "Davide";
      return invoice;
   }
}

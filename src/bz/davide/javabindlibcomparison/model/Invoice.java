
package bz.davide.javabindlibcomparison.model;

import javax.xml.bind.annotation.XmlRootElement;

//only for jaxb
@XmlRootElement
public class Invoice
{
   String number;

   public static Invoice createTestObjects()
   {
      Invoice invoice = new Invoice();
      return invoice;
   }
}

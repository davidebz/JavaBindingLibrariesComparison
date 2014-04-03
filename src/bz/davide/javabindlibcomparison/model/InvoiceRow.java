
package bz.davide.javabindlibcomparison.model;

import javax.xml.bind.annotation.XmlElement;

public class InvoiceRow
{
   // only for jaxb
   @XmlElement
   int     position;
   // only for jaxb
   @XmlElement
   Product product;
}

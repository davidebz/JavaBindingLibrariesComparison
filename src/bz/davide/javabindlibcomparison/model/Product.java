
package bz.davide.javabindlibcomparison.model;

import javax.xml.bind.annotation.XmlElement;

// required for jackson for subclasses
// @JsonTypeInfo(use = Id.CLASS, include = As.PROPERTY, property = "class")
public class Product
{
   // only for jaxb
   @XmlElement
   String name;
}

/*********************************************************************************
 *                                                                               *
 * WARNING: File automatically generated by DMXmlJson. DON'T CHANGE IT manually! *
 *                                                                               *
 *********************************************************************************/

package bz.davide.javabindlibcomparison.model;


public class XmlJsonMarshaller_Helper extends bz.davide.dmxmljson.marshalling.Marshaller
{
   protected XmlJsonMarshaller_Helper()
   {
      this.putClassMarshaller("bz.davide.javabindlibcomparison.model.Invoice", new bz.davide.dmxmljson.marshalling.ClassMarshaller() {
         @Override public void marshall(Object obj, String compileTimeClassName, bz.davide.dmxmljson.marshalling.Structure structure, java.util.IdentityHashMap<Object, bz.davide.dmxmljson.marshalling.Structure> identities, long[] seq, boolean superClass) throws Exception {
            if (!superClass) {
               if (isReference(structure, obj, identities, seq))
                  return;
               identities.put(obj, structure);
               structure.open(shortName(compileTimeClassName), shortName(obj.getClass().getName()), null);
            }
            Object value;
            // customer
            value = ((bz.davide.javabindlibcomparison.model.Invoice)obj).customer;
            if (value == null)
               structure.property("customer").nullValue();
            else
            {
                     internalMarschall(value, value.getClass().getName(),"bz.davide.javabindlibcomparison.model.Person", structure.property("customer").structure(), identities, seq, false);
            }
            // number
            value = ((bz.davide.javabindlibcomparison.model.Invoice)obj).number;
            if (value == null)
               structure.property("number").nullValue();
            else
            {
                    structure.property("number").string((String)value);                          
            }
            // rows
            value = ((bz.davide.javabindlibcomparison.model.Invoice)obj).rows;
            if (value == null)
               structure.property("rows").nullValue();
            else
            {
               bz.davide.javabindlibcomparison.model.InvoiceRow[] rawarray = (bz.davide.javabindlibcomparison.model.InvoiceRow[])value;                        
               bz.davide.dmxmljson.marshalling.Array array = structure.property("rows").array(rawarray.length);        
               for (Object o: rawarray) {                                    
                  if (o == null)                                              
                     array.item().nullValue();                                
                     internalMarschall(o, o.getClass().getName(), "bz.davide.javabindlibcomparison.model.InvoiceRow", array.item().structure(), identities, seq, false);
               }                                                              
            }
            // total
            value = ((bz.davide.javabindlibcomparison.model.Invoice)obj).total;
            if (value == null)
               structure.property("total").nullValue();
            else
            {
                    structure.property("total").integer((Integer)value);                          
            }
            if (!superClass)
               structure.close();
         }
      });
      this.putClassMarshaller("bz.davide.javabindlibcomparison.model.Person", new bz.davide.dmxmljson.marshalling.ClassMarshaller() {
         @Override public void marshall(Object obj, String compileTimeClassName, bz.davide.dmxmljson.marshalling.Structure structure, java.util.IdentityHashMap<Object, bz.davide.dmxmljson.marshalling.Structure> identities, long[] seq, boolean superClass) throws Exception {
            if (!superClass) {
               if (isReference(structure, obj, identities, seq))
                  return;
               identities.put(obj, structure);
               structure.open(shortName(compileTimeClassName), shortName(obj.getClass().getName()), null);
            }
            Object value;
            // name
            value = ((bz.davide.javabindlibcomparison.model.Person)obj).name;
            if (value == null)
               structure.property("name").nullValue();
            else
            {
                    structure.property("name").string((String)value);                          
            }
            if (!superClass)
               structure.close();
         }
      });
      this.putClassMarshaller("bz.davide.javabindlibcomparison.model.InvoiceRow", new bz.davide.dmxmljson.marshalling.ClassMarshaller() {
         @Override public void marshall(Object obj, String compileTimeClassName, bz.davide.dmxmljson.marshalling.Structure structure, java.util.IdentityHashMap<Object, bz.davide.dmxmljson.marshalling.Structure> identities, long[] seq, boolean superClass) throws Exception {
            if (!superClass) {
               if (isReference(structure, obj, identities, seq))
                  return;
               identities.put(obj, structure);
               structure.open(shortName(compileTimeClassName), shortName(obj.getClass().getName()), null);
            }
            Object value;
            // position
            value = ((bz.davide.javabindlibcomparison.model.InvoiceRow)obj).position;
            if (value == null)
               structure.property("position").nullValue();
            else
            {
                    structure.property("position").integer((Integer)value);                          
            }
            if (!superClass)
               structure.close();
         }
      });

   }
}

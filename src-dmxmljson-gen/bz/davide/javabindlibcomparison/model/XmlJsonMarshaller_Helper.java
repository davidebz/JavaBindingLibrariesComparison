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
            // number
            value = ((bz.davide.javabindlibcomparison.model.Invoice)obj).number;
            if (value == null)
               structure.property("number").nullValue();
            else
            {
                    structure.property("number").string((String)value);                          
            }
            if (!superClass)
               structure.close();
         }
      });

   }
}

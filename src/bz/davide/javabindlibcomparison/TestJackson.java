
package bz.davide.javabindlibcomparison;

import java.io.IOException;
import java.io.StringReader;
import bz.davide.javabindlibcomparison.model.Invoice;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJackson
{
   public static void main(String[] args) throws IOException
   {
      Object obj1 = Invoice.createTestObjects();
      ObjectMapper mapper = new ObjectMapper();
      mapper.setVisibility(PropertyAccessor.ALL, Visibility.NONE);
      mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);

      String jsonText = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj1);
      System.out.println(jsonText);

      // Now parse the json
      Invoice obj2 = mapper.readValue(new StringReader(jsonText), Invoice.class);
      System.out.println("json parsed");
   }
}

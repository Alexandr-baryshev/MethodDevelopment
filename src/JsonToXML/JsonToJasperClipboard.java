package JsonToXML;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class JsonToJasperClipboard {


   public void jsonToStrArr(String jsonFile) throws FileNotFoundException {


      JsonReader zapros = new JsonReader(new FileReader(jsonFile));

      Gson gson = new Gson();
      JsonData jData = gson.fromJson(zapros, JsonData.class);


      ArrayList<String> fromJson = new ArrayList<String>();

      for (int i = 0; i < jData.columns.size(); i++) {

         fromJson.add(jData.getColumns().get(i).getCaption());
      }


      String jasperStr, jasperInt = null, jasperDat = null , jrxml = "";

      for (String i : fromJson) {

         if (i.contains("Время")) {
            jasperDat = "<field name=\"" + i + "\" class=\"java.util.Date\"/>";
            jrxml = jrxml + jasperDat + "\n";
         }
         // IFы еще не доработаны, добавить дни, признаки и т.д.
         else if (i.contains("Номер")) {
            jasperInt = "<field name=\"" + i + "\" class=\"java.lang.Integer\"/>";
            jrxml = jrxml + jasperInt + "\n";
         }

         else if (!i.contains("Номер") || !i.contains("Время") ) {
            jasperStr = "<field name=\"" + i + "\" class=\"java.lang.String\"/>";
            jrxml = jrxml + jasperStr + "\n";
         }
      }

      StringSelection selection = new StringSelection(jrxml);
      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      clipboard.setContents(selection, selection);



   }
}

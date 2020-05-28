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

      // Получение String массива из Gson
      ArrayList<String> fromJson = new ArrayList<String>();

      for (int i = 0; i < jData.columns.size(); i++) {

         fromJson.add(jData.getColumns().get(i).getCaption());
      }

      // Перевод массива в JRXML FIELD
      String jasperStr, jasperInt, jasperDat, jrxml = "";
      boolean z;

      for (String i : fromJson) {

         z = i.contains("Признак") || i.contains("Номер") || i.contains("номер") || i.contains("Идентификатор")
               || i.equals("Лет") || i.equals("Месяцев") || i.equals("Дней") || i.equals("Амбулаторно")
               || i.equals("Пол пациента код")  || i.equals("Серия полиса")
               || i.equals("СМО код") || i.equals("СМО ОКАТО") || i.equals("Госпитализирован");


         if (i.contains("Время")) {
            jasperDat = "<field name=\"" + i + "\" class=\"java.util.Date\"/>";
            jrxml = jrxml + jasperDat + "\n";
         }

         else if (z) {
            jasperInt = "<field name=\"" + i + "\" class=\"java.lang.Integer\"/>";
            jrxml = jrxml + jasperInt + "\n";
         }

         else {
            jasperStr = "<field name=\"" + i + "\" class=\"java.lang.String\"/>";
            jrxml = jrxml + jasperStr + "\n";
         }
      }

      StringSelection selection = new StringSelection(jrxml);
      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      clipboard.setContents(selection, selection);


   }
}

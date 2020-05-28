package next;

import JsonToXML.JsonData;
import com.google.gson.Gson;

import com.google.gson.stream.JsonReader;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


public class Main {


   public static void main(String[] args) throws FileNotFoundException {

      // Генератор
      {
//         GeneratorData gd = new GeneratorData();
//         GeneratorFunc gFun = new GeneratorFunc();
//
//         String v1 = "\t\t\t<textField>\n" +
//               "\t\t\t\t<reportElement style=\"Ячейка_C_root\" x=\"0\" y=\"0\" width=\"20\" height=\"20\" uuid=\"a395b2d1-d0e6-4f79-b685-a2f3f0ce0f5c\"/>\n" +
//               "\t\t\t\t<textFieldExpression><![CDATA[1]]></textFieldExpression>\n" +
//               "\t\t\t</textField>";
//
//
//         gd.setInputTxt(v1);
//
//
//         gd.setStartR(1);
//         gd.setSizeR(28);
//         gd.setStepR(1);
//         gd.setTargetR("1");
//         gd.setReplaceR("");
//
//         gd.setStartC(1);
//         gd.setSizeC(1);
//         gd.setStepC(1);
//         gd.setTargetC("#");
//         gd.setReplaceC("");
//
//         gd.setPositX(0);
//         gd.setPositX(0);
//         gd.setWidth(20);
//         gd.setHeight(20);
//
//
//         System.out.println(gFun.sortFunc(gd));
      }


      jsonToStrArr();

      // Эмулятор того, что должна возвращать функция "jsonToStrArr()"
      String[] jsonToStrArr = {"Адрес", "Номер вызова", "Время регистрации"};

         System.out.println(strToJrxml(jsonToStrArr));


   }


   public static void jsonToStrArr() throws FileNotFoundException {


      JsonReader zapros = new JsonReader(new FileReader("src\\JsonToXML\\Запрос.json"));

      Gson gson = new Gson();

      JsonData jData = gson.fromJson(zapros, JsonData.class);


//
//        Object[] ob = jData.columns.toArray();
//
//      for ( Object i : ob) {
//
//          System.out.println(i);
//      }

   }


   static String strToJrxml(String[] strArr) {

      String jasperStr = null, jasperInt = null, jasperDat = null , jrxml = "";

      for (String i : strArr) {

         if (i.contains("Время")) {
            jasperDat = "<field name=\"" + i + "\" class=\"java.util.Date\"/>";
            jrxml = jrxml + jasperDat + "\n";

         }
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

      return jrxml;
   }


}

package next;

import JsonToXML.JsonData;
import com.google.gson.Gson;

import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;


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


      jsonToString();

   }


   public static void jsonToString() throws FileNotFoundException {


      JsonReader zapros = new JsonReader(new FileReader("src\\JsonToXML\\Запрос.json"));

        Gson gson = new Gson();

        JsonData jData = gson.fromJson(zapros, JsonData.class);
        String ss = jData.columns.toString();

        Object[] ob = jData.columns.toArray();


//      JsonElement json = gson.fromJson(zapros, JsonElement.class);
//      String jsonInString = gson.toJson(json);


      for ( Object i : ob) {

          System.out.println(i.getClass());
      }





   }

}

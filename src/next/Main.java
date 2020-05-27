package next;

import Generator.GeneratorData;
import Generator.GeneratorFunc;
import JsonToXML.JsonData;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

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

      // stringToJson();

      jsonToString();

   }

//   public static void stringToJson() {
//      JsonData jData = new JsonData( "Адрес" );
//
//      Gson gson = new Gson();
//      String json = gson.toJson(jData);
//
//
//   }



   public static void jsonToString() throws FileNotFoundException {

      String zapros = "{\n" +
            "  \"columns\": [\n" +
            "    {\n" +
            "      \"agg\": null,\n" +
            "      \"alias\": null,\n" +
            "      \"caption\": \"Адрес\",\n" +
            "      \"columnSwitch\": null,\n" +
            "      \"id\": \"id_addr_ADRESS_64169fec-c563-4cdc-97fd-325bda21028e\",\n" +
            "      \"idField\": \"id_addr_ADRESS\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"agg\": null,\n" +
            "      \"alias\": null,\n" +
            "      \"caption\": \"Номер вызова\",\n" +
            "      \"columnSwitch\": null,\n" +
            "      \"id\": \"id_ce_CALL_NUMB_1980e272-59c4-48d0-b46b-987cdb242d39\",\n" +
            "      \"idField\": \"id_ce_CALL_NUMB\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

//      JsonReader zapros = new JsonReader(new FileReader("C:\\Users\\Alexandr\\Desktop\\Запрос.json"));

//      Gson gson = new Gson();
//      JsonData[] jsonData = gson.fromJson(zapros, JsonData[].class);


   }

}

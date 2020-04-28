package next;

import java.util.UUID;

public class Main {

   public static void main(String[] args) {

      GeneratorData gd = new GeneratorData();
      GeneratorFunc gFun = new GeneratorFunc();

      String v1 = "\t\t\t\t<textField>\n" +
              "\t\t\t\t\t<reportElement style=\"Ячейка_C_root\" x=\"20\" y=\"0\" width=\"40\" height=\"20\" uuid=\"4f3157ad-9f88-499c-8060-41fe49bdc976\">\n" +
              "\t\t\t\t\t\t<property name=\"com.jaspersoft.studio.unit.width\" value=\"px\"/>\n" +
              "\t\t\t\t\t</reportElement>\n" +
              "\t\t\t\t\t<textFieldExpression><![CDATA[$V{R1 C1}]]></textFieldExpression>\n" +
              "\t\t\t\t</textField>";


      gd.setTxtInput(v1);


      gd.setStartR(1);
      gd.setSizeR(2);
      gd.setStepR(1);

      gd.setStartC(1);
      gd.setSizeC(2);
      gd.setStepC(1);

      gd.setPositX(0);
      gd.setPositX(0);
      gd.setWidth(20);
      gd.setHeight(20);


      System.out.println(gFun.sortColumn(gd));



   }


}

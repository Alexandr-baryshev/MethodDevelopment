package next;

import java.util.UUID;

public class Main {

   public static void main(String[] args) {

      GeneratorData gd = new GeneratorData();
      GeneratorFunc gFun = new GeneratorFunc();

      String v1 = "\t\t\t<textField>\n" +
              "\t\t\t\t<reportElement style=\"Ячейка_C_root\" x=\"0\" y=\"0\" width=\"20\" height=\"20\" uuid=\"a395b2d1-d0e6-4f79-b685-a2f3f0ce0f5c\"/>\n" +
              "\t\t\t\t<textFieldExpression><![CDATA[1]]></textFieldExpression>\n" +
              "\t\t\t</textField>";


      gd.setTxtInput(v1);


      gd.setStartR(1);
      gd.setSizeR(28);
      gd.setStepR(1);
      gd.setTargetR("R1");
      gd.setReplaceR("R");

      gd.setStartC(1);
      gd.setSizeC(1);
      gd.setStepC(1);
      gd.setTargetC("C1");
      gd.setReplaceC("C");

      gd.setPositX(0);
      gd.setPositX(0);
      gd.setWidth(20);
      gd.setHeight(20);


      System.out.println(gFun.sortColumn(gd));



   }


}

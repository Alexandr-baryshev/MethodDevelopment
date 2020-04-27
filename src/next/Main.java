package next;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {



        String v1 = "\t\t\t<textField>\n" +
                "\t\t\t\t<reportElement style=\"Ячейка_C_root\" x=\"111\" y=\"$y\" width=\"$w\" height=\"$h\" uuid=\"$uuid\"/>\n" +
                "\t\t\t\t<textFieldExpression><![CDATA[$V{R1 C1}]]></textFieldExpression>\n" +
                "\t\t\t</textField>";


        String v2 = "Ячейка_C_root\" x=\"111\" y=\"555\" width";

        System.out.println(poisk(v2));




    }

    public static String poisk (String jasperField) {
        String result = "";
        int x = 222;

        UUID uuid = UUID.randomUUID();
        String randomUUID = uuid.toString();

//        result = jasperField.replace("$uuid", randomUUID);

        result = jasperField.replaceAll("x=(\\s*)", "x=\"" + x +"");


        return result;
    }






    public static String sort_C(String jasperVar, int rStart, int rSize, int rStep,
                                                  int cStart, int cSize, int cStep,
                                                        int x, int y, int w, int h ) {

        String row = "", column = "", allResult = "";

        for (int c = cStart; c <= cSize; c = c + cStep) {

            column = jasperVar.replace("C1", "C" + c).replace("$x", ""+x);

            for (int r = rStart; r <= rSize; r = r + rStep) {
                row = column.replace("R1", "R" + r);
                allResult = allResult + row + "\n";
            }
        }
        return (allResult);
    }

//
//    public static String sort_R(String jasperVar, int rStart, int rSize, int rStep, int cStart, int cSize, int cStep) {
//        String row = "", column = "", allResult = "";
//
//        for (int r = rStart; r <= rSize; r = r + rStep) {
//            row = jasperVar.replace("R1", "R" + r);
//
//            for (int c = cStart; c <= cSize; c = c + cStep) {
//                column = row.replace("C1", "C" + c);
//                allResult = allResult + column + "\n";
//            }
//        }
//        return (allResult);
//    }














}

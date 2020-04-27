package next;

public class Main {

    public static void main(String[] args) {

        String v1 = "R1 C1";

        String field = "\t\t\t<textField>\n" +
                "\t\t\t\t<reportElement style=\"Ячейка_C_root\" x=\"160\" y=\"0\" width=\"40\" height=\"20\" uuid=\"9308e085-69d6-4695-9806-00d4715e69c9\"/>\n" +
                "\t\t\t\t<textFieldExpression><![CDATA[$V{R1 C1}]]></textFieldExpression>\n" +
                "\t\t\t</textField>";

        System.out.println(poisk(field));

    }

    public static String poisk (String jasperField) {
        String result = "";
        int x = 88;

        result = jasperField.replace("x=\\s+", "x=\"" + x + "\"");

        return result;
    }



    public static String sort_C(String jasperVar, int rStart, int rSize, int rStep, int cStart, int cSize, int cStep) {
        String row = "", column = "", allResult = "";

        for (int c = cStart; c <= cSize; c = c + cStep) {
            column = jasperVar.replace("C1", "C" + c);

            for (int r = rStart; r <= rSize; r = r + rStep) {
                row = column.replace("R1", "R" + r);
                allResult = allResult + row + "\n";
            }
        }
        return (allResult);
    }


    public static String sort_R(String jasperVar, int rStart, int rSize, int rStep, int cStart, int cSize, int cStep) {
        String row = "", column = "", allResult = "";

        for (int r = rStart; r <= rSize; r = r + rStep) {
            row = jasperVar.replace("R1", "R" + r);

            for (int c = cStart; c <= cSize; c = c + cStep) {
                column = row.replace("C1", "C" + c);
                allResult = allResult + column + "\n";
            }
        }
        return (allResult);
    }














}

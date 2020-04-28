package next;

import java.util.UUID;

public class GeneratorFunc {


   public String sort_C(String jasperVar, int rStart, int rSize, int rStep,
                               int cStart, int cSize, int cStep,
                               int xp, int yp, int wp, int hp ) {

      String row = "", column = "", allResult = "";
      int x = xp;

      for (int c = cStart; c <= cSize; c = c + cStep) {
         int y = yp;
         column = jasperVar.replace("C1", "C" + c).replaceAll("x=(\\S+)", "x=\"" + x +"\"")
                 .replaceAll("width=(\\S+)", "width=\"" + wp +"\"");

         for (int r = rStart; r <= rSize; r = r + rStep) {
            UUID uuid = UUID.randomUUID();
            String randomUUID = uuid.toString();
            row = column.replace("R1", "R" + r).replaceAll("y=(\\S+)", "y=\"" + y +"\"")
                    .replaceAll("height=(\\S+)", "height=\"" + hp +"\"").replaceAll("uuid=(\\S+)", "uuid=\"" + randomUUID +"\">");

            allResult = allResult + row + "\n";
            y = y + (hp*rStep);
         }
         x = x + wp;
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

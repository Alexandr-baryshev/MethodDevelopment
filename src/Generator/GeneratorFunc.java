package Generator;

import java.util.UUID;

public class GeneratorFunc {


   public String sortColumn(GeneratorData gd) {

      String row = "", column = "", allResult = "";
      int x = gd.getPositX();

      for (int c = gd.getStartC(); c <= gd.getSizeC(); c = c + gd.getStepC()) {
         int y = gd.getPositY();
         column = gd.getTxtInput().replace(gd.getTargetC(), gd.getReplaceC() + c).replaceAll("x=(\\S+)", "x=\"" + x +"\"")
                 .replaceAll("width=(\\S+)", "width=\"" + gd.getWidth() +"\"");

         for (int r = gd.getStartR(); r <= gd.getSizeR(); r = r + gd.getStepR()) {
            UUID uuid = UUID.randomUUID();
            String randomUUID = uuid.toString();
            row = column.replace(gd.getTargetR(), gd.getReplaceR() + r).replaceAll("y=(\\S+)", "y=\"" + y +"\"")
                    .replaceAll("height=(\\S+)", "height=\"" + gd.getHeight() +"\"").replaceAll("uuid=(\\S+)", "uuid=\"" + randomUUID +"\"/>");

            allResult = allResult + row + "\n";
            y = y + (gd.getHeight()*gd.getStepR());
         }
         x = x + (gd.getWidth()*gd.getStepC());
      }
      return (allResult);
   }




//   ДАЛЕЕ - УСТАРЕВШЕЕ ГАВНО

//   public String sortColumnParam(String txtInput, int startR, int sizeR, int stepR,
//                               int startC, int sizeC, int stepC,
//                               int positX, int positY, int width, int height ) {
//
//      String row = "", column = "", allResult = "";
//      int x = positX;
//
//      for (int c = startC; c <= sizeC; c = c + stepC) {
//         int y = positY;
//         column = txtInput.replace("C1", "C" + c).replaceAll("x=(\\S+)", "x=\"" + x +"\"")
//                 .replaceAll("width=(\\S+)", "width=\"" + width +"\"");
//
//         for (int r = startR; r <= sizeR; r = r + stepR) {
//            UUID uuid = UUID.randomUUID();
//            String randomUUID = uuid.toString();
//            row = column.replace("R1", "R" + r).replaceAll("y=(\\S+)", "y=\"" + y +"\"")
//                    .replaceAll("height=(\\S+)", "height=\"" + height +"\"").replaceAll("uuid=(\\S+)", "uuid=\"" + randomUUID +"\">");
//
//            allResult = allResult + row + "\n";
//            y = y + (height*stepR);
//         }
//         x = x + (width*stepC);
//      }
//      return (allResult);
//   }




//    public String sortRowParam(String jasperVar, int rStart, int rSize, int rStep, int cStart, int cSize, int cStep) {
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
//
//
//   public String sortRow(GeneratorData gd) {
//      String row = "", column = "", allResult = "";
//
//      for (int r = gd.getStartR(); r <= gd.getSizeR(); r = r + gd.getStepR()) {
//         row = gd.getTxtInput().replace("R1", "R" + r);
//
//         for (int c = gd.getStartC(); c <= gd.getSizeC(); c = c + gd.getStepC()) {
//            column = row.replace("C1", "C" + c);
//            allResult = allResult + column + "\n";
//         }
//      }
//      return (allResult);
//   }






}
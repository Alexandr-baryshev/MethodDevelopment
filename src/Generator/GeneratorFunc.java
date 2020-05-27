package Generator;

import java.util.UUID;

public class GeneratorFunc {


   public String sortFunc(GeneratorData gd) {

      String row = "", column = "", allResult = "";
      int x = gd.getPositX();

      for (int c = gd.getStartC(); c <= gd.getSizeC(); c = c + gd.getStepC()) {
         int y = gd.getPositY();
         column = gd.getInputTxt().replace(gd.getTargetC(), gd.getReplaceC() + c).replaceAll("x=(\\S+)", "x=\"" + x +"\"")
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


}

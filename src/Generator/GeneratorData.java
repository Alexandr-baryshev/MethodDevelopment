package Generator;

public class GeneratorData {


   private String inputTxt;
   private String outTxt;

   private int startR;
   private int sizeR;
   private int stepR;
   private String targetR;
   private String replaceR;


   private int startC;
   private int sizeC;
   private int stepC;
   private String targetC;
   private String replaceC;

   private int positX;
   private int positY;
   private int width;
   private int height;

   public String getInputTxt() {
      return inputTxt;
   }
   public void setInputTxt(String txtInput) {
      this.inputTxt = txtInput;
   }

   public int getStartR() {
      return startR;
   }
   public void setStartR(int startR) {
      this.startR = startR;
   }

   public int getSizeR() {
      return sizeR;
   }
   public void setSizeR(int sizeR) {
      this.sizeR = sizeR;
   }

   public int getStepR() {
      return stepR;
   }
   public void setStepR(int stepR) {
      this.stepR = stepR;
   }


   public int getStartC() {
      return startC;
   }
   public void setStartC(int startC) {
      this.startC = startC;
   }

   public int getSizeC() {
      return sizeC;
   }
   public void setSizeC(int sizeC) {
      this.sizeC = sizeC;
   }

   public int getStepC() {
      return stepC;
   }
   public void setStepC(int stepC) {
      this.stepC = stepC;
   }


   public int getPositX() {
      return positX;
   }
   public void setPositX(int positX) {
      this.positX = positX;
   }

   public int getPositY() {
      return positY;
   }
   public void setPositY(int positY) {
      this.positY = positY;
   }

   public int getWidth() {
      return width;
   }
   public void setWidth(int width) {
      this.width = width;
   }

   public int getHeight() {
      return height;
   }
   public void setHeight(int height) {
      this.height = height;
   }

   public String getTargetR() {
      return targetR;
   }

   public void setTargetR(String targetR) {
      this.targetR = targetR;
   }

   public String getReplaceR() {
      return replaceR;
   }

   public void setReplaceR(String replaceR) {
      this.replaceR = replaceR;
   }

   public String getTargetC() {
      return targetC;
   }

   public void setTargetC(String targetC) {
      this.targetC = targetC;
   }

   public String getReplaceC() {
      return replaceC;
   }

   public void setReplaceC(String replaceC) {
      this.replaceC = replaceC;
   }

   public String getOutTxt() {
      return outTxt;
   }

   public void setOutTxt(String outTxt) {
      this.outTxt = outTxt;
   }
}

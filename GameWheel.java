import java.util.ArrayList;
import java.lang.Math.*;


public class GameWheel
{
   private ArrayList<Slice> slices; // List of slices making up the wheel
   private int currentPos;   // Position of currently selected slice on wheel


  /* Returns string representation of GameWheel with each numbered slice
   * on a new line
   */
   public String toString(){
    //Implement the toString method here
   
      System.out.println(" ");
      for(int i = 0 ; i < slices.size() ; i ++)
      {
         System.out.println(i + " - Color: " + slices.get(i).getColor() + ", prize amount: $" + slices.get(i).getPrizeAmount()); 
      }
      return " ";
   }

  /* Randomizes the positions of the slices that are in the wheel, but without
   * changing the pattern of the colors
   */
   public void scramble()
   {
    //Implement the scramble method here
    //Implement the scramble method here
     split(); //moved clear into the split so that slices starts empty before adding in the elements from the split lists    
      
       int num;
    
      for(int i = 0; i < 20; i++) {
         if (i % 5 == 0  && black.size() > 0) {  //put the if statements in order from black to blue
            num = (int)(Math.random() * black.size());
            slices.add(black.get(num));
            black.remove(num);
         } else if (i % 2 == 1 && red.size() > 0) {
            num = (int)(Math.random() * red.size());
            slices.add(red.get(num));
            red.remove(num);
         } else if (i % 2 == 0  && blue.size() > 0) { //kept each statement as and else if
            num = (int)(Math.random() * blue.size());
            slices.add(blue.get(num));
            blue.remove(num);
         }
      }

   System.out.println(scramble);
     
      /*ArrayList<Slice> tempFives = new ArrayList<Slice>() ; // put multiples of 5 in here
   
      for(int i = 0 ; i < slices.size(); i = i + 5)
      {
         tempFives.add(slices.get(i));
      }
   
      ArrayList<Slice> tempOdds = new ArrayList<Slice>() ; // put odds in here
   
      for(int i = 1 ; i <= slices.size(); i = i + 2)
      {
         tempOdds.add(slices.get(i));
      }
      tempOdds.remove(2);
      tempOdds.remove(6);
   
      ArrayList<Slice> tempEvens = new ArrayList<Slice>() ; // put evens in here
    
      for(int i = 2 ; i < slices.size(); i = i + 2)
      {
         tempEvens.add(slices.get(i));
      }
      tempEvens.remove(4); 
   
      System.out.println(slices);
   // slices.clear();
      System.out.println(slices);
   
      slices.add(tempFives.remove((int)(Math.random() * ((tempFives.size()-1)) + 1)));  
    // this is the code that has been giving me trouble. there's only one line of it since i'm trying to figure it out and then use it in a algorithm. also, i'm not sure how i could randomly choose from which of the 3 arrays to pick out of, to put back in the main one. i had an idea to hard code the pattern of the colors of slices, but the value of the slice itself would be randomly selected. so i decided to try that and made this code but it didn't work.
   
      System.out.println(slices);*/
   
   }
  
  // Min + (int)(Math.random() * ((Max - Min) + 1))
  
  /* Sorts the positions of the slices that are in the wheel by prize amount,
   * but without changing the pattern of the colors.
   */
   public void sort(){
    //Implement the sort method here
   
   // here, i reset all the values of the 20 slices back into their original order
    
      Slice black1 = new Slice("black", 0); 
      slices.set(0, black1);
   
      Slice red1 = new Slice("red", 100); 
      slices.set(1, red1);
   
      Slice blue1 = new Slice("blue", 400); 
      slices.set(2, blue1);
   
      Slice red2 = new Slice("red", 300); 
      slices.set(3, red2);
   
      Slice blue2 = new Slice("blue", 800); 
      slices.set(4, blue2);
   
      Slice black2 = new Slice("black", 5000); 
      slices.set(5, black2);
   
      Slice blue3 = new Slice("blue", 1200); 
      slices.set(6, blue3);
   
      Slice red3 = new Slice("red", 700); 
      slices.set(7, red3);
   
      Slice blue4 = new Slice("blue", 1600); 
      slices.set(8, blue4);
   
      Slice red4 = new Slice("red", 900); 
      slices.set(9, red4);
   
      Slice black3 = new Slice("black", 10000); 
      slices.set(10, black3);
   
      Slice red5 = new Slice("red", 1100); 
      slices.set(11, red5);
   
      Slice blue5 = new Slice("blue", 2400); 
      slices.set(12, blue5);
   
      Slice red6 = new Slice("red", 1300); 
      slices.set(13, red6);
   
      Slice blue6 = new Slice("blue", 2800); 
      slices.set(14, blue6);
   
      Slice black4 = new Slice("black", 15000); 
      slices.set(15, black4);
   
      Slice blue7 = new Slice("blue", 3200); 
      slices.set(16, blue7);
   
      Slice red7 = new Slice("red", 1700);
      slices.set(17, red7);
   
      Slice blue8 = new Slice("blue", 3600); 
      slices.set(18, blue8);
   
      Slice red8 = new Slice("red", 1900);
      slices.set(19, red8);
   }

  /* COMPLETED METHODS - YOU DO NOT NEED TO CHANGE THESE */

  /* Creates a wheel with 20 preset slices
   */
   public GameWheel()
   {
      this(getStandardPrizes());
   }

  /* Creates a wheel with 20 slices, using values from array parameter
   */
   public GameWheel(int[] prizes)
   {
      currentPos = 0;
      slices = new ArrayList<Slice>();
      for(int i = 0; i < 20; i++){
         int pa = 0;
         String col = "blue";
         if(i < prizes.length)
            pa = prizes[i];
         if (i%5 == 0)
            col = "black";
         else if (i%2 == 1)
            col = "red";
         slices.add(new Slice(col, pa));
      }
   }

  /* Spins the wheel by so that a different slice is selected. Returns that
   * slice (Note: the 10 slices following the current slice are more likely to
   * be returned than the other 10).
   */
   public Slice spinWheel()
   {
    //spin power between range of 1-50 (inclusive)
      int power = (int)(Math.random()*50 + 1);
      int newPos = (currentPos + power) % slices.size();
      currentPos = newPos;
      return slices.get(currentPos);
   }

   public Slice getSlice(int i){
      int sliceNum = i;
      if(i < 0 || i > 19)
         sliceNum = 0;
      return slices.get(sliceNum);
   }

  // Makes an array with a standard list of prizes
   private static int[] getStandardPrizes()
   {
      int[] arr = new int[20];
      for (int i=0; i < 20; i++)
      {
         if (i%5 == 0)
            arr[i] = i*1000;
         else if (i%2 == 1)
            arr[i] = i*100;
         else
            arr[i] = i*200;
      }
      return arr;
   }
}
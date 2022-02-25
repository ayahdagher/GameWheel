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

    ArrayList<Slice> tempFives = new ArrayList<Slice>() ; // put multiples of 5 in here

    for(int i = 0 ; i < slices.size(); i = i + 5)
      {
        tempFives.add(slices.get(i));
      }
    
    // now that the 0 , 5, 10, 15 are in there, scramble them

  /*  ArrayList<Slice> tempFives2 = new ArrayList<Slice>(4) ; // put multiples of 5 in here

    for(int i = 0 ; i < tempFives2.size() ; i ++)
     {
        tempFives2.add(tempFives.remove((int)(Math.random() * ((tempFives.size()) + 1)))); 
        //tempFives.trimToSize();
    }

    System.out.println(tempFives2); */
    
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

    ArrayList<Slice> rand1 = new ArrayList<Slice>() ; // put evens in here
    rand1.add(tempFives.get(0));
    rand1.add(tempOdds.get(0));
    rand1.add(tempEvens.get(0));
    rand1.add(tempFives.get(1));
    rand1.add(tempOdds.get(1));
    rand1.add(tempEvens.get(1));
    rand1.add(tempFives.get(2));
    rand1.add(tempOdds.get(2));
    rand1.add(tempEvens.get(2));
    rand1.add(tempFives.get(3));
    rand1.add(tempOdds.get(3));
    rand1.add(tempEvens.get(3));
    rand1.add(tempOdds.get(4));
    rand1.add(tempEvens.get(4));
    rand1.add(tempOdds.get(5));
    rand1.add(tempEvens.get(5));
    rand1.add(tempOdds.get(6));
    rand1.add(tempEvens.get(6));
    rand1.add(tempOdds.get(7));
    rand1.add(tempEvens.get(7));
    
    ArrayList<Slice> rand2 = new ArrayList<Slice>() ; // put evens in here

    rand2.add(tempOdds.get(7));
    rand2.add(tempEvens.get(7));
    rand2.add(tempOdds.get(6));
    rand2.add(tempEvens.get(6));
    rand2.add(tempOdds.get(5));
    rand2.add(tempEvens.get(5));
    rand2.add(tempOdds.get(4));
    rand2.add(tempEvens.get(4));
    rand2.add(tempFives.get(3));
    rand2.add(tempOdds.get(3));
    rand2.add(tempEvens.get(3));
    rand2.add(tempFives.get(2));
    rand2.add(tempOdds.get(2));
    rand2.add(tempEvens.get(2));
    rand2.add(tempFives.get(1));
    rand2.add(tempOdds.get(1));
    rand2.add(tempEvens.get(1));
    rand2.add(tempFives.get(0));
    rand2.add(tempOdds.get(0));
    rand2.add(tempEvens.get(0));
    
    ArrayList<Slice> rand3 = new ArrayList<Slice>() ; // put evens in here

    rand3.add(tempOdds.get(7));
    rand3.add(tempEvens.get(7));
    rand3.add(tempOdds.get(5));
    rand3.add(tempEvens.get(5));
    rand3.add(tempOdds.get(6));
    rand3.add(tempEvens.get(6));
    rand3.add(tempFives.get(3));
    rand3.add(tempOdds.get(3));
    rand3.add(tempEvens.get(3));
    rand3.add(tempOdds.get(4));
    rand3.add(tempEvens.get(4));
    rand3.add(tempFives.get(1));
    rand3.add(tempOdds.get(1));
    rand3.add(tempEvens.get(1));
    rand3.add(tempFives.get(0));
    rand3.add(tempOdds.get(0));
    rand3.add(tempEvens.get(0));
    rand3.add(tempFives.get(2));
    rand3.add(tempOdds.get(2));
    rand3.add(tempEvens.get(2));

    ArrayList<Slice> rand4 = new ArrayList<Slice>() ; // put evens in here

    rand4.add(tempOdds.get(7));
    rand4.add(tempOdds.get(5));
    rand4.add(tempEvens.get(2));
    rand4.add(tempEvens.get(7));
    rand4.add(tempEvens.get(5));
    rand4.add(tempOdds.get(6));
    rand4.add(tempFives.get(3));
    rand4.add(tempEvens.get(6));
    rand4.add(tempOdds.get(3));
    rand4.add(tempOdds.get(4));
    rand4.add(tempFives.get(0));
    rand4.add(tempOdds.get(1));
    rand4.add(tempEvens.get(3));
    rand4.add(tempEvens.get(4));
    rand4.add(tempOdds.get(2));
    rand4.add(tempFives.get(1));
    rand4.add(tempEvens.get(0));
    rand4.add(tempEvens.get(1));
    rand4.add(tempOdds.get(0));
    rand4.add(tempFives.get(2));

    
    ArrayList<Slice> rand5 = new ArrayList<Slice>() ; // put evens in here

    rand5.add(tempOdds.get(2));
    rand5.add(tempEvens.get(0));
    rand5.add(tempOdds.get(7));
    rand5.add(tempFives.get(1));
    rand5.add(tempOdds.get(1));
    rand5.add(tempEvens.get(1));
    rand5.add(tempEvens.get(2));
    rand5.add(tempOdds.get(3));
    rand5.add(tempEvens.get(4));
    rand5.add(tempFives.get(0));
    rand5.add(tempEvens.get(7));
    rand5.add(tempOdds.get(5));
    rand5.add(tempEvens.get(3));
    rand5.add(tempOdds.get(4));
    rand5.add(tempEvens.get(5));
    rand5.add(tempOdds.get(6));
    rand5.add(tempEvens.get(6));
    rand5.add(tempOdds.get(0));
    rand5.add(tempFives.get(2));
    rand5.add(tempFives.get(3));
    
    }
  
  /* Sorts the positions of the slices that are in the wheel by prize amount,
   * but without changing the pattern of the colors.
   */
  public void sort(){
    //Implement the sort method here
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

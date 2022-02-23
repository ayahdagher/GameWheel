import java.util.ArrayList;

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
    
    ArrayList<Slice> tempOdds = new ArrayList<Slice>() ; // put odds in here

    for(int i = 1 ; i <= slices.size(); i = i + 2)
      {
        tempOdds.add(slices.get(i));
      }

    tempOdds.remove(2);
    tempOdds.remove(6);

    // now that the odds (not including multiples of 5) are in there, scramble them

    
    ArrayList<Slice> tempEvens = new ArrayList<Slice>() ; // put evens in here
    
    for(int i = 2 ; i < slices.size(); i = i + 2)
      {
        tempEvens.add(slices.get(i));
      }

    tempEvens.remove(4); 

    // now that the evens (not including multiples of 5) are in there, scramble them


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

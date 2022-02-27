// this is just where i put code i didn't use in case i wanted to come back to it

/*
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
  */

//////////////////////////////////////////

    
    // now that the 0 , 5, 10, 15 are in there, scramble them

  /*  ArrayList<Slice> tempFives2 = new ArrayList<Slice>(4) ; // put multiples of 5 in here

    for(int i = 0 ; i < tempFives2.size() ; i ++)
     {
        tempFives2.add(tempFives.remove((int)(Math.random() * ((tempFives.size()) + 1)))); 
        //tempFives.trimToSize();
    }

    System.out.println(tempFives2); */

////////////////////////////
/*
    slices.add(tempOdds.remove((int)(Math.random() * ((tempOdds.size()-1)) + 1))); 
    slices.add(tempEvens.remove((int)(Math.random() * ((tempEvens.size() -1)) + 1))); 
    slices.add(tempFives.remove((int)(Math.random() * ((tempFives.size()-1)) + 1)));
    slices.add(tempOdds.remove((int)(Math.random() * ((tempOdds.size()-1)) + 1))); 
    slices.add(tempEvens.remove((int)(Math.random() * ((tempEvens.size() -1)) + 1))); 
    slices.add(tempFives.remove((int)(Math.random() * ((tempFives.size()-1)) + 1)));
    slices.add(tempOdds.remove((int)(Math.random() * ((tempOdds.size()-1)) + 1))); 
    slices.add(tempEvens.remove((int)(Math.random() * ((tempEvens.size() -1)) + 1))); 
    slices.add(tempFives.remove((int)(Math.random() * ((tempFives.size()-1)) + 1)));
    slices.add(tempOdds.remove((int)(Math.random() * ((tempOdds.size()-1)) + 1))); 
    slices.add(tempEvens.remove((int)(Math.random() * ((tempEvens.size() -1)) + 1))); 
    slices.add(tempFives.remove((int)(Math.random() * ((tempFives.size()-1)) + 1)));
    slices.add(tempOdds.remove((int)(Math.random() * ((tempOdds.size()-1)) + 1))); 
    slices.add(tempEvens.remove((int)(Math.random() * ((tempEvens.size() -1)) + 1))); 
    slices.add(tempFives.remove((int)(Math.random() * ((tempFives.size()-1)) + 1)));
    slices.add(tempOdds.remove((int)(Math.random() * ((tempOdds.size()-1)) + 1))); 
    slices.add(tempEvens.remove((int)(Math.random() * ((tempEvens.size() -1)) + 1))); 
  slices.add(tempFives.remove((int)(Math.random() * ((tempFives.size()- 1)) + 1))); 

*/
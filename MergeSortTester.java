/*======================================
  class MergeSortTester

  ALGORITHM:
  <INSERT YOUR DISTILLATION OF ALGO HERE>

  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {
	int[] one = {1};
	int[] ten = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
	int[] hundred = new int[100];
	int[] huge = new int[100000]
;
	for (int x = 0; x < hundred.length; x++){
	    hundred[x] = (int)(Math.random() * 100);
	}

	for (int x = 0; x < huge.length; x++){
	    huge[x] = (int)(Math.random() * 100000);
	}
	
	long startTime = System.nanoTime();
	MergeSort.sort(huge);

	long endTime = System.nanoTime();
	System.out.println("Time in seconds: " + ((endTime - startTime)/1000000000.0));
    }//end main

}//end class

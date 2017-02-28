//Team Strawberry -- Lisa Eng, Elaina Chung, and Nikolas Cruz-Marsted
//APCS2 pd3
//HW07 -- What Does the Data Say?  
//2016-02-13
/*======================================
  class MergeSortTester

  ALGORITHM:
  For MergeSort, it first checks if the list only has one element. If it does then it will return the array. 
  If not, the array is split into two again and again until there are only arrays of one element. 
  Then, the arrays are merged together in the reverse oreder that it is split.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(nlogn)

  Mean execution times for dataset of size n:
  Batch size: 10
  n=1       time: 2.82E-04s
  n=10      time: 3.53E-04s
  n=100     time: 4.75E-04s
  ...
  n=1000000  time: 0.482971713

  ANALYSIS:
  The runtimes increase as the data size increases. We had multiple test cases for the same data size, and plotted it on the graph. 
  The graph had a curve to it, so we came to the conclusion that it was O(nlogn) runtime. 
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * We first made multiple arrays with different data sizes and filled them up. 
     Then, we set a variable, startTime and used  System.nanoTime() to find out the runtime of the program so far. 
     Then we sorted the array ten times for each data size using a for. 
     Then, we set another variable, endTime, and used System.nanoTime() again. 
     We printed out the difference between the endTime and startTime, converted it into seconds. 
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
	for (int x = 0; x < 10; x+=1){
	    MergeSort.sort(huge);
	}
	long endTime = System.nanoTime();
	System.out.println("Time in seconds: " + (((endTime - startTime)/1000000000.0))/10);
    }//end main

}//end class

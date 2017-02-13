//Team Strawberry -- Lisa Eng, Elaina Chung, and Niko 
//APCS2 pd3
//HW06 -- Step 1: Split, Step 2: ?, Step 3: Sorted!
//2016-02-10

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: 

Merge method:
   
   create index trackers for each array, index tracker for merged array (retArr), and a retArr.
   while both index trackers are less than corrsponding arrays, compare the values at the index trackers. The smaller value will be placed into the retArr and whichever array the val came from, the index tracker increases by one. The index tracker for merged array will also increase by one.
   while the smaller array has all of its values placed, place the rest of the values of the larger array into retArr.

   Sort method:
   
   for every array, split the array into two arrays. and keep sorting the two arays. When the array length is one, return the array and merge. merge the two sorted arrays.
  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) 
    {
	int[] retArr = new int[a.length + b.length];
	int mergeInd = 0;
	int indA = 0;
	int indB = 0;

	while (indA < a.length && indB < b.length){
	    if (a[indA] < b[indB]){
	        retArr[mergeInd] = a[indA];
		mergeInd+=1;
		indA+=1;
	    }
	    else if (b[indB] < a[indA]){
		retArr[mergeInd] = b[indB];
		mergeInd+=1;
		indB+=1;
	    }
	    else {
	        retArr[mergeInd] = a[indA];
		retArr[mergeInd + 1] = b[indB];
		mergeInd += 2;
		indA+=1;
		indB+=1;
	    }
	}
	while (indA == a.length && indB < b.length){
	    retArr[mergeInd] = b[indB];
	    mergeInd+=1;
	    indB+=1;
	}
	while (indB == b.length && indA < a.length){
	    retArr[mergeInd] = a[indA];
	    mergeInd+=1;
	    indA+=1;
	}
	return retArr;
    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) 
    {
	int ctr = 0;
	int halfL = arr.length/2;
	int[] arr1 = new int[halfL];
	int[] arr2 = new int[arr.length - halfL];
	
	if (arr.length == 1){
	    return arr;
	}
	if ((arr.length % 2) == 0) {
	    for (int x = 0; x < halfL; x+=1){
		arr1[x] = arr[x];
	    }
	    for (int x = halfL; x < arr.length; x+=1){
		arr2[ctr] = arr[x];
		ctr+=1;
	    }
	    //printArray(arr1);
	    //printArray(arr2);
	}
	else{
	    for (int x = 0; x < halfL; x+=1){
		arr1[x] = arr[x];
	    }
	    for (int x = halfL + 1; x < arr.length; x+=1){
		arr2[ctr] = arr[x];
		ctr+=1;
	    }
	    //printArray(arr1);
	    //printArray(arr2);
	}
	return merge(sort(arr1), sort(arr2));
    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {


	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};

	System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	mess(arr3);
	printArray( arr3 );

	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );

	System.out.println("\nMerging arr4 and arr6: ");
	printArray( merge(arr4,arr6) );

	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );
		/*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class MergeSort



/**
 * This class maintains a list of 4 integers.
 * 
 * This list is simple and unusual in it always contains exactly the
 * same number of elements.  Later, when we know more Java, we will
 * study classes where the number of elements may vary. 
 * 
 * In this version 2, we use variables in the subscripts.
 * 
 * @author Raymond Lister 
 * @version August 2014
 * 
 */
public class ListOf4V2PartB
{
    private static final int listSize = 4;
    
    private int[] list = {0, 1, 2, 3};

    
    /**
     * A constructor for objects of class ListOf4, which takes a
     * single array parameter
     * 
     * @param  element   the initial elements for the list
     */
    public ListOf4V2PartB(int [] element)
    {   
      // with variable subscripts ... 
      list = new int[element.length];  
      for(int i = 0; i < element.length; i++){
            list[i] = element[i];
        }
        
      
    } // constructor ListOf4(int [] element)
    
    /**
     * @return     the first element in the list
     */
    public int getFirst()
    {
        return list[0];  
        
    } // method getFirst      
    
     
    /**
     * @return     A summary of the contents of the list.
     */
    public String toString()
    {
       // with variable subscripts ... 
       String s = "{" + list[0]; // role: gatherer
       int i = 0;      // role: stepper
       
       i = 1;
      s = s +", " + list[i];
      i = 2;
      s = s +", " + list[i];
      i = 3;
      s = s +", " + list[i];
              
       s = s + "}";
       
       return s;
    }
    
    /**
     * @return     the sum of the elements of the array
     */
    public int sum()
    {
       int sum = 0; // role: gatherer
        
       // with variable subscripts ... 
       int i = 0; // role: stepper
 
       sum = sum + list[i];
       i = 1;
       sum = sum + list[i];
       i = 2;
       sum = sum + list[i];
       i = 3;
       sum = sum + list[i];

       return sum;
        
    } // method sum 
    
    /**
     * @return     the number of times the replacement was made (i.e. 0 or 1)
     * 
     * @param  replaceThis   the element to be replaced
     * @param  withThis      the replacement
     */
    public int replaceOnce(int target, int num)
    {        
        // with variable subscripts ... 
        
        int count = 0; // role: stepper; number of replacements made
            
        // with variable subscripts ... 
        for(int i = 0; i < list.length; i++)
        {
            if(target ==  list[i])
            {
                list[i] = num;
                return 1;
            }
        }
 
        return count;
            
    } // method replaceOnce 
          
    
    /**
     * @return     the value of the smallest element in the array
     */
    public int minVal()
    {
        int mostWantedHolder = 0;  // role: Most-wanted holder
        
        // variable mostWantedHolder remembers the position of the
        // smallest number seen so far
        
        // with variable subscripts ... 
        for(int i = 0; i < list.length; i++){
            if(list[i] < list[mostWantedHolder]){
                mostWantedHolder = i;
            }
        }
 
        return list[mostWantedHolder];
        
       
        
    } // method minVal
           
    /**
     * Inserts an element in the first position. The elements already in the
     * list are pushed up one place, and the element that was previously
     * last is lost from the list.
     * 
     * @param  newElement   the element to be inserted
     */
    public void insertFirst(int num)
    {   
        // with variable subscripts ... 
        
        for(int i = list.length - 1; i > 0; i--)
        {            
            //temp = numbers[i];
            list[i] = list[i-1];
            //numbers[i-1] = temp;
        }
        list[0] = num;
    } // method insertFirst
     
       
    /**
     *  Swaps two elements in the list
     *  
     * @param  i   the position of one of the elements to be swapped
     * @param  j   the position of one of the elements to be swapped
     */
    public void swap(int i, int j)
    {
        int temp; // role: temporary
        
           temp = list[i];
        list[i] = list[j];
        list[j] = temp;
        
    } // method swap
       
    
    /**
     * "So the first shall be last, and the last first"
     *  -- The Christian Bible, book of Matthew 20:16
     */
    public void reverse()
    {   
       // with variable subscripts ...
       int temp;
       for(int i = 0; i < list.length /2; i++)
       {
           int j = list.length-1 -i;
           temp = list[i];
           list[i] = list[j];
           list[j] = temp;
        }
        
    } // method reverse
 
    /**
     * Orders the elements of the list, with the first element smallest and the
     * last element largest.   Does this using the selection sort algorithm.
     */
    public void sortSelection()
    {
       /* This implementation uses the selection sort algorithm. For an
        * explanation of how bubblesort works, google ...
        *            selection sort java
        */
       
       for(int i = 0; i < list.length; i++){
           for(int j = 0; j < list.length; j++){
               if(list[i] < list[j]){
                   swap(i,j);
                }
            }
        }
       
    } // method sortSelection
   
} // class ListOf4Version2
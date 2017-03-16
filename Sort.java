public class Sort
{
  /** Sort an array of integers
    * Uses    _________ Sort
    */
  public static void sortInt (int[] data)
  {

  }
  
  /** Sorts an array of Strings
    * Uses   _________ Sort
   */
  public static void sortString (String[] data)
  {
  
  }
  
  
  public static void main (String[] args)
  {
    // Integer search
    // initialize array
    int[] numbers = {30, 18, 5, 9, 27, 42, 4, 21, 92, 14, 7, 12, 39, 44};
    
    // print array; sort; print again
    for (int i : numbers) 
      System.out.print (i + "  ");  
    System.out.println();
    
    sortInt (numbers);
    
    for (int i : numbers) 
      System.out.print (i + "  ");  
    System.out.println();
    
    
    // Sort a list of Strings
    // initialize array
    String[] names = {"Fiona", "Colby", "Sara", "Anna", "Michelle", "Kate", "Savana", "Hannah",
      "Lexi", "Andrew", "Coco", "Leah", "Megan", "Jennifer", "Kathy", "Alison", "Amanda"};
    
    // print array; sort; print again
    for (String s : names) 
      System.out.print (s + "  ");  
    System.out.println();
    
    sortString (names);
      
    for (String s : names) 
      System.out.print (s + "  ");  
    System.out.println();
   
  }
}
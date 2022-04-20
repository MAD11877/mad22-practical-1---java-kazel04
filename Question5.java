import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    List<Integer> int_list = new ArrayList<Integer>();
    Scanner in = new Scanner(System.in);
    int integer = in.nextInt();
    for(int i = 0; i < integer; i++){
      int_list.add(in.nextInt()); 
    }

    // Referred from tutorialpoint
    int maxValue = 0, maxCount = 0, i, j;

      for (i = 0; i < int_list.size(); i++) {
         int count = 0;
         for (j = 0; j < int_list.size(); ++j) {
            if (int_list[j] == int_list.get(i))
            ++count;
         }

         if (count > maxCount) {
            maxCount = count;
            maxValue = int_list.get(i);
         }
    System.out.println(maxValue);
  }
}
}
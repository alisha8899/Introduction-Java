import java.util.ArrayList;
/**
 * Write a description of class ArrayListPractice here.
 *
 * @Alisha
 */
public class ArrayListPractice
{  
    public static void main (String [] args)
    {
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("Hindi");
        languages.add("Arabic");
        languages.add("Mandarin");
        languages.add("Latin");
        
        languages.add(1, "Spanish");
        languages.set(4, "Japanese");
        
        int setToLast = languages.size()-2;
        languages.set(setToLast, "Vietnamese");
        
        languages.remove("Hindi");
        
        String zero = languages.get(0);
        System.out.println(zero + "***");
        
        System.out.println(languages.toString());

        for (String p: languages)
        {
            System.out.println(p);
        }
    }
}
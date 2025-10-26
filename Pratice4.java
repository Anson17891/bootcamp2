public class Pratice4 {
    public static void main(String[] args) {
        
        //! String & Methods
        // toUpperCase(), toLowerCase(), concat(), length, isEmpty(), isBlank(), charAt(), indexOf(), lastIndexOf()
        // substring(), contain(), replace(), trim(), compareTo(), equals(), equalsInoreCase(), startsWith(), endsWith() 
        //!String + anything

        String quote1 = "The quick brown fox";
        String quote2 = "The lazy dog";
        System.out.println(quote1 + " jump over " + quote2); //String  + string
        
        double d1 = 0.9999;
        System.out.println(quote1 + d1);//String  + numbers -> String
        
        //! toUpperCase(), toLowerCase()
        System.out.println(quote1.toUpperCase());
        System.out.println(quote1.toLowerCase());
        
        //! concat() // concatenate
        System.out.println(quote1.concat(" jump over "));//combine TWO items
        System.out.println(quote1.concat(""));
        //System.out.println(quote1.concat()); //!NullPointerException
        
        System.out.println(quote1.toUpperCase()// cut the line if too long
        .concat(quote1.toLowerCase()));
        
        //! length()
        String emptyString = "";
        String spaceString = " ";
        int q1L = (quote1.length());
        System.out.println(q1L);
        System.out.println((quote1 + " jump over " + quote2).length());//complex
        System.out.println(emptyString); //print nothing (just a row)
        System.out.println(spaceString); //print space (a row w/ a space)
        
        //! isEmpty(), isBlank()
        System.out.println(emptyString.isEmpty()); // null is empty
        System.out.println(spaceString.isEmpty()); //even space is a character
        
        System.out.println(emptyString.isBlank());
        System.out.println(spaceString.isBlank()); //space is blank
        
        //! charAt()
        System.out.println(quote1.charAt(0)); // character at index(), index start at 0
        System.out.println((quote1 + " jump over " + quote2).charAt(25));
        
        //! indexOf() / lastIndexOf()
        System.out.println(quote1.indexOf("q"));  //the index of () in string
        String q1Script = "uick";
        System.out.println(quote1.indexOf(q1Script)); // () can also be a variable
        
        System.out.println(quote1.indexOf("o")); //12
        System.out.println(quote1.lastIndexOf("o")); //17
        //the index of () in string, but find from last character
        
        //! substring()
        System.out.println(quote1.substring(16)); // (x), start from index(x) to the end
        System.out.println(quote1.substring(4, 15)); //(x,y) from x to y
        
        //! contain()
        System.out.println(quote1.contains(q1Script));
        System.out.println(quote1.contains(q1Script.toUpperCase()));
        System.out.println(quote1.contains(quote1.substring(4, 15)));
        
        //! replace()
        System.out.println(quote1.replace("quick brown fox", "lazy dog")); //text to text
        System.out.println(quote1.replace(q1Script, "uacking")); // String to text
        
        //! trim()
        quote1 = "     The quick brown fox     ";
        System.out.println(quote1.trim()); //trim out space at beginning and end
        System.out.println(quote1.concat(quote2).trim()); //only beginning and end
        
        quote1 = quote1.trim();
        
        //! compareTo()
        System.out.println(quote1.compareTo(quote2));// "The " are the same, 
        //(q-l) L M N O P Q
        System.out.println(quote2.compareTo(quote1)); //(l-q) L M N O P Q
        System.out.println(quote1.replace("quick brown fox", "lazy dog")//
        .compareTo(quote2)); //if no difference, =0
        
        
        //Boolean as outcome
        //! equals()
        System.out.println(quote1.replace("quick brown fox", "lazy dog").equals(quote2));
        
        //! equalsInoreCase()
        System.out.println(quote1.replace("quick brown fox", "lazy dog").toUpperCase()//
        .equalsIgnoreCase(quote2.toLowerCase()));
        
        //! startsWith(), endsWith()  //dont forget s!
        System.out.println(quote1.startsWith("The"));
        System.out.println(quote1.startsWith("dog"));  //can be text
        System.out.println(quote1.startsWith(q1Script)); // also String
        
        
        
        
        
        
        
    
       
       
     
      
    }
}


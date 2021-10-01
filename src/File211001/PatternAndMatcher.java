package File211001;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {
    public static void main(String args[]){
        String a = "[0-9]+c";
        String b = "34259c  c";
        Pattern p = Pattern.compile(a);
        Matcher matcher = p.matcher(b);
        boolean matches = matcher.matches();
        if(matches)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}

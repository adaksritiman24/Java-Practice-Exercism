import java.util.*;
class TwelveDays {
    
    private List<String> verse_list = Arrays.asList(
        "a Partridge in a Pear Tree.",
        "two Turtle Doves, and ",
        "three French Hens, ",
        "four Calling Birds, ",
        "five Gold Rings, ",
        "six Geese-a-Laying, ",
        "seven Swans-a-Swimming, ",
        "eight Maids-a-Milking, ",
        "nine Ladies Dancing, ",
        "ten Lords-a-Leaping, ",
        "eleven Pipers Piping, ",
        "twelve Drummers Drumming, "
    );
    private List<String> on_day_list = Arrays.asList("first","second","third","fourth","fifth", "sixth","seventh","eighth","ninth","tenth","eleventh","twelfth");
    
    String give(int v_number){
        if(v_number == 0)
            return "\n";
        else
            return verse_list.get(v_number - 1) + give(v_number - 1);
    }
    
    String verse(int verseNumber) {
        
        String vss = new String("On the XXXX day of Christmas my true love gave to me: ");
        return vss.replace("XXXX", on_day_list.get(verseNumber-1)) + give(verseNumber);
    }

    String verses(int startVal, int endVal){
        StringBuffer sb = new StringBuffer();
        for(int i = startVal; i<=endVal; i++){
            sb.append( verse(i) + "\n");      
        }
        return sb.toString().substring(0,sb.length()-1);
    }
    
    String sing() {
        return verses(1, 12);
    }
}

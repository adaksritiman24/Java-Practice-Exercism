import java.util.*;
class RnaTranscription {

    private static Map<Character, Character> rnaMappings = Map.of('G','C','C','G','T','A','A','U');
    
    String transcribe(String dnaStrand) {
        
        StringBuffer RNAcomplement = new StringBuffer();
        for(char strand : dnaStrand.toCharArray()){
            RNAcomplement.append(rnaMappings.get(strand));
        }
        return RNAcomplement.toString();
    }

}

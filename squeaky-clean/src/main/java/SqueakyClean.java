class SqueakyClean {
    static String clean(String identifier) {
        String kebabCleaned = kebabToCamel(identifier);
        return kebabCleaned.replaceAll(" ", "_") //replace spaces
                            .replaceAll("[α-ω]","") //remove lowercase greek alphabets
                            .replaceAll("\\p{Cntrl}", "CTRL") //replace control statements
                            .replaceAll("[^\\p{L}\\p{P}]", "");  //remove non-letters and non-punctuations
    }
    static String kebabToCamel(String string){ //convert kebab to camel case
        StringBuilder builder = new StringBuilder(string);
        for(int i = 0; i< builder.length(); i++){
            if(builder.charAt(i) == '-'){
                builder.deleteCharAt(i);
                builder.replace(i, i+1, String.valueOf( builder.charAt(i) ).toUpperCase() );
            }
        }
        return builder.toString();
    }
}

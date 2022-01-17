public class LogLevels {
    
    public static String message(String logLine) {
        if(logLevel(logLine).equals("error"))
            return logLine.substring(8).strip();

        else if(logLevel(logLine).equals("warning"))
            return logLine.substring(10).strip();

        else
            return logLine.substring(7).strip();        
    }

    public static String logLevel(String logLine) {
        if(logLine.startsWith("[ERROR]"))
            return "error";
            
        else if(logLine.startsWith("[WARNING]"))
            return "warning";

        return "info";  
    }

    public static String reformat(String logLine) {
        return message(logLine)+" ("+logLevel(logLine)+")";
    }
}

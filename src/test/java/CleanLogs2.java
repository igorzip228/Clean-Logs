import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CleanLogs2 {
    public static void main(String[] args) throws IOException {
        String logs = getTextFromFile("/home/qa-1/Загрузки/Logs.txt");
        System.out.println(logs);
//        Pattern regexLog = Pattern.compile("(^.{3})  ?([1-3]?[0-9]  ?.{8} ).*(Activity: ?).*Time:.*(\\[Mapping Ids: .*?]).*(\\[URI.*?])");
//        for (String lg : severalLogs(logs)) {
//            Matcher m = regexLog.matcher(lg);
//
//            if (m.find()) {
//                System.out.println(lg.replaceAll(String.valueOf(regexLog), "$1$2$3$4$5"));
//            }
        }
//    }


    public static String getTextFromFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
//
//    public static String[] severalLogs(String text) {
//        return text.split("\\n");
//    }
}

import com.sun.javafx.scene.paint.MaterialHelper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CleanLogs {
    public static void main(String[] args) {

    }
//функция принимает одну строку логов и очищает ее
    private String trimActivity(String activity) {
        StringBuilder cleanActivity = new StringBuilder();
        cleanActivity.append(activity.substring(0, activity.indexOf("sky")));
        cleanActivity.append("Activity:" );

        String[] fieldNames = {"Login Username", "Data Object", "Recirds", "User Action", "User Action Status",
                "Labels", "Service type", "Mapping Ids", "URI"};

        Matcher matcher;
        for (String field : fieldNames) {
            matcher = Pattern.compile("\\[" + field + ":[^\\]]+(?:\\] )?");
            if (matcher.find())
                cleanActivity.append(matcher.group(0));
        }

        return cleanActivity.toString();
    }

}changed
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Scenario1 {
    public static Map<String, Integer> totalMatchesPlayedPerYear(List<MatchData> matches) {
        Map<String, Integer> everyYear = new HashMap<>();
        matches.remove(0);
        for (MatchData i : matches) {
            if (everyYear.containsKey(i.getSeason())) {
                int count = everyYear.get(i.getSeason());
                everyYear.replace(i.getSeason(), count + 1);
            }
            else {
                everyYear.put(i.getSeason(),1);
            }
        }
        return everyYear;
    }

}



import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Number of matches won of all teams over all the years of IPL.
public class Scenario2 {

    public static Map<String,Integer> matcheWonAllteams(List<MatchData> matches)
    {
        Map<String,Integer> everyMatch = new HashMap<>();
        for(MatchData i:matches)
        {
            if (everyMatch.containsKey(i.getWinner()))
            {
                int count = everyMatch.get(i.getWinner());
                everyMatch.replace(i.getWinner(), count + 1);
            }
            else
            {
                everyMatch.put(i.getWinner(), 1);
            }
        }
        return everyMatch;
    }
}


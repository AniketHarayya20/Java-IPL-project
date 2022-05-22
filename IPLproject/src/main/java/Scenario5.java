import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scenario5 {
public static Map<String,Integer> WinbatWinBall(List<MatchData> matches)
{
    Map<String,Integer> WinBB = new HashMap<>();
    for(MatchData m:matches)
    {
        if(WinBB.containsKey(m.getToss_winner()))
        {
           int count = WinBB.get(m.getToss_winner()) ;
            WinBB.replace(m.getToss_winner(),count+1);
        }
        else
        {
            WinBB.put(m.getToss_winner(),1);
        }
    }
    return WinBB;
}
}

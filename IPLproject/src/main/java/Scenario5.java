import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scenario5 {
public static Map<String,Integer> WinbatWinBall(List<MatchData> matches) {
    Map<String,Integer> winByBatBall = new HashMap<>();
    for(MatchData m:matches) {
        if(winByBatBall.containsKey(m.getToss_winner())) {
           int count = winByBatBall.get(m.getToss_winner()) ;
            winByBatBall.replace(m.getToss_winner(),count+1);
        }
        else {
            winByBatBall.put(m.getToss_winner(),1);
        }
    }
    return winByBatBall;
}
}

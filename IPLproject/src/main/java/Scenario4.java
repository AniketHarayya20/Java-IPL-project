import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scenario4 {
    public static Map<String,Float> EconomicalBowler(List<MatchData> matches, List<DeliveryData> delivery) {
        Map<String,Integer> bowlerBall = new HashMap<>();
        Map<String,Integer> bowlerRuns = new HashMap<>();
        List<String> newS= new ArrayList<>();

        for(MatchData m:matches) {
            if(m.getSeason().equals("2015")) {
                newS.add(m.getId());
            }
        }
        for(DeliveryData d:delivery) {
            if(newS.contains(d.getMatch_id())) {
                int totalRuns=Integer.parseInt(d.getTotal_runs());
                if(bowlerRuns.containsKey(d.getBowler())) {
                    int count = bowlerRuns.get(d.getBowler());
                    bowlerRuns.replace(d.getBowler(), count+totalRuns);
                }
                else {
                    bowlerRuns.put(d.getBowler(),totalRuns);
                }
            }
        }
        for(DeliveryData d:delivery) {
            if(newS.contains(d.getMatch_id())) {
                if(bowlerBall.containsKey(d.getBowler())) {
                    int count = bowlerBall.get(d.getBowler());
                    bowlerBall.replace(d.getBowler(), count+1);
                }
                else {
                    bowlerBall.put(d.getBowler(),1);
                }
            }
        }
        HashMap<String,Float> economy = new HashMap<>();
        for(String s :bowlerBall.keySet()) {
            economy.put(s,(float) bowlerRuns.get(s)/(bowlerBall.get(s)/6));
        }
        return economy;
    }
}

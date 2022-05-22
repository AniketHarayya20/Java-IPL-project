import java.util.*;

//For the year 2016 get the extra runs conceded per team.
public class Scenario3 {
    public static Map<String,Integer> extraRunsPerTeam(List<MatchData> matches,List<DeliveryData> delivery) {
        Map<String,Integer> extraRunsByTeam = new HashMap<>();
        List<String> similarID = new ArrayList<>();
        for(MatchData i:matches) {
            if(i.getSeason().equals("2016")) {
                similarID.add(i.getId());
            }
        }
        for(DeliveryData d:delivery) {
            if(similarID.contains(d.getMatch_id())) {
                if(extraRunsByTeam.containsKey(d.getBowling_team()) &&  !d.getBowling_team().equals("0")) {
                    int count = extraRunsByTeam.get(d.getBowling_team())+Integer.parseInt(d.getExtra_runs());
                    extraRunsByTeam.replace(d.getBowling_team(),count);
                }
                else if(!extraRunsByTeam.containsKey(d.getBowling_team()) &&  !d.getBowling_team().equals("0")) {
                    extraRunsByTeam.put(d.getBowling_team(),Integer.parseInt(d.getExtra_runs()));
                }
            }
        }
        return extraRunsByTeam;
    }

}


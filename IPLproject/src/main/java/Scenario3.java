import java.util.*;

//For the year 2016 get the extra runs conceded per team.
public class Scenario3 {

    public static Map<String,Integer> extraRunsPerTeam(List<MatchData> matches,List<DeliveryData> delivery) {
        Map<String,Integer> erbt = new HashMap<>();
        List<String> similarID = new ArrayList<>();

        for(MatchData i:matches) {
            if(i.getSeason().equals("2016")) {
                similarID.add(i.getId());
            }
        }

        for(DeliveryData d:delivery)
        {
//            System.out.println(similarID.contains(d.getMatch_id()));
            if(similarID.contains(d.getMatch_id()))
            {
//                System.out.println("Sjbybf"+d);
                if(erbt.containsKey(d.getBowling_team()) &&  !d.getBowling_team().equals("0")) {
                    int count = erbt.get(d.getBowling_team())+Integer.parseInt(d.getExtra_runs());
                    erbt.replace(d.getBowling_team(),count);
                }
                else if(!erbt.containsKey(d.getBowling_team()) &&  !d.getBowling_team().equals("0")) {
                    erbt.put(d.getBowling_team(),Integer.parseInt(d.getExtra_runs()));
                }
            }
        }
        return erbt;
    }

}


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class IPLMainClass {
    private static int season=1;

    private static int id=0;
    private static  int winner=10;
    private static int extra_runs=16;

    private static int match_id=0;

    private static  int batting_team=2;

    private static int bowling_team=3;

    private static int toss_winner=7;

    private static int bowler=8;

    public static void main (String []args)
    {

        List<DeliveryData> deliveries =new ArrayList<>();
        List<MatchData> matches = new ArrayList<>();

        Scenario1 s1= new Scenario1();
        Scenario2 s2= new Scenario2();
        Scenario3 s3= new Scenario3();
        Scenario5 s5 = new Scenario5();

        try {
            FileReader fr1 = new FileReader("src/main/java/deliveries.csv");
            BufferedReader br1 = new BufferedReader(fr1);
            String line="";
            while ((line = br1.readLine()) != null)
            {
                String[] data = line.split(",");
                DeliveryData delivery = new DeliveryData();


                delivery.setExtra_runs(data[extra_runs]);
                delivery.setBatting_team(data[batting_team]);
                delivery.setMatch_id(data[match_id]);
                delivery.setBowling_team(data[bowling_team]);
                deliveries.add(delivery);
            }
            fr1.close();
            br1.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }


        try
        {
            FileReader fr = new FileReader("src/main/java/matches.csv");
            BufferedReader br = new BufferedReader(fr);
            String line="";
            while ((line = br.readLine()) != null)
            {
                String[] data = line.split(",");
                MatchData match = new MatchData();


                match.setSeason(data[season]);
                match.setWinner(data[winner]);
                match.setToss_winner(data[toss_winner]);
                match.setId(data[id]);


                matches.add(match);
            }
            br.close();
            fr.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }


        System.out.println(s1.totalMatchesPlayedPerYear(matches));
        System.out.println(s2.matcheWonAllteams(matches));
        System.out.println(s3.extraRunsPerTeam(matches,deliveries));

        System.out.println(s5.WinbatWinBall(matches));

    }

}

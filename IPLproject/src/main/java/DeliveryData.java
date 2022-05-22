public class DeliveryData {



    private String extra_runs;
    private String match_id;
    private String batting_team;

    private String bowler;

    private String total_runs;

    private String bowling_team;

    public String getExtra_runs()
    {
        return extra_runs;
    }

    public void setExtra_runs(String extra_runs)
    {
        this.extra_runs=extra_runs;
    }

    public String getMatch_id()
    {
        return match_id;
    }
    public void setMatch_id(String match_id)
    {
        this.match_id=match_id;
    }

    public void setBatting_team(String batting_team)
    {
        this.batting_team = batting_team;
    }


    public String getBowling_team() {
        return bowling_team;
    }

    public void setBowling_team(String bowling_team) {
        this.bowling_team = bowling_team;
    }

    public String getBowler() {
        return bowler;
    }

    public void setBowler(String bowler) {
        this.bowler = bowler;
    }

    public String getTotal_runs() {
        return total_runs;
    }

    public void setTotal_runs(String total_runs) {
        this.total_runs = total_runs;
    }
}

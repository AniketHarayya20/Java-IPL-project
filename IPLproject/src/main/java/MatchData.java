//Scenario 1 : Number of matches played per year of all the years in IPL.
public class MatchData {
    private String season;
    private String winner;

    private String toss_winner;


    private String id;


    public String getSeason()
    {

        return season;
    }

    public void setSeason(String season)

    {
        this.season = season;
    }

    public String getWinner()
    {
        return winner;
    }

    public void setWinner(String winner)
    {
        this.winner = winner;
    }

    public String getId()

    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getToss_winner() {
        return toss_winner;
    }

    public void setToss_winner(String toss_winner) {
        this.toss_winner = toss_winner;
    }
}

class Team {

    private String name;
    private int rank;
    private String teamName;

    public Team(String tempName) {

        this.teamName = tempName;

    }

    public void setRank(int newRank) {

        this.rank = newRank;
    }

    public String toString() {

        return "TeamName: " + this.teamName + ", TeamRank: " + this.rank;

    }

}
public class Team {

    String teamName;
    Friend[] teamMembers = new Friend[4];


    public Team(String teamName, Friend[] teamMembers){
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public String getTeamName(){
        return "Team name: "+ teamName;
    }

    public Friend[] getMembers(){
        return teamMembers;
    }

    public void showResults(){
        for(Friend c: teamMembers){
            c.showResult();
        }
    }

    public void showMembersFinishedCourse(){
        for(Friend c: teamMembers){
            if(c.isOnDistance())
                c.showResult();
        }
    }

}

public class Course {
    Obstacle[] obstacles;

    public Course(Obstacle[] obstacles){
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        Friend[] teamMembers = team.getMembers();
        if(teamMembers.length > 0){
            for (Friend c: teamMembers){
                for (Obstacle o: obstacles){
                    o.doIt(c);
                    if (!c.isOnDistance()) break;
                }
            }
        } else {
            System.out.println("Нет членов команды");
        }
    }



}

public class HM1 {

    public static void main(String[] args) {
        Friend[] friends = {new Wolf("Боб"), new Cat("Барсик"), new Dog("Бобик"), new Turtle("Карл")};
        Team team = new Team("Чемпионы",friends);
        Obstacle[] obstacles = {new Run(400), new Jump(2), new Swim(5)};


        System.out.println(team.getTeamName());

        System.out.println("Члены команды: ");
        team.showResults();

        Course course = new Course(obstacles);

        System.out.println("Препядствия");
        course.doIt(team);

        System.out.println("Резульаты прохождения");
        team.showResults();

        System.out.println("Члены команды прошедшие прерядствия");
        team.showMembersFinishedCourse();


    }


}






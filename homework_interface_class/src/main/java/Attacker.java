public class Attacker extends Player implements IShoot {

    private int goalsScored;

    public Attacker(String position) {
        super(position);
        this.goalsScored = 0;
    }

    public int getGoalsScored(){
        return goalsScored;
    }

    public void shoot(int goal) {
        goalsScored += goal;

    }
}


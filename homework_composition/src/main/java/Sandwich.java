public class Sandwich {
    private String name;
    private Bread bread;
    private Ham ham;


    public Sandwich( Bread bread, Ham ham, String name){
        this.bread = bread;
        this.ham = ham;
        this.name = name;
    }


    public Bread getBread(){
        return this.bread;
    }

    public Ham getHam(){
        return this.ham;
    }

    public String getName() {
        return this.name;
    }
}

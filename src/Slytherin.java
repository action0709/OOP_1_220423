public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustPower;
    public Slytherin (String name, int conjure, int transgress, int trick, int determination,
                      int ambition,int resourcefulness,int lustPower) {
        super(name,conjure, transgress);
        this.trick = trick;
        this.determination=determination;
        this.ambition=ambition;
        this.resourcefulness=resourcefulness;
        this.lustPower=lustPower;
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustPower() {
        return lustPower;
    }

    public int sumforcesSlytherin () {

        return  trick+determination+ambition+resourcefulness+lustPower;
    }
    public void comparisonSlytherin (Slytherin student){
        if (student.sumforcesSlytherin()>this.sumforcesSlytherin()){
            System.out.printf(" %s лучший Слизеринец, чем %s",student.getName(),this.getName());
        }
        else if (student.sumforcesSlytherin()<this.sumforcesSlytherin()){
            System.out.printf(" %s лучший Слизеринец, чем %s",this.getName(),student.getName());
        }
        else{
            System.out.printf("Результат %s равен %s",this.getName(),student.getName());
        }}

    @Override
    public String toString() {
        return this.getName() +
                " - Слизеринец {"
                + "conjure="+this.getConjure()+", transgress="
                + getTransgress()+
                "trick=" + trick +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustPower=" + lustPower +
                '}';
    }
}

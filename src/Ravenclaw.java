public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;


    public Ravenclaw(String name, int conjure, int transgress, int smart, int wise, int witty, int creativity) {
        super(name, conjure, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }
    public int sumforcesRavenclaw () {

        return  smart+wise+witty+creativity;
    }
    public void comparisonRavenclaw (Ravenclaw student){
        if (student.sumforcesRavenclaw()>this.sumforcesRavenclaw()){
            System.out.printf(" %s лучший Когтевранец, чем %s",student.getName(),this.getName());
        }
        else if (student.sumforcesRavenclaw()<this.sumforcesRavenclaw()){
            System.out.printf(" %s лучший Когтевранец, чем %s",this.getName(),student.getName());
        }
        else{
            System.out.printf("Результат %s равен %s",this.getName(),student.getName());
        }}

    @Override
    public String toString() {
        return this.getName() +
                " - Когтевранец {"
                + "conjure="+this.getConjure()+", transgress="
                + getTransgress()+
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                '}';
    }
}

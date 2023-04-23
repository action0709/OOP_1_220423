public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;
        public Gryffindor(String name, int conjure, int transgress, int nobility, int honor, int bravery) {
        super(name, conjure, transgress);
        this.nobility = nobility;
            this.honor=honor;
            this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
    public int sumforcesGriffindor () {

        return  nobility + honor + bravery;
    }
    public void comparisonGriffindor (Gryffindor student){
        if (student.sumforcesGriffindor()>this.sumforcesGriffindor()){
            System.out.printf(" %s лучший Гриффиндорец, чем %s",student.getName(),this.getName());
        }
        else if (student.sumforces()<this.sumforces()){
            System.out.printf(" %s лучший Гриффиндорец, чем %s",this.getName(),student.getName());
        }
        else{
            System.out.printf("Результат %s равен %s",this.getName(),student.getName());
        }}

    @Override
    public String toString() {
        return this.getName() +
                " - Гриффиндорец {"
                + "conjure="+this.getConjure()+", transgress="
                + getTransgress()+
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}

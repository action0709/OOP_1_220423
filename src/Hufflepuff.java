public class Hufflepuff extends Hogwarts {

    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int conjure, int transgress, int hardworking, int loyal, int honest) {
        super(name, conjure, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }
    public int sumforcesHufflepuff () {

        return  hardworking+loyal+honest;
    }
    public void comparisonHufflepuff (Hufflepuff student){
        if (student.sumforcesHufflepuff()>this.sumforcesHufflepuff()){
            System.out.printf(" %s лучший Пуффендуец, чем %s",student.getName(),this.getName());
        }
        else if (student.sumforcesHufflepuff()<this.sumforcesHufflepuff()){
            System.out.printf(" %s лучший Пуффендуец, чем %s",this.getName(),student.getName());
        }
        else{
            System.out.printf("Результат %s равен %s",this.getName(),student.getName());
        }}

    @Override
    public String toString() {
        return this.getName() +
                " - Пуффендуец {"
                + "conjure="+this.getConjure()+", transgress="
                + getTransgress()+
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }
    //    public String toString() {
//        return this.getName() +
//                " - Пуффендуец {"
//                + "conjure="+this.getConjure()+", transgress="
//                + getTransgress()+
//                ", nobility=" + nobility +
//                ", honor=" + honor +
//                ", bravery=" + bravery +
//                '}';
//    }
}

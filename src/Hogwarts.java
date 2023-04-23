public  class  Hogwarts {
    private String name;
    private int conjure;
    private int transgress;

    public Hogwarts(String name, int conjure, int transgress){
        this.name = name;
        this.conjure = conjure;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public int getConjure() {
        return conjure;
    }

    public int getTransgress() {
        return transgress;
    }

    public int sumforces () {

        return conjure + transgress;
    }

    public void comparisonHogwarts (Hogwarts student){
      if (student.sumforces()>this.sumforces()){
          System.out.printf("Результат %s лучше, чем %s",student.getName(),this.getName());
      }
          else if (student.sumforces()<this.sumforces()){
              System.out.printf("Результат %s лучше, чем %s",this.getName(),student.getName());
          }
              else{
                  System.out.printf("Результат %s равен %s",this.getName(),student.getName());
              }}
      }



import java.util.Random;
public class Main {

    public static void main(String[] args) {
//        int[] arr = new int[200];
      Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//
////        }


        Gryffindor Harri = new Gryffindor("Гарри Поттер", 100, 90, 50,
                80, 70);
        Gryffindor Germiona = new Gryffindor("Гермиона Грейнджер ", 80, 80, 50,
                80, 70);
        Gryffindor Ron = new Gryffindor("Рон Уизли ", 60, 80, 40,
                80, 50);
        Slytherin Draco = new Slytherin("Драко Малфой ", 60, 80, 40,
                80, 50, 60,70);
        Slytherin Grahem = new Slytherin("Грэхэм Монтегю", random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));
        Slytherin Gregory = new Slytherin(" Грегори Гойл", random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100));
        Hufflepuff  Zaharia = new Hufflepuff("Захария Смит", random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
               );
        Hufflepuff  Sedric = new Hufflepuff("Седрик Диггори", random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
                );
        Hufflepuff  Justin= new Hufflepuff("Джастин Финч-Флетчли", random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
                );
        Ravenclaw  Jou= new Ravenclaw("Чжоу Чанг", random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
                );
        Ravenclaw  Padma= new Ravenclaw("Падма Патил ", random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
                );
        Ravenclaw  Marcus= new Ravenclaw("Маркус Белби", random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
                );

        System.out.println();
        System.out.println(Harri);
        System.out.println();
        System.out.println(Draco);
        System.out.println();
        System.out.println(Zaharia);
        System.out.println();
        System.out.println(Padma);
        System.out.println();
        Harri.comparisonHogwarts(Marcus);
        System.out.println();
        Harri.comparisonGriffindor(Germiona);
        System.out.println();
        Zaharia.comparisonHufflepuff(Sedric);
        System.out.println();
        Jou.comparisonRavenclaw(Padma);
        System.out.println();
        Draco.comparisonSlytherin(Gregory);

            }
}
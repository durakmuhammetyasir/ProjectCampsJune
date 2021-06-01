package playlist2.day2Homework2Video24_35.video24Methods.listingPerformers;

import playlist2.day2Homework2Video24_35.video24Methods.hierarchy.*;

public class PerformerArrayDemo {
    public static void main(String... args) {
        Performer[] array = new Performer[2];
        for (int i = 0; i < array.length; ++i) {
            System.out.println("performer[" + i + "]= " + array[i] );
        }

        array[0] = new  Performer("John", 40, 1.91f, Gender.MALE);
        array[1] = new  Performer("Julianna", 35, 1.61f, Gender.FEMALE);

        for (int i = 0; i < array.length; ++i) {
            System.out.println("performer[" + i + "]= " + array[i].getName() );
        }

        Performer david = new  Performer("David", 55, 1.81f, Gender.MALE);
        array[1] = david;

        for (int i = 0; i < array.length; ++i) {
            System.out.println("performer[" + i + "]= " + array[i].getName() );
        }
    }
}

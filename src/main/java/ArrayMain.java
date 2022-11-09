import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {
        // #1
        int[] subjects = new int[10];

        // #2
        int[] oldArray = {54, 73, -10, 0};

        //manually
//        int[] newArray = new int[oldArray.length + 1];
//        for (int i = 0; i < oldArray.length; i++) {
//            newArray[i] = oldArray[i];
//        }
        //automatically

        subjects[0] = 3456789;
        System.out.println(subjects[0]);

        //1 arrays aren't resizable
        int[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);

        //2 arrays are objects
        String x = Arrays.toString(subjects);
        System.out.println(x);
        boolean equals = Arrays.equals(newArray, oldArray);

        //2D arrays
        /*
            0 1
            0 0
         */
        //#1
        int[][] picture = new int[2][2];
        picture[0][0] = 0;
        picture[0][1] = 1;
        picture[1][0] = 0;
        picture[1][1] = 0;

        //#2
        int[][] picture2 = {
                new int[]{0, 1},
                new int[]{0, 0}
        };

        System.out.println("=============");
        for (int i = 0; i < picture2.length; i++) {
            System.out.println(Arrays.toString(picture2[i]));
        }
        System.out.println("=============");


    }

}

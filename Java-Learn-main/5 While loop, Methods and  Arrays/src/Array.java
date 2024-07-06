public class Array {
    public static void main(String[] args) {
//        First Method
//        int[] myArr = new int[5];
//        myArr[0] = 98;
//        myArr[1] = 2;
//        myArr[2] = 8;
//        myArr[3] = 65;
//        myArr[4] = 37;


//        Second Method
        int[] myArr = {98, 2, 8, 65, 37};
        int index = 0;

        System.out.println(myArr[index]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);


        // Array Traversal
        while (index < myArr.length) {
            System.out.println(myArr[index]);
            index++;
        }


        String[] strArr = new String[4];
        strArr[0] = "My String";
        System.out.println(strArr[0]);

        String[] newStrArr = {"first", "second", "third"};
        System.out.println(newStrArr.length);
        System.out.println(newStrArr[2]);
    }
}







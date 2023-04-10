package chap_06;

public class _01_Generics {
    public static void main(String[] args) {
        Integer[] iarray = {1,2,3,4};
        Double[] darray ={1.0,2.0,3.0,4.0};
        String[] sarray = {"a","b","c","d","e"};
        //integer, Double은 원시타입을 객체로 만드는 wrapper
        //이는 int나 double과는 다른 타입이 됨
        printIntArray(iarray);
        printDoubleArray(darray);
        printStringArray(sarray);
        System.out.println("---------------");
        printAnyArray(iarray);
        printAnyArray(darray);
        printAnyArray(sarray);
        //제네릭스에서 지원하는건 타입형뿐임
    }
    //T :type , K :key, V : value, E : Element
    private static <T> void printAnyArray(T[] array){
        for (T i:array
        ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sarray) {
        for (String i:sarray
        ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] darray) {
        for (double i:darray
        ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iarray) {
        for (int i:iarray
             ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}

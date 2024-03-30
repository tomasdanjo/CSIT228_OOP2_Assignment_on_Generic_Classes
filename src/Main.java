import Arithmetic.Arithmetic;
import Map.MyMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       MyMap<Integer, String> map = new MyMap<>();
       map.put(0,"Thomas");
       map.put(1,"Danjo");
       map.put(2,"Manulat");
       for(int i=0;i<3;i++){
           System.out.print(map.get(i)+" ");
       }
        System.out.println();

       long num1 = 100;
       int num2 = 0;
       Arithmetic arithmetic = new Arithmetic(num1,num2);

        System.out.println(arithmetic.add());
        System.out.println(arithmetic.subtract());
        System.out.println(arithmetic.multiply());
        try {

            System.out.println(arithmetic.divide());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println(arithmetic.getMax());
        System.out.println(arithmetic.getMin());


    }
}
public class Tracker {
    private Number[] numbers = new Number[100];
    private int ids = 1;
    private int size = 0;

    public Number addNumber(Number number) {
     number.setId(ids++);
     numbers[size++] = number;
     return number;
     }

     public void FindAll(Number number){
        for (Number  x : numbers ){
            System.out.println(x);
        }
     }
}

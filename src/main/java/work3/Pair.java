package work3;


//TASK 3

public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(123, "ЙЦУК123QWER");
        Pair<Double, Boolean> p2 = new Pair<>(9.99, true);

        System.out.println("Соединение : " + p1.toString());
        System.out.println("Первое значение: " + p2.getFirst());
        System.out.println("Второе значение: " + p2.getSecond());
    }
}
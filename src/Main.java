package src;

public class Main {
    public static void main(String[] args) {
        Array<String> dynamic_array = new Array<String>();

        dynamic_array.add("12");
        dynamic_array.add("11");
        dynamic_array.add("10");
        dynamic_array.add("9");
        dynamic_array.add("8");
        dynamic_array.add("7");
        dynamic_array.add("6");
        dynamic_array.add("5");
        dynamic_array.add("4");
        dynamic_array.add("3");
        dynamic_array.add("2");
        dynamic_array.add("1");

        System.out.println(dynamic_array);

        dynamic_array.remove("1");

        System.out.println(dynamic_array);

        dynamic_array.removeAt(dynamic_array.size() - 1);

        System.out.println(dynamic_array);
    }
}

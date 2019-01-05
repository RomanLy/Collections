public class App {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 100; i++)arrayList.add(i);
        System.out.println(arrayList.contains(89));
        arrayList.remove(54);
        arrayList.set(24, 5454546);
        arrayList.print();
    }
}

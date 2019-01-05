public class ArrayList {

    private int capacity = 10;
    private int[] array = new int[capacity];


    public void add(int o){
        if (checkNull(array) == 1) {
            changeCapasity(capacity);
            array = rewrite(array);
            array[checkNull(array)] = o;
        }
            else array[checkNull(array)] = o;
    }
    public void remove(int index){
        array[index] = 0;
    }
    public void clear(){
        for (int i = 0; i < array.length; i++){
            array[i] = 0;
        }
    }
    public void set(int index, int o){
        array[index] = o;

    }
    public boolean contains(int o){
        for (int i = 0; i < array.length; i++){
            if (array[i] == o) return true;
        }
        return false;
    }


    private void changeCapasity(int capasity){
        this.capacity = ((capasity * 3) / 2) + 1;
    }
    private int checkNull(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0) return i;
        }
        return 1;
    }
    private int[] rewrite(int[] array) {
        int newArray[] = new int[capacity];
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }
    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] " + array[i]);
        }
    }
}

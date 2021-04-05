package Iterator;

public class Main {

    public static void main(String[] args) {
        final String[] elements = {"В НОРМЕ: маслецо", "ПРОСРОЧЕНО: колбаса", "В НОРМЕ: огурчики", "ПРОСРОЧЕНО: булочки"};
        final MyIterator<String> iterator = new MyIterator<>(elements);
        while (iterator.hasNext()){
            final String next = iterator.next();
            if (next.startsWith("ПРОСРОЧЕН")) {
                iterator.remove();
            }
            //System.out.println(next);
        }
        for (String element : elements){
            System.out.println(element);
        }
    }
}

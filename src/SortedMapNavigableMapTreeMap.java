import java.util.TreeMap;

public class SortedMapNavigableMapTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(12, "Фёдор");
        map.put(29, "Олег");
        map.put(16, "Иван");
        map.put(20, "Николай");
        map.put(15, "Настя");
        map.put(18, "Пётр");
        map.put(27, "Денис");

        System.out.println(map.firstKey()); // возвращает ключ первого элемента отображения
        System.out.println(map.lastKey()); // возвращает ключ последнего элемента отображения
        System.out.println(map.headMap(20)); // возвращает отображение SortedMap, которые содержит все элементы
        // оригинального SortedMap вплоть до элемента с ключом end
        System.out.println(map.tailMap(15)); // возвращает отображение SortedMap, которые содержит все элементы
        // оригинального SortedMap, начиная с элемента с ключом start
        System.out.println(map.subMap(16, 27)); // возвращает отображение SortedMap, которые содержит все элементы оригинального
        // SortedMap вплоть от элемента с ключом start до элемента с ключом end

        System.out.println(map.ceilingEntry(23)); // возвращает элемент с наименьшим ключом k, который больше или равен ключу obj
        // (k >=obj). Если такого ключа нет, то возвращается null
        System.out.println(map.floorEntry(16)); // возвращает элемент с наибольшим ключом k, который меньше или равен ключу obj (k <=obj).
        // Если такого ключа нет, то возвращается null
        System.out.println(map.higherEntry(20)); // возвращает элемент с наименьшим ключом k, который больше ключа obj (k >obj).
        // Если такого ключа нет, то возвращается null
        System.out.println(map.lowerEntry(20)); // возвращает элемент с наибольшим ключом k, который меньше ключа obj (k <obj).
        // Если такого ключа нет, то возвращается null
        System.out.println(map.firstEntry()); // возвращает первый элемент отображения
        System.out.println(map.lastEntry()); // возвращает последний элемент отображения
        System.out.println(map.pollFirstEntry()); // возвращает и одновременно удаляет первый элемент из отображения
        System.out.println(map.pollLastEntry()); // возвращает и одновременно удаляет последний элемент из отображения
        System.out.println(map);
        System.out.println(map.ceilingKey(19)); // возвращает наименьший ключ k, который больше или равен ключу obj (k >=obj).
        // Если такого ключа нет, то возвращается null
        System.out.println(map.floorKey(19)); // возвращает наибольший ключ k, который меньше или равен ключу obj (k <=obj).
        // Если такого ключа нет, то возвращается null
        System.out.println(map.lowerKey(16)); // возвращает наибольший ключ k, который меньше ключа obj (k <obj).
        // Если такого ключа нет, то возвращается null
        System.out.println(map.higherKey(19)); // возвращает наименьший ключ k, который больше ключа obj (k >obj).
        // Если такого ключа нет, то возвращается null
        System.out.println(map.descendingKeySet()); // возвращает объект NavigableSet, который содержит все ключи
        // отображения в обратном порядке
        System.out.println(map.descendingMap()); // возвращает отображение NavigableMap, которое содержит все элементы
        // в обратном порядке
        System.out.println(map.navigableKeySet()); // возвращает объект NavigableSet, который содержит все ключи отображения
        System.out.println(map.headMap(27,true)); // возвращает отображение NavigableMap, которое содержит все
        // элементы оригинального NavigableMap вплоть от элемента с ключом upperBound. Параметр incl при значении true указывает,
        // что элемент с ключом upperBound также включается в выходной набор
        System.out.println(map.tailMap(16)); // возвращает отображение NavigableMap, которое содержит все элементы
        // оригинального NavigableMap, начиная с элемента с ключом lowerBound. Параметр incl при значении true указывает,
        // что элемент с ключом lowerBound также включается в выходной набор
        System.out.println(map.subMap(16,false,20,true)); // возвращает отображение NavigableMap,
        // которое содержит все элементы оригинального NavigableMap от элемента с ключом lowerBound до элемента с ключом upperBound.
        // Параметры lowIncl и highIncl при значении true включают в выходной набор элементы с ключами lowerBound и upperBound
        // соответственно

    }
}

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapHashMapLinkedHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(23, "Иван"); //помещает в коллекцию новый объект с ключом k и значением v. Если в коллекции уже есть объект
        // с подобным ключом, то он перезаписывается. После добавления возвращает предыдущее значение для ключа k,
        // если он уже был в коллекции. Если же ключа еще не было в коллекции, то возвращается значение null
        hashMap.put(45, "Саша");
        hashMap.put(67, "Петя");

        System.out.println(hashMap);

        hashMap.clear(); // очищает коллекцию
        System.out.println(hashMap);

        hashMap.put(23, "Иван");
        hashMap.put(45, "Саша");
        hashMap.put(67, "Петя");
        hashMap.put(32, "Игорь");
        hashMap.put(90, "Василий");
        hashMap.put(87,"Алексей");
        hashMap.put(30, "Василий");


        System.out.println(hashMap.containsKey(90)); // возвращает true, если коллекция содержит ключ k

        System.out.println(hashMap.containsValue("Саша")); // возвращает true, если коллекция содержит значение v

        System.out.println(hashMap.entrySet()); // возвращает набор элементов коллекции. Все элементы представляют объект Map.Entry

        System.out.println(hashMap.get(90).equals(hashMap.get(67)));
        System.out.println(hashMap.get(90).equals(hashMap.get(30))); // возвращает true, если коллекция идентична коллекции, передаваемой через параметр obj

        System.out.println(hashMap.isEmpty()); // возвращает true, если коллекция пуста

        System.out.println(hashMap.get(87)); //  возвращает значение объекта, ключ которого равен k. Если такого элемента не окажется, то возвращается значение null

        System.out.println(hashMap.getOrDefault(87, "Григорий")); // возвращает значение объекта, ключ которого равен k. Если такого элемента не окажется,
        // то возвращается значение defaultVlue

        System.out.println(hashMap.keySet()); // возвращает набор всех ключей отображения

        System.out.println(hashMap.values()); // возвращает набор всех значений отображения

        System.out.println(hashMap.putIfAbsent(49, "Пётр")); // помещает в коллекцию новый объект
        // с ключом k и значением v, если в коллекции еще нет элемента с подобным ключом.
        System.out.println(hashMap);

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(98, "Фёдор");
        map.put(70, "Евлампий");

        hashMap.putAll(map); // добавляет в коллекцию все объекты из отображения map

        System.out.println(hashMap.remove(45)); // удаляет объект с ключом k

        System.out.println(hashMap.size()); // возвращает количество элементов коллекции

        for (Map.Entry<Integer, String> entry: hashMap.entrySet()){
            System.out.println(entry.getKey() // возвращает ключ объекта отображения
                    + " " + entry.getValue() // возвращает значение объекта отображения

                    + " " + entry.hashCode() // возвращает хеш-код данного объекта
                    + " " + entry.setValue("Владимир") // устанавливает для текущего объекта значение v
            );
        }

        System.out.println(hashMap);

        LinkedHashMap <Integer, String> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        // если accessOrder = false, элементы вывводятся в порядке добавления, если true, в порядке использования
        linkedHashMap.put(23, "Иван");
        linkedHashMap.put(45, "Саша");
        linkedHashMap.put(67, "Петя");
        linkedHashMap.put(32, "Игорь");

        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(45));
        System.out.println(linkedHashMap.get(32));

        System.out.println(linkedHashMap);
    }
}

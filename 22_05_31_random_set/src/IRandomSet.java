// Необходимо задизайнить (придумать) такую структуру данных Long чисел, которая содержит каждое число в единственном экземпляре и обладает следующими операциями:
//bool add(elt) - добаляет элемент, возвразает true, если элемент таки добавился (его не было в структуре данных ранее)
//bool remove(elt) - удаляет элемент и возвращает true, если элемент таки удалился (он был в структуре данных ранее)
//Integer getRandom() - равновероятно возвращает один из имеющихся в структуре данных элементов.
//при этом, необходимо, чтобы все методы были эффективые. То есть их сложность O(1). Подсказка. Необходимо использовать под капотом две структуры данных:
//List<Long>
//HashMap<Long, Integer> - элемент на его индекс в листе
public interface IRandomSet<T> {

    boolean add(T elt);

    boolean remove(T elt);

    T getRandom();
}
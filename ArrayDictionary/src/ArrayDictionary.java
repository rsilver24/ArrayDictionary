import java.util.ArrayList;
import java.util.Collection;

public class ArrayDictionary<T> {

    // Instance Data

    private ArrayList<T> keys;
    private ArrayList<T> values;
    private int size;

    // Constructors

    public ArrayDictionary(){
        keys = new ArrayList<>();
        values = new ArrayList<>();
        size = 0;
    }

    // Methods

    public void put(T key, T value){
        keys.add(key);
        values.add(value);
        size++;
    }

    public T get(T key){
        int place = keys.indexOf(key);
        return values.get(place);
    }

    public T remove(T key){

    }

    public boolean contains(T key){

    }

    public boolean isEmpty(){

    }

    public int size(){

    }

    public Collection<T> keys(){

    }

    public Collection<T> values(){

    }
}

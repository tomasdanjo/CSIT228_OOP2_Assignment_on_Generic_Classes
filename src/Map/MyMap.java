package Map;

import java.util.ArrayList;
import java.util.Objects;

public class MyMap <K,V>{
    ArrayList<K> keyList;
    ArrayList<V> valList;

    public MyMap() {
        this.keyList = new ArrayList<>();
        this.valList = new ArrayList<>();
    }

    public void put(K key, V val){
        int index;
        if(keyList.contains(key)){
            index = keyList.indexOf(key);
            valList.set(index, val);
        }else{
            keyList.add(key);
            valList.add(val);
        }
    }

    public V get(K key){
        int index;
        if(keyList.contains(key)){
            index = keyList.indexOf(key);
            return valList.get(index);
        }else return null;
    }

    public V remove(K key){
        int index;
        if(keyList.contains(key)){
            index = keyList.indexOf(key);
            V temp = valList.get(index);

            keyList.remove(key);
            valList.remove(index);

            return temp;
        }else return null;
    }
}

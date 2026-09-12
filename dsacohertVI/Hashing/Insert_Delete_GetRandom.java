import java.util.*;
public class Insert_Delete_GetRandom {
    public static void main(String [] args){
        Call obj = new Call();
        System.out.println(obj.insert(10));
        System.out.println(obj.insert(1));
        System.out.println(obj.insert(20));
        System.out.println(obj.insert(1));
        System.out.println(obj.insert(30));
        System.out.println(obj.delete(10));
        System.out.println(obj.insert(1));
        System.out.println(obj.delete(10));
        System.out.println(obj.rand());
    }
}


class Call {
    private Map<Integer, Integer> map;
    private ArrayList<Integer> arr;
    private Random random;
    public Call(){
        map = new HashMap<>();
        arr = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val){
        boolean isExist = map.containsKey(val);
        if (!isExist) {
            arr.add(val);
            map.put(val,arr.size()-1);
        }
        return !isExist;
    }

    public boolean delete(int val) {
        boolean isExist = map.containsKey(val);
        if (isExist) {
            int index = map.get(val);
            int lastele = arr.get(arr.size()-1);

            arr.set(index, lastele);
            map.put(lastele, index);

            arr.remove(arr.size()-1);
            map.remove(val);
        }
        return isExist;
    }
    
    public int rand() {
        int ran = random.nextInt(arr.size());
        return arr.get(ran);
    }
}

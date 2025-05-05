// Strobogrammatic Number
import java.util.*;
class Hashmap{
    public boolean check(String s){
        HashMap<Character, Character> map = new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('8','8');
        map.put('6','9');
        map.put('9','6');

        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
            sb.append(map.get(c));
        }else{
            return false;
        }
    }
    return sb.reverse().toString().equals(s);
    }
    public static void main(String[] args){
        Hashmap obj = new Hashmap();
        System.out.println(obj.check("69"));
    }
}
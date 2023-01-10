import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class RansomNote_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char temp = ransomNote.charAt(i);
            map.put(temp, map.getOrDefault(temp, 1) + 1);
        }

        for (int i = 0; i < magazine.length(); i++) {
            char temp = magazine.charAt(i);
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) - 1);
            }
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() > 0) return false;
        }
        return true;
    }
}

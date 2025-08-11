import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teste_Jander {
    public static void main(String[] args) {
        Map<String, Integer> lista = new HashMap<>();
        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        a.add("A");
        a.add("A");
        a.stream().forEach(var -> {
             lista.put(var, lista.containsKey(var) ? lista.get(var) + 1 : 1);
        });
        System.out.println(lista);
    }
}

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String , Double> kv = new HashMap<>();
        // inserindo dados no map
        kv.put("Tv" , 1200.00);
        kv.put("Notebook" , 13000.00);
        // removendo dados no map
        kv.put("Garrafa pet" , 12.00);
        kv.remove("Garrafa pet");
        // acessar dados do map
        System.out.println("Email: " + kv.get("Email"));
        // como ver o tamanho do map
        System.out.println(kv.size());
        // como interar no map
        for (String key : kv.keySet()){
            System.out.println(key + ": " + kv.get(key));
        }

    }
}
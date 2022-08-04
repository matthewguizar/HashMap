import java.util.HashMap;

public class KeyValues {
  
    public static void main(String[] args) {
        String[] vegetables = new String[] {"Cauliflower", "Spaghetti Squash", "Parsley"};
        double[] prices = new double[] {4.99, 1.99, 6.99};

        //takes generic(cannot be primitive)
        //define the key and value types
        HashMap<String, Double> hashMap = new HashMap<String, Double>();
        //use put to add or update items. placement is random. cannot index HashMap
        hashMap.put("Cauliflower", 4.99);
        hashMap.put("Spaghetti Squash", 1.99);
        hashMap.put("Parsley", 6.99);

        //using for each to get
        hashMap.forEach((key, value) -> {
            System.out.println(key + ": " + value) ;
        });

        //access value (price in this case) buy using get and inputing key(Get value based on it's key)
        hashMap.get("Califlower");
        hashMap.get("Spaghetti Squash");
        hashMap.get("Parsley");
    }
  
}

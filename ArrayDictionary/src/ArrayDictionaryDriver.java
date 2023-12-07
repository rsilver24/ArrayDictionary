// Roan Silver      Created: December 7, 2023        Last Edits: December 7, 2023
public class ArrayDictionaryDriver {
    public static void main(String[] args) {
        ArrayDictionary AD = new ArrayDictionary();

        // Put + Get Method Tests
        System.out.print("put and get method tests (should print key: sun, value: moon): ");
        String key = "sun";
        AD.put(key, "moon");
        System.out.println("key: " + key + ", value: " + AD.get(key));

        System.out.println("");

        // Additional Put Tests + Size

        System.out.print("additional put method tests (should print: moon, water, night, 3): ");
        String key2 = "fire";
        String key3 = "day";
        AD.put(key2, "water");
        AD.put(key3, "night");
        System.out.println(AD.get(key) + ", " + AD.get(key2) + ", " + AD.get(key3) + ", " + AD.size());

        System.out.println("");

        // Remove + isEmpty test

        System.out.print("remove and isEmpty method tests (should print: moon, 2, false): ");
        System.out.println(AD.remove(key) + ", " + AD.size() + ", " + AD.isEmpty());

        System.out.println("");

        // Contains method test

        System.out.print("contains method test (should print: true): ");
        System.out.println(AD.contains(key2));

        System.out.println("");

        // Collection Tests

        System.out.print("collection method test keys (should print: fire, day): ");
        System.out.println(AD.keys());
        System.out.print("collection method test values (should print: water, night): ");
        System.out.println(AD.values());
    }
}

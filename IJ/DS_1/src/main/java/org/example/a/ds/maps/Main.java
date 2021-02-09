package org.example.a.ds.maps;

/* Associative Arrays, Maps, Dictionaries
/  K-V pairs. Each key unique. -> O(1) t complexity for most operations.
/  Hash tables or Bst implementation.
/  No support of sorting operations
**/

/* Hash tables / Dictionaries
/  Chaining: Linked lists
/  Open addressing: Generate new index for item -> Linear / Quadratic probing and Rehashing
/  Load factor: entries/buckets
**/

/* Complexities:
/  Space: O(N): I have to store every item!
/  Time: O(1)! Worst case: O(N) bad hashing. (linked list)
**/

/*  Applications
/   1. Databases: Sometimes search trees are better, sometimes hashing
/   2. Counting word occurrence in documents
/   3. Storing data + lookup tables (password checks)
/   4. Lookup tables in big networks (lookup IP addresses)
/   5. Hashing to search substrings: Rabin-Karp algo
**/

public class Main {
    public static void main(String[] args) {
        hasChainIntTest();
    }

    public static void hasChainIntTest() {
        HashChainInt chain = new HashChainInt();
        chain.put(1, 10);
        chain.put(2, 100);
        chain.put(3, 1000);
        chain.put(4, 10000);
        System.out.println(chain.get(1));
        System.out.println(chain.get(2));
        System.out.println("Same keys are not handled! I need to enter different keys here in main.");
        System.out.println("Same hashes are NOT same keys!");
        System.out.println("==============================================================\n");
    }
}

package By_Melnichuk.lect_002.search.search;

public class ContentSearcherTests {
    public static void main(String[] args) {
        ContentSearcher searcher = new PrimitiveContentSearcher();
        System.out.println("searcher.search(\"This is test\", \"test\") = " + searcher.search("This is test", "test"));
    }
}

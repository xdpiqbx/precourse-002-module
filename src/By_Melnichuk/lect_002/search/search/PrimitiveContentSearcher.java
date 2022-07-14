package By_Melnichuk.lect_002.search.search;

public class PrimitiveContentSearcher implements ContentSearcher {

    @Override
    public boolean search(String content, String search) {
        return content.toLowerCase().contains(search.toLowerCase());
    }
}

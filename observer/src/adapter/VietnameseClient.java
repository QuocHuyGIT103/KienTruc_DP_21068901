package adapter;

public class VietnameseClient {
    public static void main(String[] args) {
        JapaneseAdaptee japanese = new JapaneseAdaptee();
        VietnameseTarget adapter = new TranslatorAdapter(japanese);

        adapter.send("Xin chào");
    }
}

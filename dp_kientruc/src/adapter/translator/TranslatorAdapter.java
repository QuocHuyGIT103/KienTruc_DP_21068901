package adapter.translator;

public class TranslatorAdapter implements VietnameseTarget {
    private JapaneseAdaptee adaptee;

    public TranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String words) {
        String translatedWords = translate(words);
        adaptee.receive(translatedWords);
    }

    private String translate(String words) {
        // Giả sử ta có bộ dịch (ở đây chỉ là mô phỏng)
        if (words.equalsIgnoreCase("Xin chào")) {
            return "こんにちは (Konnichiwa)";
        }
        return "翻訳できません (Không thể dịch)";
    }
}

package Adapter_Pattern;

public class Main {
    public static void main(String[] args) {
        FromEnglishToKazakh fromEnglishToKazakh = new TranslateAdapter();

        fromEnglishToKazakh.enterText();
        fromEnglishToKazakh.translateText();
    }
}

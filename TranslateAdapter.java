package Adapter_Pattern;

public class TranslateAdapter extends FromEnglishToRussian implements FromEnglishToKazakh{
    @Override
    public void enterText() {
        textEnter();
    }

    @Override
    public void translateText() {
        textTranslate();
    }
}

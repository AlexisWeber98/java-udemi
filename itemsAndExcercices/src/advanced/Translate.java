package advanced;

public interface Translate {
    // public and abstract by default

    void translate();

    // methods impl by default

    default void startTranslate() {
        System.out.println("Starting translation...");
    }
}

class English implements Translate {
    @Override
    public void translate() {
        System.out.println("Translating to English...");
    }

}

class French implements Translate {
    public void translate() {
        System.out.println("Translating to French...");

    }

    @Override
    public void startTranslate() {
        System.out.println("Starting translation in French...");
    }
}

class TranslateTest {
    public static void main(String[] args) {
        English english = new English();
        english.startTranslate();
        english.translate();

        System.out.println("\n");
        Translate french = new French();
        french.startTranslate();
        french.translate();
    }
}
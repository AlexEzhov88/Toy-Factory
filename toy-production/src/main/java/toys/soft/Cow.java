package toys.soft;

/**
 * Класс, представляющий мягкую игрушку - Корову.
 */
public class Cow extends SoftToy {
    public Cow() {
        super("SOFT_COW001", "Синтепух");
    }

    @Override
    public void play() {
        System.out.println("Корова мычит. Артикул: " + getArticleNumber());
    }
}

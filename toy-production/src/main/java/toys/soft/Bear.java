package toys.soft;

/**
 * Класс, представляющий мягкую игрушку - Медведь.
 */
public class Bear extends SoftToy {
    public Bear() {
        super("SOFT_BEAR001", "Синтепон");
    }

    @Override
    public void play() {
        System.out.println("Медведь рычит. Артикул: " + getArticleNumber());
    }
}

package toys.interfaces;

/**
 * Интерфейс для игрушечного оружия.
 * Определяет методы для стрельбы и мигания светом.
 */
public interface Weapon extends Lightable {
    void shoot();
}

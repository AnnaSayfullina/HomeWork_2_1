package transport;

/**
 * А для автобусов добавьте классификацию с помощью перечислений по типу вместимости:
 * особо малая (до 10 мест); малая (до 25); средняя (25–50); большая (50–80); особо большая (80–120 мест).
 * Подсказки
 * В этом перечислении нижняя и верхняя границы вместимости должны быть реализованы с помощью Integer, а toString
 *  должен выводить значения в виде «Вместимость»: «нижняя граница» — «верхняя граница» мест. Если одной из границ нет, то реализация
 * toString должна работать так же, как в случае с грузоподъемностью.
 */

public enum PassengerCapacity {
    EXTRA_SMALL(null,10),
    SMALL(10,25),
    MEDIUM(25,50),
    LARGE(50,80),
    EXTRA_LARGE(80,120);
    private Integer lowerBound;
    private Integer upperBound;

    PassengerCapacity(Integer lowerBound, Integer upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }
    @Override
    public String toString() {
        if (lowerBound == null) {
            return "Вместимость: до " + upperBound + " мест";
        } else {
            return "Вместимость: " + lowerBound + " - " + upperBound +" мест";
        }
    }
}

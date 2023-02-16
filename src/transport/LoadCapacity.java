package transport;

/**
 * Для грузовых автомобилей добавьте перечисления по типу грузоподъемности:
 * N1 (с полной массой до 3,5 тонн);
 * N2 (с полной массой свыше 3,5 до 12 тонн);
 * N3 (с полной массой свыше 12 тонн).
 * Подсказки
 * Верхнюю и нижнюю границы грузоподъемности нужно указать в виде Float -значений в enum. А toString должен выводить значения вида «Грузоподъемность»: от «нижняя граница» тонн до «верхняя граница» тонн.
 * Если одной из границ не существует, ее можно передать как null -значение и обработать null в toString. Если какая-то из границ null, то фраза должна изменяться. Например, если нижняя граница
 * null, то возвращаемое значение в toString будет «Грузоподъемность»: до «верхняя граница» тонн.
 */

public enum LoadCapacity {
    N1(null, 3.5F),
    N2(3.5F, 12F),
    N3(12F, null);
    private Float lowerBound;
    private Float upperBound;

    LoadCapacity(Float lowerBound, Float upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public String toString() {
        if (lowerBound == null) {
            return "Грузоподъемность до " + upperBound + " тонн";
        } else if (upperBound == null){
            return "Грузоподъемность от " + lowerBound + " тонн";
        } else {
        return "Грузоподъемность от " + lowerBound + " тонн до " + upperBound +" тонн";
        }
    }
}

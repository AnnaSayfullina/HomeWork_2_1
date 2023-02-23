package transport;

import java.util.List;
import java.util.Queue;

/**
 * Добавьте класс «Станция техобслуживания». В этом классе должна быть реализована очередь из авто. В классе есть методы:
 * «добавить авто в очередь»;
 * «провести техосмотр авто».
 * Напомним, что автобусы не нуждаются в техобслуживании перед заездом, поэтому они в очередь не встают.
 * Каждый новый объект становится в конец очереди на техобслуживание. Как только машина проходит техобслуживание, она должна из очереди удаляться.
 */
public class ServiceStation {
    private Queue<Transport> transportQueue;

    public ServiceStation(Queue<Transport> transportQueue) {
        this.transportQueue = transportQueue;
    }

    public Queue<Transport> getTransportQueue() {
        return transportQueue;
    }

    /**
     создан метод добавления ТС в очередь с проверкой типа ТС
     */
    public void addTransportQueue (Transport<?> transport){
        if (transport.isTypeOfTransportNeedsInspection()) {
            transportQueue.offer(transport);
        }
    }

    /**
     * создан метод добавления листа в очередь
     */
    public void addTransportListToQueue(List<Transport> list) {
        for (Transport element : list) {
            addTransportQueue(element);
        }
    }

    /**
     * создан метод "Провести техосмотр авто"
     */
    public void conductTechnicalInspection(){
        Transport transport;
        while ((transport=transportQueue.poll()) != null){
            System.out.println("Транспортное средство "+transport.getBrand() + " " + transport.getModel() + " прошло ТО");
        }
    }

}

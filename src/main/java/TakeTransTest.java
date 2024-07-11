public class TakeTransTest {
    public static void main(String[] args){
        Person personJ = new Person("Jame", 5000);
        Person personT = new Person("Tomas", 10000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        personJ.takeBus(bus100);

        Subway greenSubway = new Subway(2);
        personT.takeSubway(greenSubway);

        personJ.showInfo();
        personT.showInfo();

        bus100.showBusInfo();
        greenSubway.showSubwayInfo();
    }
}

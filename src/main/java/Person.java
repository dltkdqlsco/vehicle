public class Person {
    String name;
    int money;

    public Person(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway){
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo(){
        System.out.println(name + "님의 남은 돈은 " + money + "입니다.");
    }
}

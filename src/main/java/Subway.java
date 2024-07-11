public class Subway {

    int lineNumber;
    int passengerNumber;
    int money;

    public Subway(int lineNumber){
        this.lineNumber = lineNumber;
    }

    public void take(int money){
        this.money += money;
        passengerNumber++;
    }

    public void showSubwayInfo(){
        System.out.println(lineNumber + "번의 승객 수는 " + passengerNumber + " 명 이고, 수입은 "+ money + "입니다.");
    }
}

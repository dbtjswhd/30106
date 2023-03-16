package test_0315;

public class TransportExam {

	public static void main(String[] args) {
		Car c1 = new Car("디젤", 5); 
		Car c2 = new Car("가스", 110); 
		c1.reful1();
		c2.reful1();
		c1.speedDown1();
		c2.speedUp1();
		
		Airplane a1 = new Airplane("보잉 747" , 10000, 1000);
		Airplane a2 = new Airplane("에어버스 380" , 20000, 5000);
		Airplane a3 = new Airplane("보잉 707" , 10000, 5000);
		
		a1.reful1();
		a2.reful1();
		a3.reful1();
		a1.flightTime();
		a2.flightTime();
		a1.speedDown1();
		a2.speedUp1();

	}
	

}

abstract class Transport {
	abstract void reful1();
	abstract void speedUp1();
	abstract void speedDown1();
	
}

class Car extends Transport {
	String oilType="";
	int speed=0;
	public Car() {}
	public Car(String oilType ,int speed ) {
		this.oilType=oilType;
		this.speed=speed;
	}
	
	@Override
	public void reful1() {
		if(oilType.equals("디젤")) {
			System.out.println("디젤을 경유합니다.");
		}
		else if(oilType.equals("가스")) {
			System.out.println("가스를 경유합니다.");
		}
		else if(oilType.equals("전기")) {
			System.out.println("전기를 충전합니다.");
		}
		else if(oilType.equals("태양열")) {
			System.out.println("태양열을 충전합니다.");
		}
		else if(oilType.equals("휘발유")) {
			System.out.println("휘발유를 경유합니다.");
		}
	}
	@Override
	public void speedUp1() {
		speed += 10;
		if(speed>110) {
			System.out.println("속력위반으로 범칙금 10만원을 부과합니다.");
			speed =10;
		}
	}
	@Override
	public void speedDown1() {
		speed -= 10;
		if(speed<=0) {
			System.out.println("차가 멈췼습니다.");
			speed =10;
		}
	
	}
}


class Airplane extends Transport{
	String airplanName = ""; 
    int distance = 0;      
    int speed = 0;        
    int totalJetFuel = 1500;   
    int jetFuel = 0;
    
   
	public Airplane(String airplanName, int distance, int speed) {
		this.airplanName = airplanName;
		this.distance = distance;
		this.speed = speed;

	}
	@Override
public void reful1() {
		jetFuel = distance/20;
        if(jetFuel<=totalJetFuel) {
            System.out.println("항공유 "+jetFuel+"L 를 주유합니다.");
            totalJetFuel -= jetFuel;
        } else {
            System.out.println("항공유가 부족하여 주유할 수 없습니다.");
        }
	
}@Override
public void speedUp1() {
	speed += 1000;
	if(speed>5500) {
		System.out.println("비행속도는 5500km을 넘을 수 없습니다");
		speed = 5500;
	}
	
}@Override
public void speedDown1() {
	speed -= 1000;
	if(speed<=0) {
		System.out.println("비행기가 멈췄습니다.");
		speed = 10;
		}
}
public void flightTime(){
	int time=0;
	time += speed / distance;
	}
}






























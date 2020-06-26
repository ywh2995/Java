package day07;

public class PhoneMain {

	public static void main(String[] args) {
		Phone basic = new Phone();
		basic.info();
		Phone black = new Phone ("블랙");
		black.info();
		Phone white = new Phone("white",400000);
		white.info();
		Phone iPhone = new Phone("gray","iPhone");
		iPhone.info();
		Phone shaom = new Phone("green","샤오미",1000000);
		shaom.info();
	}

}

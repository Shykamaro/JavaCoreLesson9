package lviv.lgs;

import java.util.Scanner;

public class Application {
public static void main(String[] args) throws MyException {
	Scanner scanner = new Scanner(System.in);

	int a;
	int b;

	System.out.println("������� ������ ����� �����:");

	if (scanner.hasNextInt()) {
		a = scanner.nextInt();
		System.out.println("������� ������ ����� �����:");

		if (scanner.hasNextInt()) {
			b = scanner.nextInt();

			Methods calc = new Methods(a, b);

			Methods.viewCalcResult(calc.plus());
			Methods.viewCalcResult(calc.minus());
			Methods.viewCalcResult(calc.multiply());
			Methods.viewCalcResult(calc.devide());
		}

		else
			System.out.println("������! ���������� ���� ������ ����� �����");
	}

	else
		System.out.println("������! ���������� ���� ������ ����� �����");


}
}


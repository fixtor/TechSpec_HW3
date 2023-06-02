/* 1. Построить три класса (базовый и 2 потомка), описывающих некоторых работников с почасовой оплатой (один из потомков) и фиксированной оплатой (второй потомок).
а) Описать в базовом классе абстрактный метод для расчёта среднемесячной заработной платы.
Для «повременщиков» формула для расчета такова: «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка», для работников с фиксированной оплатой «среднемесячная заработная плата = фиксированная месячная оплата».
б) Создать на базе абстрактного класса массив сотрудников и заполнить его. */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args){
		//У меня используется в конструкторе проверка, если почасовая оплата 0, то сотрудник имеет фиксированную оплату.
		Staff[] staff = {new StaffPerHour(4, "Ivan", 33, 0, 320),
						new StaffPerMonth(2, "Olga", 22, 15_000, 0),
						new StaffPerMonth(1, "Alex", 45, 82000, 0),
						new StaffPerHour(3, "Natalia", 32, 0, 450)}; //Создали массив

	// г) ** Создать класс, содержащий массив сотрудников, и реализовать возможность вывода данных с использованием foreach.
		for (Staff item: staff) {
			System.out.println(item);
			System.out.println("*");
		} //Выводим с помощью foreach

//------------------- Сделали comparable интерфейс
		//в) ** Реализовать интерфейсы для возможности сортировки массива (обратите ваше внимание на интерфейсы Comparator, Comparable)
		List<Staff> staffList = new ArrayList<>();
		staffList.add(new StaffPerHour(4, "Ivan", 33, 0, 320));
		staffList.add(new StaffPerMonth(2, "Olga", 22, 15_000, 0));
		staffList.add(new StaffPerMonth(1, "Alex", 45, 82000, 0));
		staffList.add(new StaffPerHour(3, "Natalia", 32, 0, 450));

		Collections.sort(staffList);
		System.out.println("Sorted by id: ");
		for (Staff item : staffList) {
            System.out.println(item.getId() + " " + item.name);
		} // Теперь сортирует по ID. Можно конечно сделать и компаратор.
	}
}

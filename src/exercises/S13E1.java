package exercises;

import java.time.LocalDate;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import enums.WorkerLevel;

public class S13E1 {
	public static void main (String args[]) {
		Department contabilidade = new Department("contabilidade");
		Worker zezin = new Worker("zezin", WorkerLevel.MID_LEVEL, 2400.00, contabilidade);
		
		zezin.addContract(new HourContract(LocalDate.now(), 24.80, 30));
		zezin.addContract(new HourContract(LocalDate.now(), 1300.60, 60));
		
		System.out.printf("%s", zezin.getContracts().get(0));
		System.out.printf("%s", zezin.getContracts().get(1));
		
		zezin.remove(zezin.getContracts().get(0));
		System.out.println("remoção!");
		
		System.out.printf("%s", zezin.getContracts().get(0));
		
		
		
	}
}

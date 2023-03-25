import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;

public class Sec11_DateTimeCalendar {
	// Continuação da manipulação de data e hora
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LocalDate myDate = LocalDate.parse("2022-07-20");
		LocalDateTime myDateTime = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant myInstant = Instant.parse("2022-07-20T01:30:26Z");
		
		// O comando abaixo lista todas as zones utilizáveis (em extenso)
		//for (String s : ZoneId.getAvailableZoneIds()) {System.out.println(s);}
		
		LocalDate dateFromInstant1 = LocalDate.ofInstant(myInstant, ZoneId.systemDefault());
		LocalDate dateFromInstant2 = LocalDate.ofInstant(myInstant, ZoneId.of("Portugal"));
		LocalDateTime dateTimeFromInstant = LocalDateTime.ofInstant(myInstant, ZoneId.systemDefault());
		LocalDateTime dateTimeFromInstant2 = LocalDateTime.ofInstant(myInstant, ZoneId.of("Portugal"));
		
		System.out.println(dateFromInstant1);
		System.out.println(dateFromInstant2);
		System.out.println(dateTimeFromInstant);
		System.out.println(dateTimeFromInstant2);
		
		// Pegando elementos isolados de uma data:
		System.out.println("Dia de data local: " + myDate.getDayOfWeek());
		System.out.println("Mês: " + myDate.getMonthValue());
		System.out.println("Ano: " + myDate.getYear());
		
		
		sc.close();
	}
}

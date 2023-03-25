import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Sec11_DateTimeCalc {
	// Cálculos com data e hora
	public static void main(String[] args) {
		LocalDate myDate = LocalDate.parse("2022-07-20");
		LocalDateTime myDateTime = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant myInstant = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = myDate.minusDays(7);
		LocalDate NextWeekLocalDate = myDate.plusDays(7);
		
		System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
		System.out.println("NextWeekLocalDate: " + NextWeekLocalDate);
		
		Instant lowerInstant = myInstant.minusSeconds(1200);
		LocalDateTime nextWeekLocalDateTime = myDateTime.plusDays(7);
		LocalDateTime pastWeekLocalDateTime = myDateTime.minusDays(7);
		
		System.out.println("lowerInstant: " + lowerInstant);
		System.out.println("NextWeekLocalDateTime" + nextWeekLocalDateTime);
		
		// O instant não tem os minusUnidade. Ao invés disso, se usa um minus(quantidade, unidade).
		Instant pastWeekInstant = myInstant.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = myInstant.plus(7, ChronoUnit.DAYS);
		System.out.println("pastWeekInstant: " + pastWeekInstant);
		System.out.println("nextWeekInstant: " + nextWeekInstant);
		
		Duration myDuration = Duration.between(pastWeekLocalDateTime, nextWeekLocalDateTime);
		System.out.println("duration bruta: " + myDuration);
		System.out.println("duration em minutos: " + myDuration.toMinutes());
		System.out.println("duration em dias: " + myDuration.toDays());
		System.out.println("duration entre tipos diferentes (Date e DateTime): " + Duration.between(pastWeekLocalDate.atStartOfDay(), nextWeekLocalDateTime).toMinutes());
		System.out.println("duration entre tipos diferentes (Date e DateTime): " + Duration.between(pastWeekInstant, myInstant));

	}

}

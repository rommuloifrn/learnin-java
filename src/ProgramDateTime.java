import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramDateTime {
// Manipulação de data e hora
	public static void main(String[] args) {
		LocalDate myDate = LocalDate.now();
		LocalDateTime myDateTime = LocalDateTime.now();
		Instant myInstant = Instant.now();
		
		// os LocalDate.parse são objetos DateTime gerados a partir de texto no padrão ISO 8601
		LocalDate parsedDate = LocalDate.parse("2020-02-15");
		LocalDateTime parsedDateTime = LocalDateTime.parse("2023-01-30T01:28:02");
		Instant parsedInstant = Instant.parse("2023-01-30T01:28:02Z");
		Instant parsedSaoPauloInstant = Instant.parse("2023-01-30T01:28:02-03:00");
		
		// O tipo DateTimeFormatter cria um padrão customizado para parsing de data/hora.
		// ele deve seguir o tipo de date que quer armazenar, no caso abaixo, DateTime.
		DateTimeFormatter myCustomFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate customParsedDate = LocalDate.parse("20/07/2022", myCustomFormatter);
		
		/* Parece que não funciona com Instant, mas então como que se define um padrão custom que recebe fuso? */
		DateTimeFormatter mySecondCustomFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy[HH:mm:ss](V)");
		Instant customParsedInstant = Instant.parse("29/01/2005[03:32:27](Z)", mySecondCustomFormatter);
		
		System.out.println("data local: "+myDate);
		System.out.println("data/hora local: "+myDateTime);
		System.out.println("data/hora global (instant): "+myInstant);
		System.out.println("data local parsed: "+parsedDate);
		System.out.println("data/hora local parsed: "+parsedDateTime);
		System.out.println("data/hora global (instant) parsed: "+parsedInstant);
		System.out.println("data/hora global parsed de São Paulo (GMT-3:00): "+parsedSaoPauloInstant);
		System.out.println("data local custom-parsed: "+customParsedDate);
	}

}

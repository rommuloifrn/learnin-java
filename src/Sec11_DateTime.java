import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Sec11_DateTime {
// Manipulação de data e hora
	public static void main(String[] args) {
		LocalDate myDate = LocalDate.now();
		LocalDateTime myDateTime = LocalDateTime.now();
		Instant myInstant = Instant.now();
		
		// os LocalDate.parse são objetos DateTime gerados a partir de texto no padrão ISO 8601 (ano-mês-diaThora:minuto:segundofuso)
		LocalDate parsedDate = LocalDate.parse("2020-02-15");
		LocalDateTime parsedDateTime = LocalDateTime.parse("2023-01-30T01:28:02");
		Instant parsedInstant = Instant.parse("2023-01-30T01:28:02Z");
		Instant parsedSaoPauloInstant = Instant.parse("2023-01-30T01:28:02-03:00");
		
		// O tipo DateTimeFormatter cria um padrão customizado para parsing de data/hora.
		// ele deve seguir o tipo de date que quer armazenar, no caso abaixo, DateTime.
		DateTimeFormatter myCustomFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate customParsedDate = LocalDate.parse("20/07/2022", myCustomFormatter);
		/* Parece que não funciona com Instant (Instant não tem método parse), mas então como que se define um padrão custom que recebe fuso?
		 * é uma questão pra correr atrás depois. */
		// Abaixo o formatador implementado direto no método parse(), diferente do acima.
		LocalDateTime customParsedInstant = LocalDateTime.parse("29/01/2005 03:32:27 -03:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss VV"));
		
		// datetimes instanciados a partir de valores separados:
		LocalDate instantiatedDate = LocalDate.of(2023, 01, 29);
		LocalDateTime instantiatedDateTime = LocalDateTime.of(2023, 02, 21, 2, 30);
		
		// Conversão de data/hora pra texto:
		System.out.println("data local (exibição customizada com formatter): "+myDate.format(myCustomFormatter));
		System.out.println("mesmo de cima, usando o método format pelo formatter ao invés do DateTime: "+myCustomFormatter.format(myDate));
		DateTimeFormatter myOtherFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("exibição customizada com hora: "+myDateTime.format(myOtherFormatter));
		// formatador com zona, para formação de Instant
		DateTimeFormatter myOtherFormatterWithZone = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		// note que como o Instant não tem método format, ele vai como argumento no método format do formatador.
		// o parsedInstant está no fuso horário de Londres, e como no formatador eu especifico o a zone do sistema, o horário vai ser ajustado. 
		System.out.println("exibição customizada com hora e timezone: "+myOtherFormatterWithZone.format(parsedInstant));
		// A partir de constantes predefinidas:
		DateTimeFormatter PredefinedFormatter = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("data e hora com formatador predefinido: " + myDateTime.format(PredefinedFormatter));
		// a constante usada no formatador abaixo mostra a semana e o ano:
		System.out.println("outro formatador predefinido: " + myDateTime.format(DateTimeFormatter.ISO_WEEK_DATE));
		
		
		
		// OUTPUTS (não todos)
		System.out.println("---------------------");
		
		System.out.println("data local: "+myDate);
		System.out.println("data/hora local: "+myDateTime);
		System.out.println("data/hora global (instant): "+myInstant);
		System.out.println("data local parsed: "+parsedDate);
		System.out.println("data/hora local parsed: "+parsedDateTime);
		System.out.println("data/hora global (instant) parsed: "+parsedInstant);
		System.out.println("data/hora global parsed de São Paulo (GMT-3:00): "+parsedSaoPauloInstant);
		
		System.out.println("data local custom-parsed: "+customParsedDate);
		System.out.println("data global custom-parsed: "+customParsedInstant);
		
		System.out.println("data local instanciada a partir de valores separados:"+instantiatedDate);
		System.out.println("data/hora local instanciada a partir de valores separados:"+instantiatedDateTime);
	}

}

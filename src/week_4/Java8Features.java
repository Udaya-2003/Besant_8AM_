package week_4;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Objects;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.Optional;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class Java8Features {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l = new ArrayList<String>();  
		l.add(null);
		l.add("hello");
		l.add("java");
		l.add("js");
		List<BigDecimal> l1 = new ArrayList<BigDecimal>();
		l1.add(new BigDecimal(5));
		l1.add(new BigDecimal(6));
		l1.add(new BigDecimal(7));
		
		
		List<String> mapResult = l.stream().filter(Objects::nonNull).map(e->e.concat("hel")).collect(Collectors.toList());
		System.out.println(mapResult);   //Result in new Array List not modify the original Array List
		
		
		List<String> filResult = l.stream().filter(Objects::nonNull).filter(e->e.length()>3).collect(Collectors.toList());
		System.out.println(filResult);   
		
		Optional<BigDecimal> reduceResult = l1.stream().reduce(BigDecimal::add);
		System.out.println(reduceResult);
		
		boolean anyResult = l.stream().filter(Objects::nonNull).anyMatch(e->e.length()>3);
		System.out.println(anyResult);  
		
		
		boolean allResult = l.stream().filter(Objects::nonNull).allMatch(e->e.length()>3);
		System.out.println(allResult);  
		
		
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDate.of(2025, 7, 25));

	}

}

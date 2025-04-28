package day3Prac.stream3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AcornToAcornDTO변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Acorn> list = new ArrayList<Acorn>();
		list.add(new Acorn("a001","박예린","1111"));
		list.add(new Acorn("a002","이정호","2222"));
		list.add(new Acorn("a003","김민환","3333"));
		list.add(new Acorn("a004","김유민","4444"));
		list.add(new Acorn("a005","박수경","5555"));
		list.add(new Acorn("a006","이수민","6666"));
		
		List<AcornDTO>dtolist = list.stream()
		.map(acorn->new AcornDTO(acorn.getId(),acorn.getName()))
		.collect(Collectors.toList());
		
		dtolist.forEach(item->System.out.println(item));
		
		List<AcornDTO>dtolist2 =list.stream()
		.map(acorn -> new AcornDTO(acorn.getId(),acorn.getName()))
		.collect(Collectors.toList());
		
	}

}

package project;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class File extends Calculation {
	void print()throws IOException{
		System.out.print("Create User Copy?(y/n): ");
		check= input.next().charAt(0);
		
	if(check=='y'||check=='Y') {	
	List<String> lines = Arrays.asList("Name: "+ name,"USN: 1DS20CS"+ usn,"","Subject:"+ sub,"CIE 1: "+cie1,
			"CIE 2: "+cie2,"CIE 3: "+cie3,"AAT  : "+aat,"Quiz : "+quiz,"","Total= "+total+"/50");
	Path file = Paths.get(name+"_"+sub);
	Files.write(file, lines, StandardCharsets.UTF_8);
	}
	else
		System.exit(0);
	}

}

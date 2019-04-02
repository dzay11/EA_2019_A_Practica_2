package TareasD;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.*;
public class Archivo {
	public static void main(String[] args) throws IOException {
		

String fileName="C:/Users/dzay1/EA_2019A_Practica_1/empleados.txt";

Scanner scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
String content = scanner.useDelimiter("\\A").next();
scanner.close();
System.out.println(content);
int a=0,e=0,i=0,o=0,u=0;
for(int x=0;x<content.length();x++){
	if(content.toUpperCase().charAt(x)=='A'){
		a++;
	}
if(content.toUpperCase().charAt(x)=='E'){
		e++;
	}
if(content.toUpperCase().charAt(x)=='I'){
	i++;
}
if(content.toUpperCase().charAt(x)=='O'){
	o++;
}
if(content.toUpperCase().charAt(x)=='U'){
	u++;
}
}
System.out.println("A: "+a+" E: "+e+" I: "+i+" O: "+o+" U: "+u);   				
BufferedWriter out = new BufferedWriter(new FileWriter("vocales.txt")); 
for (int d=0;d<a;d++){
out.write("A"); }
for (int d=0;d<e;d++){
out.write("E"); }
for (int d=0;d<i;d++){
out.write("I"); }
for (int d=0;d<o;d++){
out.write("O"); }
for (int d=0;d<u;d++){
out.write("U"); }
out.close();   		
}
}
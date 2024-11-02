public class LogicalAnd{

public static void main(String[]args){

if (5>3 && 7>5){
		System.out.println("true");
}
if (5>3 & 7>5 ){
		System.out.println("false1");
}
if (5>3 | 7>5){
		System.out.println("false2");
}
if (5>3 ^ 7<5){
		System.out.println("false3");
}
}}
public class PatternDisplay {
public static void main(String[] args) {

System.out.println();
for (int i = 5; i > 0; i--) {
for (int j = 0; j < i; j++) {
System.out.print('*');
}
System.out.println();
}
System.out.println();
for (int i = 0; i < 5; i++) {
for (int j = 5; j > i + 1; j--) {
System.out.print(' ');
}
for (int k = 0; k <= i; k++) {
System.out.print('*');
}
System.out.println();
}
System.out.println();
for (int i = 0; i < 5; i++) {
for (int j = 5; j > i + 1; j--) {
System.out.print(' ');
}
}
System.out.println();
for (int i = 5; i > 0; i--) {
for (int j = 0; j < i; j++) {
System.out.print('*');
}
System.out.println();
}
System.out.println();
for (int i = 0; i < 5; i++) {
for (int j = 5; j > i + 1; j--) {
System.out.print(' ');
}
for (int k = 0; k <= i; k++) {
System.out.print('*');
}
System.out.println();
}
System.out.println();
for (int i = 0; i < 5; i++) {
for (int j = 5; j > i + 1; j--) {
System.out.print(' ');
}
}
}
}

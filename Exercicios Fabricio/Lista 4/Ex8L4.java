public class Ex8L4 {
    public static void main(String[] args) {

        Integer num = 1;
        Integer i = 1;
        Integer primo = 0;


        for (num = 1; num < 100; num++) {
            for (i = 1; i <= num; i++) {
                if (num % i == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.println(num);
            }
            primo = 0;
        }
    }
}








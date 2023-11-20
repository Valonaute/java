public class Count {

    public static void main(String[] args) {

        int i = 1; 

        while (i <= 50){
            if ( (i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzzzBuzzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizzz");
            } else if (i % 5 == 0){
                System.out.println("Buzzz");
            } else {
                System.out.println(i);
            }
            i++;
        }
    } 
}

package beforemutithreading;

public class DemoClass {
    public static void main(String[] args) {

        System.out.println("part1 to print in ascending order");
        for(int i=1;i<=10;i++){
            System.out.println("i value is : "+i);
        }

        System.out.println("part2 to print in descending order");
        for(int j=10;j>=1;j--){
            System.out.println("j value is : "+j);
        }
    }
}

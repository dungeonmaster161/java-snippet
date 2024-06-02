import java.util.Scanner;
class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while(true){
                System.out.println("Enter Number One");
                float num1 = sc.nextFloat();
                System.out.println("Enter Number Two");
                float num2 = sc.nextFloat();
                System.out.println("Enter choice\n1 to add\n2 to sub\n3 to mul\n4 to div\n5 to exit");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Add="+(num1+num2));
                        break;
                    case 2:
                        System.out.println("Sub="+(num1-num2));
                        break;
                    case 3:
                        System.out.println("Mul="+(num1*num2));
                        break;
                    case 4:
                        System.out.println("Div="+(num1/num2));
                        break;
                    default:
                        break;
                }
                if(choice == 5){
                    System.out.println("Thanks for using");
                    break;
                }
            }
    }
}
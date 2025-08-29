import java.util.Scanner;
import java.util.stream.Stream;

//public class Main {
//    public static void main(String[] args) {
//        int n = 2314;
//        int inverse = 0;
//        int position = 1;
//        while (n > 0 ){
//            int digit = n % 10 ;
//            n = n/10;
//            inverse = inverse + position * (int)Math.pow(10,digit-1);
//            position++;
//        }
//        System.out.println(inverse);
//
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter a number");
//        int n = input.nextInt();
//        int reverse = 0 ;
//        int count  = 0;
//        int original = n;
//        while (n > 0 ){
//            int n1 = n % 10;
//             reverse = reverse * 10 + n1;
//             count++;
//            n = n/10;
//
//        }
//        System.out.println(reverse);
//         if (reverse == original){
//             System.out.println( reverse  +   " is palindrome");
//         }
//          else {
//             System.out.println(reverse + " not palindrome");
//         }
//    }
//}
//

//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter n");
//        int n = input.nextInt();
//        System.out.println("enter n2 ");
//        int n2 = input.nextInt();
//        System.out.println("enter operation + - / % √ ");
//        char op = input.next().charAt(0);
//        switch (op){
//            case '+':
//                System.out.println(n+n2);
//                break;
//            case'√':
//                System.out.println(Math.pow(n,n2));
//
//
//
//        }
//    }
//
//}
//public class Main {
//    public static void main(String[] args) {
//        int n =27391;
//        int k = -2;
//        int rotatenumber = 0;
//        int temp = n;   //save the temp variable
//        int count = 0 ;
//        while (temp > 0){
//            temp = temp/10;
//            count++;
//
//        }
//
//            temp = n;
//            int power = (int)Math.pow(10,count-1); // extract last digit no
//            int index = 0;
//
//            while (power > 0){
//                int digit =temp/power;
//                temp = temp % power;
//                int newindex = (index + k )% count;
//
//                rotatenumber = rotatenumber + digit * (int) Math.pow(10,count-1-newindex);
//              power = power/10;
//              index++;
//            }
//            System.out.println(rotatenumber);
//
//
//
//
//        }
//
//    }
//
//  public class Main {
//    public static void main(String[] args) {
//        int n = 27391;
//        int rotatenumber = 0;
//        int k = -2;
//        int temp =n;
//        int count = 0;
//
//           while (temp > 0 ){
//                temp = temp/10;
//                count++;
//           }
//              temp = n;
//           int power = (int)Math.pow(10,count-1);
//           int index = 0;
//
//           while (power > 0){
//              int digit = temp /power;
//              temp = temp % power;
//               int newindex = (index + k)%count;
//               if (newindex<0){
//                   newindex=newindex+count;
//               }
//               rotatenumber+=digit * (int)Math.pow(10,count-1-newindex);
//               power = power/10;
//               index++;
//           }
        System.out.println(rotatenumber);

    }
}
public class Main {
    public static void main(String[] args) {
        int n = 27391;
        int k = 2;
        int temp = n ;
        int count = 0;
        int rotatenumber = 0 ;
        while (temp > 0){
            temp = temp / 10;
            count++;

        }
         temp = n ;
        int power = (int) Math.pow(10,count-1);
        int index = 0 ;

        while (power > 0){
            int digit = temp / power;
                        temp = temp % power;
            int newindex = (index + k )% count;
            if (newindex < 0) {
                newindex = newindex + count;
            }

                rotatenumber = rotatenumber + digit * (int)Math.pow(10,count-1-newindex);
                power = power/10;
                index++;
            }
            System.out.println(rotatenumber);


        }
    }
  public class Main {
    public static void main(String[] args) {
        int n = 27391;
        int rotatenumber = 0;
        int k = 2;
        int temp = n;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

            temp = n;
            int power = (int) Math.pow(10, count - 1);
            int index = 0;

            while (power > 0) {
                int digit = temp / power;
                temp = temp % power;
                int newindex = (index + k) % count;
                if (newindex < 0) {
                    newindex = newindex + count;

                }
                rotatenumber = rotatenumber + digit * (int) (Math.pow(10, count-1-newindex));
                power = power/10;
                index++;

            }
            System.out.println(rotatenumber);
        }
    }

 public class Main {
    public static void main(String[] args) {
        int n = 27391;
        int rotate = 0;
        int k = -1;
        int temp= n;
        int count = 0 ;
        while (temp>0) {//already have the number in original form  why we need to extract
            temp = temp / 10;
            count++;
        }
                temp = n ;
              int power = (int)Math.pow(10,count-1);
              int index = 0;
              while (power>0){ //what this loop doing
                  int digit = temp/power;//why modulas is not first why u divide first then modulas
                  temp = temp % power;

                  int newindex = (index + k )% count;//what is happening here
                  if (newindex < 0){
                      newindex = newindex + count;
                  }
                    rotate = rotate + digit*(int)Math.pow(10,count-1-newindex); //what is going on here
                    power = power / 10;
                    index++;
              }
                   System.out.println(rotate);

            }

        }

 public class Main {
     public static void main(String[] args) {
         int n = 2314;
         int inverse = 0;
         int position = 1;
         int count=0;
         while (n > 0) {
             int n1 = n % 10;
             n = n/10;
             inverse = inverse + position *(int)Math.pow(10,n1-1);
              position++;

         }
         System.out.println(inverse);
     }
 }
public class Main {
    public static void main(String[] args) {
        int n = 65467;
        int rotate = 0;
        int k = -2;
        int temp = n;
        int count =0;
        while (temp>0){
            temp = temp /10;
            count++;
        }

        temp = n ;
        int power = (int)Math.pow(10,count-1);
        int index = 0 ;

        while (power > 0){
            int digit = temp / power;
              temp = temp % power;

              int newindex = (index + k )%count;
             if (newindex < 0 ) {
                 newindex = newindex + count;

             }

                 rotate = rotate + digit*(int)Math.pow(10,count-1-newindex);
                 power = power / 10;
                 index++;
             }
            System.out.println(rotate);
        }
    }



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int n2 = input.nextInt();
        int gcd = 1;
        for (int i = 1; i <= Math.min(n,n2) ; i++) {
            if (n % i  == 0 && n2 % i ==0){
              gcd = i;
            }


        }
        int lcm = (n * n2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
  public class Main {
    public static void main(String[] args) {
        int n =24253;
        int k = 2 ;
        int rotate =0;
        int temp = n;
        int count = 0;

        while (temp > 0 ){
            temp = temp/10;
            count++;

        }
           temp = n;
           int power = (int)Math.pow(10,count-1);
           int index = 0;

           while (power > 0) {
               int digit = temp / power;
               temp = temp % power;


               int newindex =(index+k)%count;
               if (newindex < 0){
                   newindex = newindex + count;
               }
                 rotate = rotate + digit * (int)Math.pow(10,count-1-newindex);
                power =power/10;
                index++;

           }
             System.out.println(rotate);






    }
}
  public class Main {
    public static void main(String[] args) {
        int n = 2314;
        int inverse = 0;
        int position = 1;

        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            inverse = inverse + position * (int) Math.pow(10,digit -1 );
            position++;

        }
        System.out.println(inverse);
    }
}
   public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int n2 = input.nextInt();
        int gcd  = 1 ;
        for (int i = 1; i <= Math.min(n,n2) ; i++) {
            if (n % i ==0 && n2 % i ==0)
                  gcd = i;

        }

        int lcm =(n * n2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);

    }
}
 public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int target = 50;
         int guess = 0;

         while (guess!=target){
              guess = input.nextInt();
              if (guess>target){
                  System.out.println("too high");

              } else if (guess<target) {
                  System.out.println("too low");

              } else {
                  System.out.println(" Congratulations u won the game ");
              }
         }
    }
}

 public class Main {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int n = input.nextInt();
         for (int i = 1; i <=10 ; i++) {
             System.out.println( n + " *  " + i+ " = " + n *i);

         }
     }
}

 public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int factorial =1;
        for (int i = 1; i <=n ; i++) {
          factorial = factorial*i;


            }
        System.out.println(factorial);
        }
    }

  public class Main {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int n = input.nextInt();
          int factorial = 1;
          int i =1;
          while (i<=n){
              factorial = factorial*i;
              i++;

          }
          System.out.println(factorial);
      }
}
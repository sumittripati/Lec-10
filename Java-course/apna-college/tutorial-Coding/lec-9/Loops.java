// 9.2

// public class Loops {

//     public static void main(String[] args) {
//         int count = 0;
//         while (count < 10) {
//             System.out.println("hello word");
//             count++;
//         }
//         System.out.println("10 time hello word printed");
//     }
// }

// 9.3


// public class Loops {

//     public static void main(String[] args) {
//         int count = 1;
//         while (count <= 1000) {
//             System.out.print(count + " ");
//             count++;
//         }
//     }
// }

// 9.4

// import java.util.Scanner;
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(" Enter a range number");
//         int range = sc.nextInt();
//         int count = 1;
//         while (count <= range) {
//             System.out.print(count + " ");
//             count++;
//         }
//     }
// }

// 9.5


// public class Loops {
//     public static void main(String[] args) {
//         int n = 5;
//         int sum = 0;
//         int i = 1;
//         while (i <= n) {
//             sum = sum + i;
//             i++;
//         }
//         System.out.println("Sum of first " + n + " natural numbers is " + sum);
//     }
// }


// 9.6

// public class Loops {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 10; i++) {
//             System.out.println("Hello word");
//         }
//     }
// }

// 9.7

// public class Loops {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 4; i++) {
//             System.out.println("****");
//         }
//     }
// }

// public class Loops {
//     public static void main(String[] args) {
//         int i = 1;
//         while (i <= 4) {
//             System.out.println("****");
//             i++;
//         } 
//     }
// }

// 9.8

// public class Loops {
//     public static void main(String[] args) {
//         int n = 10899;
//         while (n > 0) {
//             int digit = n%10;
//             System.out.print(digit);
//             n = n/10;
//         }
//     }
// }

// 9.9

// public class Loops {
//     public static void main(String[] args) {
//         int num = 10899;
//         int rev = 0;
//         while (num > 0) {
//             int Lastdigit = num % 10;
//             rev = (rev*10) + Lastdigit;
//             num = num / 10;
//         }
//         System.out.println(rev);
//     }
// }

// 9.10 do while loop

// public class Loops {
//     public static void main(String[] args) {
//         int i = 1;
//         do {
//             System.out.println(i);
//             i++;
//         }while(i <= 10);
//     }
// }

// 9.11 break statement

// public class Loops {
//       public static void main(String[] args) {
//         for(int i = 1; i<= 10; i++) {
//             if(i == 5) {
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("i am out of loop");
//       }
// }

// 9.12 

// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        do {
//         System.out.println("Enter a number");
//         int num = sc.nextInt();
//         if(num % 10 == 0) {
//          break;
//         }
//         System.out.println(num);
//        } while (true);
//     }
// }

// 9.13 continue statement

// public class Loops {
//     public static void main(String[] args) {
//         for(int i = 1; i<= 10; i++) {
//             if(i == 5) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }


// 9.14

// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         do {
//             System.out.print("Enter a number");
//             int num = sc.nextInt();
//             if (num % 2 == 0) {
//                 continue;
//             }
//             System.out.println("Entered number was" + num);
//         } while (true);
//     }
// }


// 9.15

import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int count = 0;
        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                count++;
            } ;
            i++;
        }
        if (count == 2) {
            System.out.println(" prime number ");
        }
        else {
            System.out.println("not a prime number");
        }
    }
}


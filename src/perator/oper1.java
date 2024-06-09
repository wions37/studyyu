package perator;

public class oper1 {
//        //    public static void main(String[] args) {
////        int a =8;
////        int b =3;
////        int sum = a+b;
////
////        System.out.println("a+b="+sum);
////
////
////        int diff = a - b;
////        System.out.println("a -b="+diff);
////
////        int multi = a*b;
////        System.out.println("a*b="+multi);
////
////        int div = a/b;
////        System.out.println("a/b="+div);
////
////        int mod =a%b;
////        System.out.println("a%b="+mod);
////
////    }
////    public static void main(String[] args) {
////        String result = "hello" + "worid";
////        System.out.println(result);
////
////        String s1 ="string1";
////        String s2 ="string2";
////        String result2 = s1+ s2 ;
////
////        System.out.println(s1+s2);
////        System.out.println(result2);
////
////        String result3 = "a+b" +10;
////        System.out.println(result3);
////
////        int num =20;
////        String str ="a+b=";
////        String result4 = str+num;
////        System.out.println(result4);
////
////    }
////    public static void main(String[] args) {
////        int sum1 = 1+2*3;
////        int sum2 = (1+2)*3;
////        System.out.println("sum1="+sum1);
////        System.out.println("sum2="+sum2);
////    }
////    public static void main(String[] args) {
////        int sum3 =2*2+3*3 ;
////        int sum4 =(2*2)+(3*3) ;
////        System.out.println("sum3 = " + sum3);
////        System.out.println("sum4 = " + sum4);
////
////    }
////
////    public static void main(String[] args) {
////        int a =0;
////        a= a+1;
////        System.out.println("a="+a);
////
////        a= a+1;
////        System.out.println("a="+a);
////
////        ++a;
////        System.out.println("a="+a);
////
////        --a;
////        System.out.println("a="+a);
////
////
////    }
////    public static void main(String[] args) {
//////        int a=1;
//////        int b=0;
//////
//////        b= ++a;
////        // a=a+1  > a++
////        // b= a  이 두줄이 합쳐진거
//////        System.out.println("a="+a+",b="+b);
////
////        int a=1;
////        int b=0;
////
////        b= a++;
////
////        // b= a  이 두줄이 합쳐진거
////        // a=a+1  > a++
////        System.out.println("a="+a+",b="+b);
////    }
////
////    public static void main(String[] args) {
////        int a = 2;
////        int b = 3;
////
////        System.out.println(a == b);
////        System.out.println(a != b);
////        System.out.println(a > b);
////        System.out.println(a < b);
////        System.out.println(a >= b);
////        System.out.println(a <= b);
////
////        boolean result = a == b;
////        System.out.println(result);
////
////    }
//    public static void main(String[] args) {
//        String str1 = "문자열1";
//        String str2 = "문자열2";
//
//        boolean result1 ="hello".equals("hello");
//        boolean result2 = str1.equals("문자열1");
//        boolean result3 = str1.equals(str2);
//
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//
//    }
//    public static void main(String[] args) {
//        System.out.println("&&:AND 연산");
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && false);
//
//        System.out.println("|| or 연산");
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || false);
//
//        System.out.println("! 부정 연산");
//        System.out.println(!true);
//        System.out.println(!false);
//
//        System.out.println("변수 활용");
//        boolean a =true;
//        boolean b =false;
//        System.out.println(a && b);
//        System.out.println(a || b);
//        System.out.println(!a);
//        System.out.println(!b);
//
//
//    }
//    public static void main(String[] args) {
//        int a =15;
//        boolean result = a > 10 && a < 20;
//        boolean result1 = 10 < a && a < 30;
//        System.out.println("result= " + result);
//    }
//    public static void main(String[] args) {
//        int a= 5;
//        a += 3 ;
//        a -= 2;
//        a *= 4;
//        a /=3;
//        a %= 5;
//
//        System.out.println(a);
//    }
//    public static void main(String[] args) {
//        int num1 =10;
//        int num2 =20;
//        int num3 =30;
//
//        int sum = num3 + num2 + num3;
//
//        int average = sum / 3;
//
//        System.out.println("sum = " + sum);
//        System.out.println("average = " + average);
//    }
//
//    public static void main(String[] args) {
//        double val1 = 1.5;
//        double val2 = 2.5;
//        double val3 = 3.5;
//
//        double sum = val1 + val2 + val3;
//        double average = sum / 3;
//
//        System.out.println(sum);
//        System.out.println(average);
//    }
//
//    public static void main(String[] args) {
//
//        int score = 70;
//            boolean result = (score >= 80 && score <= 100);
//        System.out.println(result);
//
//
//    }
//
//        public static void main(String[] args) {
//        int age = 15;
//
//      if (age >= 18) {
//          System.out.println("성인");
//      }
//      if (age < 18) {
//          System.out.println("미성년");
//      }
//    }
//    public static void main(String[] args) {
//        int age = 20;
//        if (age >= 18) {
//            System.out.println("성인");
//        } else {
//            System.out.println("미성년");
//        }
//    }
//
//    public static void main(String[] args) {
//        int age =14;
//
//        if (age <=7) {
//            System.out.println("미취학");
//        }
//        if (age >= 8 && age <=13) {
//            System.out.println("초딩");
//        }
//        if (age >= 14 && age <=16) {
//            System.out.println("중딩");
//        }
//        if (age >=17 && age <=19) {
//            System.out.println("고딩");
//        } else {
//            System.out.println("대딩");
//        }
//
//        }
//public static void main(String[] args) {
//    int age =21;
//
//    if (age <=7) {
//        System.out.println("미취학");
//    }
//     else if (age <=13) {
//        System.out.println("초등학생");
//    }
//    else if (age <=16) {
//        System.out.println("중딩");
//    }
//    else if (age <=19) {
//        System.out.println("고딩");
//    }
//    else {
//        System.out.println("성인");
////    }
//}
//public static void main(String[] args) {
//    int price =10000;
//    int age =10;
//    int discount =0;
//
//    if (price >= 10000) {
//        discount = discount +1000;
//        System.out.println("10000원이상 구매 ,1000원 할인");
//    }
//
//    if (age <= 10) {
//        discount = discount +1000;
//        System.out.println("10살보다 어리면 ,1000원 할인");
//    }
//    System.out.println("총할인 금액" + discount +"원");
//}
//    public static void main(String[] args) {
//        int price =10000;
//        int age =10;
//        int discount =0;
//
//        if (price >= 10000) {
//            discount = discount +1000;
//            System.out.println("10000원이상 구매 ,1000원 할인");
//        }
//
//         else if (age <= 10) {
//            discount = discount +1000;
//            System.out.println("10살보다 어리면 ,1000원 할인");
//        }
//         else  {
//            System.out.println("할인 없음");
//        }
//        System.out.println("총할인 금액" + discount +"원");
//    }
//    public static void main(String[] args) {
//        int grade = 2;
//        int coupon;
//
//        if (grade == 1) {
//            coupon = 1000;
//        } else if (grade == 2) {
//            coupon = 2000;
//        } else if (grade == 3) {
//            coupon = 3000;
//        } else {
//            coupon = 500;
//        }
//        System.out.println("발급받은 쿠폰" + coupon);
//    }
//
//    public static void main(String[] args) {
//        int grade = 2;
//        int coupon;
//        switch (grade) {
//            case 1:
//                coupon = 1000;
//                break;
//            case 2:
//                coupon = 2000;
//                break;
//                case 3:
//                    coupon = 3000;
//                    break;
//            default: coupon = 500;
//        }
//        System.out.println("발급받은 쿠폰"+coupon);
//    }
//    public static void main(String[] args) {
//        int grade = 2;
//        int coupon;
//        switch (grade) {
//            case 1:
//                coupon = 1000;
//                break;
//            case 2:
//                coupon = 2000;;
//            case 3:
//                coupon = 3000;
//                break;
//            default: coupon = 500;
//        }
//        System.out.println("발급받은 쿠폰"+coupon);
//    }
//public static void main(String[] args) {
//    int grade = 2;
//
//    int coupon =switch (grade){
//        case 1 -> 1000;
//        case 2 -> 2000;
//        case 3 -> 3000;
//        default -> 500;
//    };
//    System.out.println("발급받은 쿠폰"+ coupon);
//}
//public static void main(String[] args) {
//    int age =18;
//    String status;
//
//    if (age >= 18){
//        status ="성인";
//    } else  {
//        status ="미성년자";
//    }
//    System.out.println("age="+age+",status="+status);
//
//
//
//}
//    public static void main(String[] args) {
//        int age =16;
//        String status= (age >= 18) ? "성인" : "미성년";
////
////        if (age >= 18){
////            status ="성인";
////        } else  {
////            status ="미성년자";
////        }
//        System.out.println("age="+age+",status="+status);
//
//
//
//
//    public static void main(String[] args) {
//        int dollar =0;
//
//        if (dollar < 0 ){
//            System.out.println("잘못된 금액입니다");
//        } else if (dollar == 0 ) {
//            System.out.println("환전할금액이 없습니다");
//        } else{
//            int won =dollar *1300;
//            System.out.println("환전금액"+won +"원 입니다.");
//        }
//    }
//public static void main(String[] args) {
//    int dollar = 100;
//
//    if (dollar <0) {
//        System.out.println("환전할 금액이 없습니다");
//    } else if (dollar ==0) {
//        System.out.println("환전할 금액이 없습니다");
//    } else { int won = dollar * 1300;
//        System.out.println("환전할 금액"+won+"원입니다.");
//}
//}
//public static void main(String[] args) {
//    double rating = 8;
//
//    if (rating <=9) {
//        System.out.println("'어바웃 타임'을 추천합니다.");
//    }
//    if (rating <=8) {
//        System.out.println("토이스토리'을 추천합니다.");
//    }
//    if (rating <=7) {
//        System.out.println("'고질아라'을 추천합니다.");
//    }
//
//}
//
//        public static void main(String[] args) {
//            //grade 1:1000, 2:2000, 3:3000, 나머지: 500
//            int grade = 2;
//            int coupon;
//            switch (grade) {
//                case 1:
//                    coupon = 1000;
//                    break;
//                case 2:
//                    coupon = 2000;
//                    break;
//                case 3:
//                    coupon = 3000;
//                    break;
//                default:
//                    coupon = 500;
//            }
//            System.out.println("발급받은 쿠폰 " + coupon);
//        }}
//
//
//    public static void main(String[] args) {
//        String gradeClass = "";
//        String grade = "A";
//
//        switch (grade) {
//            case "A" : gradeClass = "탁월한 성과입니다.";
//                break;
//            case "B": gradeClass ="좋은 성과입니다.";
//                break;
//            case "C"  :gradeClass ="준수한 성과입니다.";
//                ;
//                break;
//            case "D": gradeClass ="준수한 성과입니다.";
//                ;
//                break;
//        }
//        System.out.println(gradeClass);
//    }
//
//    public static void main(String[] args) {
//        String gradeClass = "";
//        String grade = "g";
//
//        switch (grade) {
//            case "A" :
//                System.out.println("탁월한 성과입니다.");
//                break;
//            case "B" :
//                System.out.println("좋은.");
//                break;
//            case "C" :
//                System.out.println("무난한.");
//                ;
//                break;
//            case "D" :
//                System.out.println("괜찮은.");
//                ;
//                break;
//            default :
//                System.out.println("잘못된");
//        }
//    }
//public static void main(String[] args) {
//    int a=30;
//    int b=20;
//    int max = (a>b) ? a:b;
//    System.out.println("더큰 숫자는"+ max+ "입니다");
//}
//
//    public static void main(String[] args) {
//        int x= 3;
//        String result = (x % 2 ==0)? "짝수": "홀수";
//        System.out.println(result);
//    }
//
//        public static void main(String[] args) {
//        int count = 0;
//
//        while (count <=3) {
//            count = count + 1;
//            System.out.println("현재 숫자는:" + count);
//
//        }
//
//    }
//    public static void main(String[] args) {
//        int sum = 0;
//        int i = 1;
//        int endnum = 10;
//
//        while (i <= endnum) {
//            sum = sum + i;
//            System.out.println("i=" + i + " sum=" + sum);
//            i++;
//        }
//    }
//    public static void main(String[] args) {
//        int count =0;
//
//        while (count <3){
//            count += 1;
//            System.out.println("현재 숫자"+count);
//        }
//    }
//    public static void main(String[] args) {
//        int sum = 0;
//        int i = 2;
//        int endNum = 100;
//
//        while (i <= endNum) {
//
//            sum += i;
//            System.out.println("i=" + i + " sum " + sum);
//            i++;
//        }
//    }
//    public static void main(String[] args) {
//        int i = 10;
//        while (i<3){
//            System.out.println("현재 숫자는"+i);
//            i++;
//        }
//    }
//    public static void main(String[] args) {
//        int i = 10;
//        do {
//            System.out.println("현재 숫자는"+i);
//            i++;
//        } while (i<12);
//    }
//    public static void main(String[] args) {
//        int sum = 0;
//        int i = 1;
//
//        while (true){ // while (true) 계속 출혁함  >  break;될때 까지
//            sum += i;
//            if (sum > 100){
//                System.out.println("합이 10보다 크면 종료: i=" + i+ " sum=" + sum);
//                break;
//
//            }
//            i++;
//        }
//        //초기 상태:
//
//    sum = 0
//    i = 1
//    첫 번째 루프 반복:
//
//    sum += i 실행: sum = 0 + 1 = 1
//    if (sum > 10) 조건 확인: 1은 10보다 작으므로 루프 계속
//    i++ 실행: i = 2
//    두 번째 루프 반복:
//
//    sum += i 실행: sum = 1 + 2 = 3
//    if (sum > 10) 조건 확인: 3은 10보다 작으므로 루프 계속
//    i++ 실행: i = 3
//    세 번째 루프 반복:
//
//    sum += i 실행: sum = 3 + 3 = 6
//    if (sum > 10) 조건 확인: 6은 10보다 작으므로 루프 계속
//    i++ 실행: i = 4
//    네 번째 루프 반복:
//
//    sum += i 실행: sum = 6 + 4 = 10
//    if (sum > 10) 조건 확인: 10은 10보다 작으므로 루프 계속
//    i++ 실행: i = 5
//    다섯 번째 루프 반복:
//
//    sum += i 실행: sum = 10 + 5 = 15
//    if (sum > 10) 조건 확인: 15는 10보다 크므로 조건 만족
//    System.out.println("합이 10보다 크면 종료: i= " + i + " sum= " + sum); 실행: "합이 10보다 크면 종료: i= 5 sum= 15" 출력
//    break 실행: 루프 종료
//    }
//    public static void main(String[] args) {
//        int i =1;
//        while (i <= 5) {
//            if (i==3) {
//                i++;
//                continue;
//            }
//            System.out.println(i);
//            i++;
//        }
//    }
//    public static void main(String[] args) {
//        for (int i =1; i <=20; i++ ){
//            System.out.println(i);
//        }
//    }
//    public static void main(String[] args) {
//        int sum =0;
//        int endNum =3;
//
//        for(int i=1; i<=endNum; i++){
//            sum += i;
//            System.out.println("i"+i+" sum= "+sum);
//        }
//    }
//
//        public static void main(String[] args) {
//        int sum = 0;
//
//        for (int i = 1; ;i++ ) { // 무한반복하는 코드
//            sum += i;
//            if (sum > 10) {
//                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
//                break;
//            }
//
//        }
////    }
//public static void main(String[] args) {
//    for (int i = 0; i < 2; i++) {
//        System.out.println("외부for 시작 i:"+ i );
//        for (int j = 0; j < 3; j++) {
//            System.out.println("-> 내부 for "+i +"-"+j);
//        }
//        System.out.println("외부 for 종료 i:"+i);
//        System.out.println();
//    }
//}
//    public static void main(String[] args) {
//        int count = 1;
//
//        while (count <= 10) {
//            System.out.println("count: " + count);
//            count++;
//        }
////    }
//    public static void main(String[] args) {
//
//        for (int count = 1; count <= 10; count++) {
//            System.out.println(count);
//        }
//
//
//    }
//    public static void main(String[] args) {
//        int num = 2;
//        int count = 1;
//
//        while (count<=10) {
//            System.out.println(num);
//        num+= 2;
//        count++;}
//    }
//    public static void main(String[] args) {
//        int num = 2;
//        int count = 1;
//
//        while (count<=10) {
//            System.out.println(num);
//            num+= 2;
//            count++;}
////    }
//    public static void main(String[] args) {
//        int count =1;
//
//        while (count<=10) {
//            System.out.println(2* count);
//            count++;
//        }
////    }
//    public static void main(String[] args) {
//        for (int count = 1, num =2 ; count <= 10; num+=2, count++) {
//            System.out.println(num);}
//    }
//    public static void main(String[] args) {
//        int max =100;
//
//        int sum=0;
//        int i= 1;
//        while (i <=max){
//            sum=sum+i;
//            i++;
//        }
//        System.out.println(sum);
//    }
//}
//    public static void main(String[] args) {
//        int m = 10;
//        if (true) {
//            int x = 20;
//            System.out.println("if m= " +m);
//            System.out.println("if m= " +x);
//        }
//        System.out.println("ma"+x);
//        System.out.println("ma"+m);
//    }
//    public static void main(String[] args) {
//        int m=10;
//        for(int i=0; i<2 ; i++){
//            System.out.println("for m" +m);
//            System.out.println("for i" +i);
//        }
//        System.out.println("mfor m" +m);
//        System.out.println("mfor i" +i);
//    }
//}
//    public static void main(String[] args) {
//        int m =10;
////        int temp =10;
//        if (m>0) {
//            int temp =m *2;
//            System.out.println("temp="+temp );
//        }
////        System.out.println(temp);
//        System.out.println("m="+m);
////    }
//public static void main(String[] args) {
//    int intvalue =10;
//    long longvalue ;
//    double doublevalue ;
//
//    longvalue =intvalue;
//    System.out.println(longvalue);
//
//    doublevalue =intvalue;
//    System.out.println(doublevalue);
//
//    doublevalue =20l;
//    System.out.println(doublevalue);
//
////}
//public static void main(String[] args) {
//    double doubleValue =1.5;
//    int intValue =0;
//
//    intValue=(int) doubleValue;
//    System.out.println(intValue);
//}

//    public static void main(String[] args) {
//        int div1 = 3/2;
//        System.out.println("div1 = " + div1);
//
//        double div2 = 3/2;
//        System.out.println("div2 = " + div2);
//
//        double div3 = 3.0/2;
//        System.out.println("div3 = " + div3);
//
//        double div4 = (double) 3/2;
//        System.out.println("div4 = " + div4);
//
//        int a= 3;
//        int b= 2;
//        double result = (double) a/b;
//        System.out.println("result = " + result);
//    }

}

import org.junit.Test;

/**
 * Date:2018/11/6
 * Author: B.Ye
 * Desc:
 */
public class FizzBuzz {
    @org.junit.Test
    public void test1(){
      for (int i =1;i <= 100;i++){
          if (i%5 == 0 && i%3 ==0){
              System.out.println("FizzBuzz");
              continue;
          }
          if (i%3 ==0 ){
              System.out.println("Fizz");
              continue;
          }
          if (i%5 == 0){
              System.out.println("Buzz");
              continue;
          }
         else {
              System.out.println(i);
          }
      }
    }
    @Test
    public void test2(){
        for (int i =1;i<=100;i++){
            if (i%3 ==0 || (i+"").contains("3") && i%5==0|| (i+"").contains("5")){
                System.out.println("FizzBuzz");
                continue;
            }
            if (i%3 ==0 || (i+"").contains("3") ){
                System.out.println("Fizz");
                continue;
            }
            if (i%5==0|| (i+"").contains("5")){
                System.out.println("Buzz");
                continue;
            }else {
                System.out.println(i);
            }
        }
    }
}

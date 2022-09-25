public class Age {
    /*Используя конструкцию if..else, напишите код, который получает число(возраст), если число меньше 0
            - выводить неверный возрас, от 0 - 18 вы еще не совершеннолетний, 18 и выше вы стали взрослым*/
    int age = (int) (Math.random() * 100);

    public void checkAge(int age){
        if (age <0) {
            System.out.println ("age less than 0");
        } else if (age >=0 & age <18) {
            System.out.println ("you still child");


        } else if (age >=18){
            System.out.println ("you are adult");
        }


    }

    public static void main(String[] args) {
        Age Age=new Age();
        System.out.println(Age.age);
        Age.checkAge(Age.age);
        Age.checkAge((0-Age.age));
    }}

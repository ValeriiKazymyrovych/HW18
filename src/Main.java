public class Main {
    /*Напишите код который будет осуществлять следующую логику.
    Если сотрудник проработал от 1 до 3х лет в компании,
    его зарплата увеличивается на 10%, если от 3x и выше то 20%.
    Если в результате увеличения полученная ЗП меньше 4000 тысяч, сотруднику прибавляется бонус в размере 1000 ,
    а если  4000 и больше плюс 500.*/

    int period;
    Integer salary;
    public int updateSalary(int period, int salary){
        if (period>1 & period<3){
            return (int) (salary+salary*0.1);

        }
        else if (period>=3){
            return (int) (salary+salary*0.2);
        }
        return salary ;
    }
    public int bonus (int salary)
    {
        if (salary <4000){
            return salary+1000;
        }
        else if (salary >=4000){
            return salary+500;
    }
        return salary;
    }

    public static void main(String[] args) {
        Main employee1 =new Main();
        int salary;
        salary = employee1.updateSalary(2,3590);
        System.out.println(employee1.bonus(salary));
    }
}
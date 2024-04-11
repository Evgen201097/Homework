public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задание 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание 6");
        var firstBoxerWeight = 78.2;
        System.out.println("Первый боксер весит " + firstBoxerWeight + " кг");
        var weightSecondBoxer  = 82.7;
        System.out.println("Второй боксер весит " + weightSecondBoxer + " кг");
        var result1WightBoxers = firstBoxerWeight + weightSecondBoxer;
        System.out.println("Общтй вес боксеров " + result1WightBoxers + " кг");
        var result2WightBoxers = firstBoxerWeight - weightSecondBoxer;
        System.out.println("Первый боксер меньше второго на " + result2WightBoxers + " кг");

        System.out.println("Задание 7");
        var advantage = weightSecondBoxer % firstBoxerWeight;
        System.out.println("перевес на " + advantage + " кг");

        System.out.println("Задание 8");
        var openingHours = 640;
        System.out.println(openingHours + " Часов работы всех сотрудников");
        var everyEmployee = 8;
        System.out.println( everyEmployee + " Часов работы одного сотрудника");
        var howLongEmployeesWork = openingHours / everyEmployee;
        System.out.println(howLongEmployeesWork + " Сотрудников работает в компании");
        var human = 94;
        System.out.println(human + " Новых сотрудникоа");
        var totalNumberEmployees = human + howLongEmployeesWork;
        System.out.println(totalNumberEmployees + " Всего сотрудников работает в компании");
        var Employees = totalNumberEmployees * everyEmployee;
        System.out.println(Employees + " Часов работы может быть поделено между сотрудниками");
    }
}
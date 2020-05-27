package ru.geekbrais.homework5;


/*
 Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
* Конструктор класса должен заполнять эти поля при создании объекта;
* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
* Создать массив из 5 сотрудников
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
*/
public class Practice5
{
    public static void main(String[] args)
    {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Vasilyev Vasiluy", "Engineer", "vasv@mail.com", "88888888888", 35000, 35 );
        persArray[1] = new Person("Ivanov Ivan", "Engineer", "ivin@mail.com", "8999224567", 30000, 30 );
        persArray[2] = new Person("Sidorov Sidor", "Analyst", "syds@mail.com", "87777777777", 40000, 41 );
        persArray[3] = new Person("Bogdanov Bogdan", "Salesman", "bogb@mail.com", "86666666666", 45000, 45 );
        persArray[4] = new Person("Stepanov Stepan", "Accountant", "step@mail.com", "85555555555", 50000, 50 );

        persArray[0].printPerson();
        System.out.println();
//        С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        persArray[0].printPerson(40, persArray);      //   1-й способ. Немного нагромождённый. Допустимо ли это по логике?
        System.out.println();
//        С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        System.out.println("Список сотрудников старше " + "40");
        for(int i = 0; i < 5; i++)                                 // 2-й способ. Обычный.
        {
            if(persArray[i].getAge() > 40)
            {
                persArray[i].printPerson();
            }
        }

    }
}

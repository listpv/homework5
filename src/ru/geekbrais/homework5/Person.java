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

public class Person
{
    private String name;
    private String position;
    private String email;
    private String phonenumber;
    private int salary;
    private int age;

    Person(String name, String position, String email, String phonenumber, int salary, int age )
    {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.age = age;
    }

    public void printPerson()        //   Метод, который выводит информацию об объекте в консоль;
    {
        System.out.println("Имя " + name + " Должность " + position + " Email " + email + " Номер телефона " + phonenumber + " Зарплата " + salary + " Возраст " + age);
    }

    public int getAge()
    {
        return age;
    }

    //  С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
    public void printPerson(int age, Person[] array)     //  Немного нагромождённый. Допустимо ли это по логике?
    {
        if(age <= 0)
        {
            System.out.println("Некорректно задан возраст " + age);
            return;
        }
        System.out.println("Список сотрудников старше " + age);
        int j = 0;        //  кол-во сотрудников старше заданного возраста.
        for(int i = 0; i < array.length; i++)
        {
            if(array[i].age > age)
            {
                array[i].printPerson();
                j++;
            }
        }
        System.out.println("Количество сотрудников старше " + age + "  " + j);
    }


}

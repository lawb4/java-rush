package lvl5.Fight;

/*                        // Спасибо Татьяне из комментов на Раше;
Реализовать метод fight   // Используем метод compare() из класса Integer;
*/// Если первое > - возвращает +1, если числа == - 0
// если первое число < второго - возвращает -1;
// Соответственно, равные параметры счёт не изменяют,
// параметры больше, чем у второго кота -
// счёт "победивших" параметров увеличивают, а меньшие - уменьшают
// Если сумма такой проверки всех трех параметров больше нуля - кот "победил". :)

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {          // Экземпляр?

    }
        // метод fight принимает в качестве входящего параметра !один! объект класса Cat
    public boolean fight(Cat anotherCat) { //anotherCat - просто имя переменной
        // здесь может быть другое имя.

        int ageScore = Integer.compare(this.age, anotherCat.age);
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        int strengthScore = Integer.compare(this.strength, anotherCat.strength);

        int score = ageScore + weightScore + strengthScore;
        return score > 0; // return score > 0 ? true : false;  // Прим. JavaRush;
    }


    public static void main(String[] args) {

    }
}

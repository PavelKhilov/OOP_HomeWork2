package ru.geekbrains;

// 1. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
// (например, в миске 10 еды, а кот пытается покушать 15-20).
// 2. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
// Если коту удалось покушать (хватило еды), сытость = true. Считаем, что если коту мало еды в тарелке,
// то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
// 3. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
// и потом вывести информацию о сытости котов в консоль.
// 4. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("Barsik", 5);
//        Plate plate = new Plate(100);
//        plate.info();
//        cat.eat(plate);


        Cat[] cats = {
                new Cat("Барсик", 40),
                new Cat("Мурзик", 20),
                new Cat("Шнурок", 10),
                new Cat("Василек", 2),
                new Cat("Гном", 50),
                new Cat("Усач", 20),
                new Cat("Соня", 12),
                new Cat("Рыжик", 35),
                new Cat("Уголек", 1),
                new Cat("Звездочка", 6),
        };

        Plate plate1 = new Plate(100);

        for (Cat cat: cats) {
            cat.eat(plate1);
        }
        plate1.info();
        System.out.println("===============\n");


        for (Cat cat: cats) {
            if(!cat.isHungry()) {
                plate1.addFood();
                break;
            }
        }
        plate1.info();
        System.out.println("===============\n");

        for (Cat cat: cats) {
            if(!cat.isHungry()) {
                cat.eat(plate1);
            }
        }
        plate1.info();
        System.out.println("===============\n");
    }
}
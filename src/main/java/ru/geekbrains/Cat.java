package ru.geekbrains;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void eat(Plate plate) {
        if(plate.getFood() >= appetite && !hungry) {
            plate.setFood(plate.getFood() - appetite);
            hungry = true;
            System.out.printf("Котик %s покушал. Мур-мур-мур\n", name);
        } else if (hungry){
            System.out.printf("Котик %s не голодный. Важный пошел гулять по своим дела\n", name);
        } else {
            System.out.printf("Котик %s говорит что тарелке мало еды. Мяу-мяу!\n", name);
        }
    }
}

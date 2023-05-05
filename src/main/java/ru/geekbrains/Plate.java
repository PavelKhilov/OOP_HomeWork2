package ru.geekbrains;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        if (food > 0) {
            return food;
        } else {
            throw new RuntimeException("В тарелке нет еды. Пополните запас.\n");
        }
    }

    public void setFood(int food) {
        if (food > 0) {
            this.food = food;
        } else {
            throw new RuntimeException("В тарелке недопустимое колличесвто еды.\n");
        }
    }
    public void info() {
        System.out.println("plate: " + getFood());
    }

    public void addFood () {
        setFood(getFood() + 50);
        System.out.println("В тарелку положили еды. Кись-кись-кись.\n");
    }
}

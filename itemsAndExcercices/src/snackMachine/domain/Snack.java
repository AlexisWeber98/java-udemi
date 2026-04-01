package snackMachine.domain;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
    private static int countSnacks = 0;
    private int idSnack;
    private String name;
    private double price;

 // agregar constructor

    public Snack(){
    this.idSnack = ++Snack.countSnacks;
    }

    // Constructor con argumentos para inicializar el nombre y el precio del snack
    public Snack (String name, double price){
        this(); // Llama al constructor sin argumentos para asignar el idSnack
        this.name = name;
        this.price = price;
    }
    
    public static int getCountSnacks(){
        return countSnacks;
    }

    public int getIdSnack() {
        return this.idSnack;
    }

    public String getName () {
        return this.name;
    }
    public void setName (String name) {
        this.name = name;
    }

    public double getPrice () {
        return this.price;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public String toString() {
        return "Snack { " +
                "idSnack: " + idSnack +
                ", name: '" + name + '\'' +
                ", price: " + price +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(price, snack.price) == 0 && Objects.equals(name, snack.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSnack, name, price);
    }
}


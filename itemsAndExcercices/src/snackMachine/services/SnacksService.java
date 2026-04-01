package snackMachine.services;

import snackMachine.domain.Snack;
import snackMachine.services.ISnacksService;

import java.util.ArrayList;
import java.util.List;

public class SnacksService implements ISnacksService {
    private  static final List<Snack> snacks;

    // bloque estatico inicializador

    static {
        snacks = new ArrayList<>();

        snacks.add( new Snack("Papas", 2.5));
        snacks.add( new Snack("Gaseosa", 4));
        snacks.add( new Snack("Chocolate", 3));
    }

    public  void addSnack (Snack snack) {
        snacks.add(snack);
    }

    public  void showSnacks() {
        String inventory= "";
        for (Snack snack : snacks) {
            inventory += snack.toString() + "\n";
        }

        System.out.println(" -------------------- inventory Snacks----------------- : \n" + inventory);

    }

    public  List<Snack> getSnacks() {
        return snacks;
    }
}

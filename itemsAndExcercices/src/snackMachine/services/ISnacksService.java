package snackMachine.services;

import snackMachine.domain.Snack;

import java.util.List;

public interface ISnacksService {
void addSnack(Snack snack);
void showSnacks();
List<Snack> getSnacks();
}

package src.main.states;

import src.main.VendingMachine;
import src.main.models.Coin;
import src.main.models.Item;

import java.util.List;

public interface VendingMachineState {

    void pressInsertCoinButton(VendingMachine machine) throws Exception;

    void insertCoins(VendingMachine machine, Coin coin) throws Exception;

    void pressItemSelectionButton(VendingMachine machine) throws Exception;

    void selectItems(VendingMachine machine, int codeNumber) throws Exception;

    int getChange(VendingMachine machine, int changeMoney) throws Exception;

    Item dispenseItem(VendingMachine machine, int codeNumber) throws Exception;

    List<Coin> refundFullAmount(VendingMachine machine) throws Exception;

    void pressCancelButton(VendingMachine machine) throws Exception;

    void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;
}

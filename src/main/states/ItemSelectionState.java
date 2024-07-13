package src.main.states;

import src.main.VendingMachine;
import src.main.models.Coin;
import src.main.models.Item;

import java.util.List;

public class ItemSelectionState implements VendingMachineState {
    @Override
    public void pressInsertCoinButton(VendingMachine machine) throws Exception {

    }

    @Override
    public void insertCoins(VendingMachine machine, Coin coin) throws Exception {

    }

    @Override
    public void pressItemSelectionButton(VendingMachine machine) throws Exception {

    }

    @Override
    public void selectItems(VendingMachine machine, int codeNumber) throws Exception {

    }

    @Override
    public int getChange(VendingMachine machine, int changeMoney) throws Exception {
        return 0;
    }

    @Override
    public Item dispenseItem(VendingMachine machine, int codeNumber) throws Exception {
        return null;
    }

    @Override
    public List<Coin> refundFullAmount(VendingMachine machine) throws Exception {
        return List.of();
    }

    @Override
    public void pressCancelButton(VendingMachine machine) throws Exception {

    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {

    }
}

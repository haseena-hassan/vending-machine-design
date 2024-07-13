package src.main.states;

import src.main.VendingMachine;
import src.main.models.Coin;
import src.main.models.Item;

import java.util.List;

public class MachineIdleState implements VendingMachineState {

    MachineIdleState(VendingMachine machine) {
        System.out.println("Vending machine is ready to accept orders. Press 1 to Insert Coins...");
    }

    @Override
    public void pressInsertCoinButton(VendingMachine machine) throws Exception {

    }

    @Override
    public void insertCoins(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You need to press 1 before inserting coins...\n");
    }

    @Override
    public void pressItemSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception();
    }

    @Override
    public void selectItems(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception();
    }

    @Override
    public int getChange(VendingMachine machine, int changeMoney) throws Exception {
        throw new Exception();
    }

    @Override
    public Item dispenseItem(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception();
    }

    @Override
    public List<Coin> refundFullAmount(VendingMachine machine) throws Exception {
        throw new Exception();
    }

    @Override
    public void pressCancelButton(VendingMachine machine) throws Exception {
        throw new Exception();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {

    }
}

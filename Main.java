import java.io.*;

// Abstract class
abstract class Bank implements Serializable {
    abstract int getBalance();
}

// Subclasses
class BankA extends Bank {
    int getBalance() {
        return 100;
    }
}

class BankB extends Bank {
    int getBalance() {
        return 150;
    }
}

class BankC extends Bank {
    int getBalance() {
        return 200;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Create objects
            BankA a = new BankA();
            BankB b = new BankB();
            BankC c = new BankC();

            // Write each object to its own file
            ObjectOutputStream outA = new ObjectOutputStream(new FileOutputStream("bankA.txt"));
            ObjectOutputStream outB = new ObjectOutputStream(new FileOutputStream("bankB.txt"));
            ObjectOutputStream outC = new ObjectOutputStream(new FileOutputStream("bankC.txt"));

            outA.writeObject(a);
            outB.writeObject(b);
            outC.writeObject(c);

            outA.close();
            outB.close();
            outC.close();

            // Read the objects back
            ObjectInputStream inA = new ObjectInputStream(new FileInputStream("bankA.txt"));
            ObjectInputStream inB = new ObjectInputStream(new FileInputStream("bankB.txt"));
            ObjectInputStream inC = new ObjectInputStream(new FileInputStream("bankC.txt"));

            BankA readA = (BankA) inA.readObject();
            BankB readB = (BankB) inB.readObject();
            BankC readC = (BankC) inC.readObject();

            System.out.println("Bank A Balance: " + readA.getBalance());
            System.out.println("Bank B Balance: " + readB.getBalance());
            System.out.println("Bank C Balance: " + readC.getBalance());

            inA.close();
            inB.close();
            inC.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
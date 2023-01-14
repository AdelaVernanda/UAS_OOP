import javax.swing.*;

public class MainProgram {
    JFrame driver;
    JFrame cars;

    MainProgram() {
        driver = new JFrame();
        driver.setSize(500, 300);
        driver.setVisible(true);

        Pengemudi pengemudi = new Pengemudi("Adela", 312110116);
        JOptionPane.showMessageDialog(driver, "Nama : " + pengemudi1.nama + "\n" + "No SIM   : " + pengemudi1.sim);
        driver.dispose();

        cars = new JFrame();
        cars.setSize(500, 300);
        cars.setVisible(true);

        Mobil mobil1 = new Mobil("Lamborghini", "Yellow", 287);
        JOptionPane.showMessageDialog(cars, "Merk Mobil : " + mobil1.merk + "\n" + "Warna Mobil  : " + mobil1.warna + "\n" + "Kecepatan   : " + mobil1.kecepatan + "KM/H");
        cars.dispose();
    }
}
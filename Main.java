import pengguna.*;

class Main {
    public static void main(String[] args) {

        Mhs mhs = new Mhs("username", "password");
        mhs.setNama("Mohammad Tegar Rahmatullah");
        mhs.setNim("G.111.20.0037");
        mhs.setSmt(6);

        System.out.println("Nama Mhs:" + mhs.getNama());
        System.out.println("Nim Mhs:" + mhs.getNim());
        System.out.println("Smt Mhs:" + mhs.getSmt());
       System.out.println("Username:" + mhs.getUsername());
        System.out.println("Password:" + mhs.getPassword());

    }
}
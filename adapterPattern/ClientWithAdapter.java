package adapterPattern;

public class ClientWithAdapter {
    public static void main(String[] args) {
        AdapterServiceA sa1 = new AdapterServiceA();
        AdapterServiceB sb1 = new AdapterServiceB();

        sa1.runService();
        sb1.runService();
    }
}

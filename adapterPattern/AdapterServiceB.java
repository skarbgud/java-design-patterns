package adapterPattern;

public class AdapterServiceB implements AdapterServiceIF{
    ServiceB sb1 = new ServiceB();

    @Override
    public void runService() {
        sb1.runServiceB();
    }
}

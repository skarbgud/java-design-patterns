package adapterPattern;

public class AdapterServiceA implements AdapterServiceIF{
    ServiceA sa1 = new ServiceA();

    @Override
    public void runService() {
        sa1.runServiceA();
    }
}

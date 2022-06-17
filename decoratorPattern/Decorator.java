package decoratorPattern;

public class Decorator implements IService{
    IService service;

    @Override
    public String runSomething() {
        System.out.println("호출에 대한 장식이 주요 목적, 클라이언트에게 반환 결과에 장식을 더하여 전달");
        service = new Service();
        return "***장식품***" + service.runSomething();
    }
}

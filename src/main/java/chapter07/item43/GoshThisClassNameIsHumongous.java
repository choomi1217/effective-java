package chapter07.item43;

import java.util.function.Function;
import java.util.function.Supplier;

public class GoshThisClassNameIsHumongous {

    void action(){
        Service service = new Service();
        service.serve(GoshThisClassNameIsHumongous::goshThisMethodNameIsHumongous);
        service.serve(()->goshThisMethodNameIsHumongous());
    }

    static String goshThisMethodNameIsHumongous() {
        return "GoshThisClassNameIsHumongous.goshThisMethodNameIsHumongous";
    }

    static class Service{
        public void serve(Supplier<String> supplier) {
            System.out.println(supplier.get());
        }
    }

}

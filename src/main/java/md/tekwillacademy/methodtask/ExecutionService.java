package md.tekwillacademy.methodtask;

public class ExecutionService {
    public static void main(String[] args) {

        Customer marcelCustomer = new Customer();

        marcelCustomer.setId(DataGeneratorUtil.generateRandomInt(11566));
        marcelCustomer.setName("Marcel");
        marcelCustomer.setAge(DataGeneratorUtil.generateRandomInt(115));
        marcelCustomer.setAddress("Str Chisinau 23");



        Customer ionelCustomer = new Customer(444,"Ioness dss", "strada Independentei");

        ionelCustomer.setId(DataGeneratorUtil.generateRandomInt(16615));
        ionelCustomer.setName("Ionel Istrati");
        ionelCustomer.setAge(DataGeneratorUtil.generateRandomInt(1156));
        ionelCustomer.setAddress("Str ALba Iulia 33");
        System.out.println(marcelCustomer.getId());
        System.out.println(ionelCustomer.getId());
        System.out.println(ionelCustomer.getAge());

        DataGeneratorUtil.generateRandomInt(60);
        System.out.println(DataGeneratorUtil.generateRandomInt(60));
        System.out.println(DataGeneratorUtil.generateRandomInt(44));
        System.out.println(DataGeneratorUtil.generateRandomInt(11, 13));

        System.out.println(DataGeneratorUtil.returnRandomString("gmail.com"));

        System.out.println(DataGeneratorUtil.returnRandomString("AAJJAKKADD454"));
    }

}

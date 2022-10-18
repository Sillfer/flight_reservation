package dao.passengerDao;

public class PassagerTest {
    public static void main(String[] args) {
        PassagerDaoImpl p = new PassagerDaoImpl();
        //************************* inscription
//        if(p.registerPassager("reda","laghrissi","laghrissi@gmail.com","sdrsdgrfe","0746464547")){
//            System.out.println("Passager added successfuly!!");
//        }

        //************************* login
        System.out.println(p.getPassagerById(1).toString());


    }
}

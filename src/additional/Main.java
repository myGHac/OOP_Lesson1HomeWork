package additional;

public class Main {

    public static void main(String[] args) {

       Address myAddress = new Address();

       myAddress.setIndex(123);
       myAddress.setCountry("UA");
       myAddress.setCity("Kiev");
       myAddress.setStreet("Lucashina");
       myAddress.setApartment(5);
       myAddress.setHouse(45);

System.out.print("Индекс " + myAddress.getIndex() + " Страна " + myAddress.getCountry() + " Город " +myAddress.getCity() + " улица " + myAddress.getStreet()+ " дом " +  myAddress.getHouse()+ " квартира " + myAddress.getApartment());
    }
}

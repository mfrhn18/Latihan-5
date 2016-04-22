public class TugasBT {
    private final String name;
    private final String address;
    private static int count = 0;
    public TugasBT (String n, String a){
        name = n;
        address = a;
        count++;
    }
    public static int getCount(){
        return count;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void displayMessage(){
        System.out.println("-----------  B U K U  T A M U  -----------");
        System.out.println("Nama   : "+name);
        System.out.println("Alamat : "+address);
        System.out.println("------------------------------------------");
    }
}

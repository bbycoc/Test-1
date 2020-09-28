public class TE {
    public static void main(String[] args) {
        First first=new First();
        System.out.println(first.getName());
        first.setId(2);
        first.setName("bby2");
        System.out.println("id"+"---"+first.getId()+"---"+"name"+"---"+first.getName());
    }
}

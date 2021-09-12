public class Program {
    public static void main(String[] args) {
        Ball a= new Ball(10,"Beton");
        Ball b=new Ball(10);
        a.setMaterial("Rubber");
        a.setSize(20);
        System.out.println("Материал= "+a.getMaterial()+" Размер= "+a.getSize());
        System.out.println(b.toString());
    }
}

package properties.polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }
    @Override
    public String toString(){
        return "ObjectPrint{"+"num="+num+"}";
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(3);
//        System.out.println(obj); // it uses object class println which in turn uses String class valueOf which in turn uses Object class toString method. By default every class extends Object class.
        System.out.println(obj); // now it will use the overridden method toString which is in this class only.
    }
}

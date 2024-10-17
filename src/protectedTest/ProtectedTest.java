package protectedTest;


import accessModifiers.ModifierProtected;//protected
import accessModifiers.ModifierPublic;// public

public class ProtectedTest  extends ModifierProtected {
    public static void main(String[] args) {
        ProtectedTest pt=new ProtectedTest();
        pt.display();
        System.out.println(pt.name);

/*
        // use case test of public modifier:
             ModifierPublic mp=new ModifierPublic();
           mp.display();

 */

    }
}

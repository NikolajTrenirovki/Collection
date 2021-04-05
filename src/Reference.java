import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Reference {
    public static void main(String[] args) {
        Object o = new Object();
        WeakReference<Object> weakReference = new WeakReference<>(o);
        System.out.println(weakReference.get());
        o = null;
        System.gc();
        System.out.println(weakReference.get());

        Object c = new Object();
        SoftReference softReference = new SoftReference(c);
        System.out.println(softReference.get());
        c = null;
        System.gc();
        System.out.println(softReference.get());
        
    }
}

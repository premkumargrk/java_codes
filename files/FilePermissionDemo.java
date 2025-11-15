import java.io.FilePermission;
import java.security.Permission;
import java.security.PermissionCollection;

public class FilePermissionDemo {

    public static void main(String[] args) {

        // Creating FilePermission objects
        FilePermission perm1 = new FilePermission("data.txt", "read,write");
        FilePermission perm2 = new FilePermission("data.txt", "read,write");
        FilePermission perm3 = new FilePermission("data.txt", "read");

        System.out.println("=== FilePermission Methods Demo ===\n");

        // 1. hashCode()
        System.out.println("HashCode of perm1: " + perm1.hashCode());
        System.out.println("HashCode of perm2: " + perm2.hashCode());
        System.out.println("HashCode of perm3: " + perm3.hashCode());
        System.out.println();

        // 2. getActions()
        System.out.println("perm1 Actions: " + perm1.getActions());
        System.out.println("perm3 Actions: " + perm3.getActions());
        System.out.println();

        // 3. equals()
        System.out.println("perm1 equals perm2 ? " + perm1.equals(perm2)); // true
        System.out.println("perm1 equals perm3 ? " + perm1.equals(perm3)); // false
        System.out.println();

        // 4. implies()
        System.out.println("Does perm1 imply perm3? " + perm1.implies(perm3)); 
        // true → read,write implies read
        System.out.println("Does perm3 imply perm1? " + perm3.implies(perm1)); 
        // false → read does not imply write
        System.out.println();

        // 5. newPermissionCollection()
        PermissionCollection pc = perm1.newPermissionCollection();
        pc.add(perm1);
        pc.add(perm3);

        System.out.println("PermissionCollection contains:");
        pc.elements().asIterator().forEachRemaining(p ->
                System.out.println("• " + p.getName() + " : " + p.getActions())
        );

        // Checking PermissionCollection implies
        System.out.println("\nCollection implies perm3? " + pc.implies(perm3));
        System.out.println("Collection implies perm1? " + pc.implies(perm1));
    }
}
